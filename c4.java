import java.util.Scanner;

public class c4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        int age = scanner.nextInt();

        System.out.println("Você é emancipado? (true/false)");
        boolean isEmancipado = scanner.nextBoolean();

        boolean canDrive = age >= 18 || (isEmancipado && age >= 16);
        System.out.printf("Você pode dirigir? (%s)%n", canDrive);

        dirigirPrompt(scanner); // chama o segundo método

        scanner.close();
    }

    public static void dirigirPrompt(Scanner scanner) {
        System.out.println("Você pode dirigir?");
        int age = scanner.nextInt();
        boolean canDrive = age >= 18;
        System.out.printf("Você pode dirigir (%s)%n", canDrive);
    }
}
