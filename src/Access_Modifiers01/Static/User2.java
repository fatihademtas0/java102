package Access_Modifiers01.Static;

public class User2 {
    public String name;
    public static int counter;

    static {
        int random = (int) (Math.random() *10);
        System.out.println("Random Number = "+random);
        counter = random;
    }

    public User2(String name) {
        this.name = name;
        counter++;
    }
}
