import java.util.*;
class CurrencyConverter {
        public void convert() {
            double dollarToInr = 83.0;  
            System.out.println("Currency Converter:");
            System.out.println("1. Dollar to INR");
            System.out.println("2. INR to Dollar");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            
            switch (choice) {
                case 1:
                    System.out.println(amount + " Dollar = " + (amount * dollarToInr) + " INR");
                    break;
                case 2:
                    System.out.println(amount + " INR = " + (amount / dollarToInr) + " Dollar");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
    class DistanceConverter {
        public void convert() {
            double meterToKm = 0.001;
            System.out.println("Distance Converter:");
            System.out.println("1. Meter to KM");
            System.out.println("2. KM to Meter");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            System.out.print("Enter distance: ");
            double distance = scanner.nextDouble();
    
            switch (choice) {
                case 1:
                    System.out.println(distance + " Meter = " + (distance * meterToKm) + " KM");
                    break;
                case 2:
                    System.out.println(distance + " KM = " + (distance / meterToKm) + " Meter");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
    
    class TimeConverter {
        public void convert() {
            System.out.println("Time Converter:");
            System.out.println("1. Hours to Minutes");
            System.out.println("2. Minutes to Hours");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            System.out.print("Enter time: ");
            double time = scanner.nextDouble();
    
            switch (choice) {
                case 1:
                    System.out.println(time + " Hours = " + (time * 60) + " Minutes");
                    break;
                case 2:
                    System.out.println(time + " Minutes = " + (time / 60) + " Hours");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
        public class ConverterApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Choose converter:");
            System.out.println("1. Currency Converter");
            System.out.println("2. Distance Converter");
            System.out.println("3. Time Converter");
    
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    CurrencyConverter currencyConverter = new CurrencyConverter();
                    currencyConverter.convert();
                    break;
                case 2:
                    DistanceConverter distanceConverter = new DistanceConverter();
                    distanceConverter.convert();
                    break;
                case 3:
                    TimeConverter timeConverter = new TimeConverter();
                    timeConverter.convert();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            
        }
    }