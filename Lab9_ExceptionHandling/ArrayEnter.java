package Lab9_ExceptionHandling;
import java.util.Scanner;
public class ArrayEnter {
    public static void main(String[] args) {
       ArrayEnter obj = new ArrayEnter();
       obj.arrEnter();
    }
    void arrEnter()
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the index: ");
            int x = sc.nextInt();
            System.out.println(arr[x]);
        }
        catch (NegativeArraySizeException ex)
            {
            System.out.println("size of array is not be negative");
            }
        catch (ArrayIndexOutOfBoundsException ex)
            {
            System.out.println("Index out of bounds");
            }
    }
}
