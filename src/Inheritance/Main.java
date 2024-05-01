package Inheritance;

public class Main {
    public static void main(String[] args) {

        Worker wr1 = new Worker("Fatih", "05555555555", "abcde.com");
        Worker wr2 = new Worker("Esra", "05555555555", "abcde.com");

        Instructor int1 = new Instructor("Fatih", "05512632222", "abcde", "CENG", "Prof");

        System.out.println(wr1.getName());

        int1.attendClass(wr2);

        int1.enter();
        int1.exit();

        Officer ofc1 = new Officer("CENG", "09-17", "Mehmet", "05555555555", "abcde");

        ofc1.setDepartment("PHYSİC");
        System.out.println(ofc1.getDepartment());

        ofc1.enter();
        ofc1.work();

        //******** this can be done but object ofc2 can not reach the methods of the officer class
        Worker ofc2 = new Officer("SPORT", "10-18", "Yusuf", "06666666666", "abcde");
        //ofc2.work(); NOT WORKİNG

        ofc2.enter();

    }
}
