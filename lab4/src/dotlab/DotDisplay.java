package dotlab;

import java.lang.reflect.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class DotDisplay extends JFrame implements ActionListener {

    private ArrayList<Dot> dots;
    private DotPanel dotPanel;
    private JButton readBtn;
    private JButton quitBtn;

    public DotDisplay() {
        dots = new ArrayList<>();

        // Init GUI: DotPanel at center, control panel at north.
        dotPanel = new DotPanel();
        add(dotPanel, BorderLayout.CENTER);

        JPanel controls = new JPanel();

        readBtn = new JButton("Read...");
        readBtn.addActionListener(this);
        controls.add(readBtn);

        quitBtn = new JButton("Quit");
        quitBtn.addActionListener(this);
        controls.add(quitBtn);

        add(controls, BorderLayout.NORTH);
        pack();
    }

    // Add a dot to the display list.
    public void addDot(Dot dot) {
        dots.add(dot);
    }

    private void read(File f) throws IOException, DotException {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        DotReader reader = new DotReader(br);
        Dot dot = reader.readDot();

        while (dot != null) {
            addDot(dot);
            dot = reader.readDot();
        }

        br.close();
        fr.close();
    }

    // Process a button click in the control panel.
    public void actionPerformed(ActionEvent e) {

        // Quit.
        if (e.getSource() == quitBtn) {
            System.exit(0);
        }

        // Read.
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);

        File f = chooser.getSelectedFile();

        if (f == null) {
            return;
        }

        System.out.println("Reading " + f.getAbsolutePath());

        try {
            dots.clear();
            read(f);
            dotPanel.repaint();

        } catch (IOException x) {
            System.out.println("Couldn't read file " + f);

        } catch (DotException x) {
            System.out.println(x.getMessage());
        }
    }

    // Inner class
    private class DotPanel extends JPanel {

        public Dimension getPreferredSize() {
            return new Dimension(800, 600);
        }

        public void paintComponent(Graphics g) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 3000, 3000);

            for (Dot dot : dots) {
                g.setColor(Color.LIGHT_GRAY);

                try {
                    Field field = Color.class.getField(dot.getColorName());
                    Color fill = (Color) field.get(null);
                    g.setColor(fill);

                } catch (NoSuchFieldException | IllegalAccessException x) {
                    // Keep the color as light gray.
                }

                int ulx = dot.getX() - dot.getRadius();
                int uly = dot.getY() - dot.getRadius();

                g.fillOval(
                    ulx,
                    uly,
                    2 * dot.getRadius(),
                    2 * dot.getRadius()
                );
            }
        }
    }

    public static void main(String[] args) {
        new DotDisplay().setVisible(true);
    }
}