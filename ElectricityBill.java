import java.util.Scanner;

class ElectricityBill {
    String consumerNo;
    String consumerName;
    double previousReading;
    double currentReading;
    String connectionType;

    public ElectricityBill(String consumerNo, String consumerName, double previousReading, double currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType;
    }

    public double calculateBill() {
        double unitsConsumed = currentReading - previousReading;
        double billAmount;
        if (connectionType.equalsIgnoreCase("Domestic")) {
            if (unitsConsumed <= 100) billAmount = unitsConsumed * 1.5;
            else if (unitsConsumed <= 300) billAmount = unitsConsumed * 2.0;
            else billAmount = unitsConsumed * 2.5;
        } else {
            if (unitsConsumed <= 100) billAmount = unitsConsumed * 2.0;
            else if (unitsConsumed <= 300) billAmount = unitsConsumed * 3.5;
            else billAmount = unitsConsumed * 5.0;
        }
        return billAmount;
    }

    public void displayBill() {
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + previousReading);
        System.out.println("Current Month Reading: " + currentReading);
        System.out.println("Units Consumed: " + (currentReading - previousReading));
        System.out.println("Connection Type: " + connectionType);
        System.out.printf("Total Bill Amount: %.2f%n", calculateBill());
    }
}

public class ElectricityBillTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Consumer No: ");
        String consumerNo = scanner.nextLine();
        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();
        System.out.print("Enter Previous Month Reading: ");
        double previousReading = scanner.nextDouble();
        System.out.print("Enter Current Month Reading: ");
        double currentReading = scanner.nextDouble();
        System.out.print("Enter Connection Type (Domestic/Commercial): ");
        String connectionType = scanner.next();
        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousReading, currentReading, connectionType);
        bill.displayBill();
        scanner.close();
    }
}