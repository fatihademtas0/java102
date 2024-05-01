package Inheritance;

public class Security extends Officer {
    private String document;

    public Security(String name, String phone, String mail, String department, String shift, String document) {
        super(name, phone, mail, department, shift);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument() {
        this.document = document;
    }

    public void guard() {
        System.out.println(this.getName() + " stood guard.");
    }

    @Override
    public void enter() {
        System.out.println("Security " + this.getName() + " entered the university.");
    }
}
