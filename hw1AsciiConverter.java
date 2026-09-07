public class hw1AsciiConverter {
    public static void main(String[] args) {
        String s = "CS 240: Computer Organization";

        for (Character c : s.toCharArray()) {
            System.out.println((int)c);
        }
    }
}
