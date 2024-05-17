package o07_Generic;

public class Nullable {
    private final String value;

    public Nullable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean isNull() {
        return this.value == null;
    }

    public void run() {
        if (isNull()) {
            System.out.println("This variable is null !");
        } else
            System.out.println(this.value);
    }
}
