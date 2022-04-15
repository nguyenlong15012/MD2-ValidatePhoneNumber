public class NumPhoneExampleTest {
    private static NumPhoneExample numPhoneExample;
    private static final String[] validPhone = new String[] {"0937300005", "0393024000","0338681256","0964615635"};
    private static final String[] invalidPhone = new String[] {"a85610.013","as2151264132","921214.25","Long1201"};

    public static void main(String[] args) {
        numPhoneExample = new NumPhoneExample();
        for (String phone : validPhone){
            boolean isvalid = numPhoneExample.validate(phone);
            System.out.println("NumberPhone is " + phone + " is valid: " + isvalid);
        }

        for (String phone : invalidPhone){
            boolean isvalid = numPhoneExample.validate(phone);
            System.out.println("NumberPhone is " + phone + "is valid: " + isvalid);
        }
    }
}
