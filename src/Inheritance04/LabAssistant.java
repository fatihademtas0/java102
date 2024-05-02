package Inheritance04;

public class LabAssistant extends Assistant {
    public LabAssistant(String name, String phone, String mail, String section, String title, String shift) {
        super(name, phone, mail, section, title, shift);
    }

    public void enterLab() {
        System.out.println(this.getName() + " entered the lab.");
    }
}
