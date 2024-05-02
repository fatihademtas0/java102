package o05_Interface;

public interface IBank {
    final String hostIpAddress = "127.1.1.1";

    boolean connect(String ipAddress);

    boolean payment(double price, String cardNumber, String expireDate, String cvc);
}
