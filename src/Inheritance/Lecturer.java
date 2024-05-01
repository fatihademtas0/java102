package Inheritance;

public class Lecturer extends Instructor {
    private String doorNo;

    public Lecturer(String name, String phone, String mail, String section, String title, String doorNo) {
        super(name, phone, mail, section, title);
        this.doorNo = doorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public void meeting() {
        System.out.println(this.getName() + " attended to the meeting.");
    }

    public void makeExam() {
        System.out.println(this.getName() + " made an exam.");
    }
}
