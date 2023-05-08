import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input binary string
        System.out.println("Enter string of binary number");
        String s = sc.next();
        // binary to deical conversion
        System.out.println("The decimal conversion of  " + s + " is " + Integer.parseInt(s, 2));

    }
}
