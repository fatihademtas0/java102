package o04_Inheritance;

public class Instructor extends Worker {
    private String section;
    private String title;

    Instructor(String name, String phone, String mail, String section, String title) {
        super(name, phone, mail);
        this.section = section;
        this.title = title;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void attendClass(Worker worker) {
        System.out.println(worker.getName() + " attended to class.");
    }

    @Override
    public void enter() {
        System.out.println("Instructor " + this.getName() + " entered the university.");
    }
}
