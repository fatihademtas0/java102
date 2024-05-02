package Access_Modifiers01.Final;

public class Calculate {
    public int r;
    public static final double PI_NUMBER = 3.14; // makes the variable a constant

    public Calculate(int r) {
        this.r = r;
    }

    public void calcArea() {
        double area = r * r * Calculate.PI_NUMBER; // because of static

        System.out.println("Cirles Area = " + area);
    }
}
