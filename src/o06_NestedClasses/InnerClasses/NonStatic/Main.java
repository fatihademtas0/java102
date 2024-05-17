package o06_NestedClasses.InnerClasses.NonStatic;

public class Main {
    public static void main(String[] args) {
        Out out = new Out();

        out.run();

        // to create an object of inner class

        Out.In inObject = out.new In();

        inObject.run();

        // alternative

        Out.In inObject2 = out.getIn();
    }

}
