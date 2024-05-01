package Inheritance;

public class InfoTech extends Officer {
    private String mission;

    public InfoTech(String department, String shift, String name, String phone, String mail, String mission) {
        super(department, shift, name, phone, mail);
        this.mission = mission;
    }

    public String getMission() {
        return mission;
    }

    public void setMission() {
        this.mission = mission;
    }

    public void network() {
        System.out.println(this.getName() + " built the network.");
    }
}
