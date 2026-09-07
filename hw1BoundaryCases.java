public class hw1BoundaryCases {

    public static String toBinary(int number) {
        return Integer.toBinaryString(number);
    }

    public static String toHex(int number) {
        return Integer.toHexString(number).toUpperCase();
    }

    public static void runBoundaryTests() {

        int zero = 0;
        System.out.println("Zero (0):");
        System.out.println("  Binary: " + toBinary(zero));
        System.out.println("  Hex:    " + toHex(zero));

        int maxVal = Integer.MAX_VALUE;
        System.out.println("\nMax Unsigned/Signed Value (" + maxVal + "):");
        System.out.println("Binary: " + toBinary(maxVal));
        System.out.println("Hex:    " + toHex(maxVal));

        int negVal = -1;
        System.out.println("\nNegative Two's-Complement Value (" + negVal + "):");
        System.out.println("Binary: " + toBinary(negVal));
        System.out.println("Hex:    " + toHex(negVal));
        
        int negVal2 = -42;
        System.out.println("\nNegative Two's-Complement Value (" + negVal2 + "):");
        System.out.println("Binary: " + toBinary(negVal2));
        System.out.println("Hex:    " + toHex(negVal2));
    }

    public static void main(String[] args) {
        runBoundaryTests();
    }
}