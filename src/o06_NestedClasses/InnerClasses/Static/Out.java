package o06_NestedClasses.InnerClasses.Static;

public class Out {
    public static int a = 10;

    // inner class
    public static class In {
        public static int a = 8;

        public static void run() {
            int a = 5;
            System.out.println(a); // output : 5
            System.out.println(In.a); // output : 8
            System.out.println(Out.a); // output : 10
        }
    }

    public void run() {
        In.run();
    }

}
