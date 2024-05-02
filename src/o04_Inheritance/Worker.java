package o04_Inheritance;

public class Worker {
    private String name;
    private String phone;
    private String mail;

    Worker(String name, String phone, String mail) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getmail() {
        return mail;
    }

    public void setmail(String mail) {
        this.mail = mail;
    }

    public void enter() {
        System.out.println(this.name + " entered the university.");
    }

    public void exit() {
        System.out.println(this.name + " left the university.");
    }

    public void diningHall() {
        System.out.println(this.name + " entered the university.");
    }

    public static void checkLogin(Worker[] users) {
        for (Worker user : users) {
            user.enter();
        }
    }
}
