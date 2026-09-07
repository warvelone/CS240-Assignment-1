import java.util.Scanner;
public class hw1BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What base are you inputting from? (1. Binary, 2. Decimal, 3. Octal, 4. Hexadecimal): ");
        int inputBase = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter value of number you want to convert: ");
        String number = scanner.nextLine().trim();

try {
            if (inputBase == 1) {
                // Input is Binary (only 0 and 1 allowed)
                int num = Integer.parseInt(String.valueOf(number), 2);
                System.out.println("Decimal: " + num);
                System.out.println("Octal:   " + Integer.toOctalString(num));
                System.out.println("Hex:     " + Integer.toHexString(num).toUpperCase());

            } else if (inputBase == 2) {
                // Input is Decimal (digits 0-9 allowed)
                int num = Integer.parseInt(String.valueOf(number));
                System.out.println("Binary: " + Integer.toBinaryString(num));
                System.out.println("Octal:  " + Integer.toOctalString(num));
                System.out.println("Hex:    " + Integer.toHexString(num).toUpperCase());

            } else if (inputBase == 3) {
                // Input is Octal (digits 0-7 allowed)
                int num = Integer.parseInt(String.valueOf(number), 8);
                System.out.println("Binary:  " + Integer.toBinaryString(num));
                System.out.println("Decimal: " + num);
                System.out.println("Hex:     " + Integer.toHexString(num).toUpperCase());

            } else if (inputBase == 4) {
                // Input is Hexadecimal (digits 0-9, A-F allowed)
                int num = Integer.parseInt(String.valueOf(number), 16);
                System.out.println("Binary:  " + Integer.toBinaryString(num));
                System.out.println("Octal:   " + Integer.toOctalString(num));
                System.out.println("Decimal: " + num);

            } else {
                System.out.println("Invalid choice selection.");
            }
        } catch (NumberFormatException e) {
            System.out.println("\nError: '" + number + "' contains invalid digits for the selected base!");
        }

        scanner.close();
    }
}
