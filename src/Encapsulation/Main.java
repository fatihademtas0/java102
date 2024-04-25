package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 850);

        Book lotr = new Book("Lord Of The Rings", -90);

        // harryPotter.pageNumber = 900; not working because pageNumber is private
        // all other variables are private
        // we can only access them with methods

        harryPotter.setName("Hayri"); // changes name
        System.out.println(harryPotter.getName());

        lotr.setPageNumber(1800); // changes page number
        System.out.println(lotr.getPageNumber());

    }
}
