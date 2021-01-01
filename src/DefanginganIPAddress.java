
public class DefanginganIPAddress {

    public static void main(String[] args) {
	String address = "1.1.1.1";
	String output = defangIPaddr(address);
    }

    public static String defangIPaddr(String address) {
	return address.replace(".", "[.]");
    }

}
