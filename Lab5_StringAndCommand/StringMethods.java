package Lab5_StringAndCommand;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Adil Raza";
        System.out.println("Original String : " + str);
        System.out.println("Length : " + str.length());
        System.out.println("Upper Case : " + str.toUpperCase());
        System.out.println("Lower Case : " + str.toLowerCase());
        System.out.println("Character at Index 2 : " + str.charAt(2));
        System.out.println("Substring from Index 5 : " + str.substring(5));
        System.out.println("Index of R : " + str.indexOf('R'));
        System.out.println("Contains Raza : " + str.contains("Raza"));
        System.out.println("Equals : " + str.equals("Adil Raza"));
    }
}
