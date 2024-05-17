package o06_NestedClasses.Anonymus;


public class Main {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void run() {
                System.out.println("ANONYMUS !");
            }
        };

        a.run();
    }
}
