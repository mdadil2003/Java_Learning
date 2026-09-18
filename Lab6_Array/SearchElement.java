package Lab6_Array;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == search) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}