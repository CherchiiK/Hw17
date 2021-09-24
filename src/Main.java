import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers using a space between them: ");
        String str = scanner.nextLine();
        PrimeNumbers.checkNumbers(str);
    }
}