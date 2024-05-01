package Inheritance;

public class Officer extends Worker {
    private String department;
    private String shift;

    Officer(String department, String shift, String name, String phone, String mail) {
        super(name, phone, mail);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work() {
        System.out.println(this.getName() + " is working.");
    }

    @Override
    public void enter(){
        System.out.println("Officer "+this.getName()+" entered the university.");
    }
}
