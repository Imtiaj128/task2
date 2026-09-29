import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int length;
        int width;
        double price;

        System.out.print("Enter length: ");
        length = input.nextInt();

        System.out.print("Enter width: ");
        width = input.nextInt();

        System.out.print("Enter price per square meter: ");
        price = input.nextDouble();

        int area = length * width;

        double areaWithWaste = area * 1.05;

        double totalCost = areaWithWaste * price;

        System.out.println("Total cost = " + totalCost);
    }
}