package o05_Interface;

public class BBank implements IBank {
    private String bankName;
    private String terminalId;
    private String password;

    public BBank(String bankName, String terminalId, String password) {
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Connected to the " + this.getBankName());
        System.out.println("Users ip address : " + ipAddress);
        System.out.println("Host ip address : " + hostIpAddress);
        return false;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expireDate, String cvc) {
        System.out.println();
        return false;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
