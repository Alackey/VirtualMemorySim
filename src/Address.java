public class Address {
    private int prefix;
    private String address;
    private int value;

    public Address(int prefix, String address) {
        this.prefix = prefix;
        this.address = address;
    }

    public Address(int prefix, String address, int value) {
        this.prefix = prefix;
        this.address = address;
        this.value = value;
    }

    public int getPrefix() {
        return prefix;
    }

    public String getAddress() {
        return address;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        String output = "Address: " + prefix + " " + address;
        if (prefix == 1) {
            return output + " " + value;
        }
        return output;
    }
}
