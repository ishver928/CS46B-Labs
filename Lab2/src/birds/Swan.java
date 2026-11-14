package birds;

public class Swan extends Bird {

    public void glide() {
        System.out.println("I'm Graceful");
    }

    public static void main(String[] args) {
        Bird duck = new Duck();
        Swan s = new Swan();
        Bird b = s;

        Duck d1 = (Duck) duck;
        d1.quack();

        //Duck d = (Duck) b;
        //d.quack();
    }
}