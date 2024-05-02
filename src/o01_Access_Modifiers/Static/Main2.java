package o01_Access_Modifiers.Static;

public class Main2 {
    public static void main(String[] args) {
        User2 user1 = new User2("Fatih");

        User2 user2 = new User2("Esra");

        User2 user3 = new User2("Talha");

        System.out.println(User2.counter);

        // it generates a random number
        // we call User2 class 3 times
        // it adds to the random number that how many times we called
        // because of the static code block

    }
}
