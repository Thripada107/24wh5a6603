import java.util.Scanner;

    public class StringMerger {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first string (s1): ");
            String s1 = scanner.nextLine();
    
            System.out.print("Enter second string (s2): ");
            String s2 = scanner.nextLine();
            String mergedString = mergeStrings(s1, s2);
            System.out.println("Merged String: " + mergedString);
            scanner.close(); 
        }
        public static String mergeStrings(String s1, String s2) {
            StringBuilder merged = new StringBuilder();
            int length1 = s1.length();
            int length2 = s2.length();
            int minLength = Math.min(length1, length2);
            for (int i = 0; i < minLength; i++) {
                merged.append(s1.charAt(i));
                merged.append(s2.charAt(i));
            }
            if (length1 > minLength) {
                merged.append(s1.substring(minLength));
            } else if (length2 > minLength) {
                merged.append(s2.substring(minLength));
            }
    
            return merged.toString();
        }
    }

