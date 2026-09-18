// String and command line argument Lab

package Lab5_StringAndCommand;

import java.util.*;
public class CapitalFirstLetter {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String[] names = new String[5];
            System.out.println("Enter 5 names:");
            for (int i = 0; i < 5; i++) {
                names[i] = sc.nextLine();
            }
            System.out.println("\nAfter Conversion:");
            for (int i = 0; i < 5; i++) {
                char first = names[i].charAt(0);
                if (first >= 'a' && first <= 'z') {
                    first = (char) (first - 32);
                }
                String result = first + names[i].substring(1);
                System.out.println(result);
            }
        }
}

