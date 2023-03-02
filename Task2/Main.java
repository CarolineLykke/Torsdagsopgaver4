import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Please type your name:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! Please type your age:");

        int age = scanner.nextInt();
        System.out.println("You entered: " + age);

        int yearsToRetire = 67 - age;
        System.out.println("You have " + yearsToRetire + " years until retirement.");
    }
}
