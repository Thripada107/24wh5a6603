public class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("12345", "Hammer", 5, 12.99);
        System.out.printf("Invoice Amount: %.2f%n", invoice.getInvoiceAmount());
    }
    
}
