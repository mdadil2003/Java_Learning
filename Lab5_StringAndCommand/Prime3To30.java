package Lab5_StringAndCommand;

public class Prime3To30 {
    public static void main(String[] args) {
        for(int n = 3; n <= 30; n++) {
            boolean prime = true;
            for(int i = 2; i < n; i++) {

                if(n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) {
                System.out.println(n);
            }
        }
    }
}
