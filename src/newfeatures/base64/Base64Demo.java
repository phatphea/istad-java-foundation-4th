package newfeatures.base64;

import java.util.Base64;

public class Base64Demo {

    public static void main(String[] args) {

        String password = "Admin@123";
        System.out.println("Password before Encode: " + password);

        byte[] encode = Base64.getEncoder().encode(password.getBytes());
        String encodedString = new String(encode);
        System.out.println("Encoded Password: " + encodedString);

        byte[] decode = Base64.getDecoder().decode(encodedString);
        String decoded = new String(decode);
        System.out.println("Decoded Password: " + decoded);


    }

}
