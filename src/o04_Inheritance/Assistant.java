package o04_Inheritance;

public class Assistant extends Instructor {
    private String shift;

    public Assistant(String name, String phone, String mail, String section, String title, String shift) {
        super(name, phone, mail, section, title);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void makeQuiz() {
        System.out.println(this.getName() + " made a quiz.");
    }
}
