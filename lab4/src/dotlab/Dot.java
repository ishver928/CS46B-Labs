package dotlab;

public class Dot {

    private static String[] LEGAL_COLOR_NAMES = {
        "RED", "YELLOW", "BLUE", "CYAN",
        "GREEN", "MAGENTA", "ORANGE", "BLACK"
    };

    private String color;
    private int x;
    private int y;
    private int radius;

    public Dot(String color, int x, int y, int radius) {
        boolean isLegal = false;

        for (int i = 0; i < LEGAL_COLOR_NAMES.length; i++) {
            if (color.equals(LEGAL_COLOR_NAMES[i])) {
                isLegal = true;
                break;
            }
        }

        if (!isLegal) {
            throw new IllegalArgumentException(
                color + " is a bad color name"
            );
        }

        this.color = color;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public String getColorName() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Dot[color=" + color
            + ", x=" + x
            + ", y=" + y
            + ", radius=" + radius + "]";
    }

    public static void main(String[] args) {
        // Dot dot1 = new Dot("PINK", 3, 4, 5);

        Dot dot2 = new Dot("RED", 3, 4, 5);
        System.out.println(dot2);
    }
}