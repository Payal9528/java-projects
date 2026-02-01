import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += sitr.charAt(i);
        }

        System.out.println("REVERSE STRING: " + rev);
        sc.close();
    }
}
