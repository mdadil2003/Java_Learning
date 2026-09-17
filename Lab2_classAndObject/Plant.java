package Lab2_classAndObject;
import java.util.Scanner;

public class Plant {

    String plantName;
    int soilMoisture;
    int temperature;

    void displayStatus() {

        if (temperature > 35) {
            System.out.println("Plant Status: Too Hot");
        }
        else if (soilMoisture < 30) {
            System.out.println("Plant Status: Needs Water");
        }
        else if (soilMoisture > 70) {
            System.out.println("Plant Status: Overwatered");
        }
        else {
            System.out.println("Plant Status: Healthy");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Plant p = new Plant();

        System.out.print("Enter Plant Name: ");
        p.plantName = sc.nextLine();

        System.out.print("Enter Soil Moisture: ");
        p.soilMoisture = sc.nextInt();

        System.out.print("Enter Temperature: ");
        p.temperature = sc.nextInt();

        System.out.println("\nPlant Name: " + p.plantName);
        p.displayStatus();

        sc.close();
    }
}