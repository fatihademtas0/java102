package o06_NestedClasses.InnerClasses.NonStatic;

// outer class
public class Out {
    public int a = 10;

    // inner class
    public class In {
        public int a = 8;

        public void run() {
            int a = 5;
            System.out.println(a); // output : 5
            System.out.println(this.a); // output : 8
            System.out.println(Out.this.a); // output : 10
        }
    }

    public void run() {
        In in = new In();
        in.run();
    }

    public In getIn() {
        return new In();
    }
}
