import java.util.Scanner;

public class TransformersMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Transformers Quote Menu =====");
        System.out.println("1. Optimus Prime");
        System.out.println("2. Bumblebee");
        System.out.println("3. Megatron");
        System.out.println("4. Ironhide");
        System.out.print("Enter your choice (1-4): ");

        int choice = input.nextInt();

        System.out.println();

        switch (choice) {
            case 1:
                System.out.println("\"Freedom is the right of all sentient beings.\" – Optimus Prime");
                break;
            case 2:
                System.out.println("\"I wish to stay with the boy.\" – Bumblebee");
                break;
            case 3:
                System.out.println("\"Peace through tyranny!\" – Megatron");
                break;
            case 4:
                System.out.println("\"We’re Autobots. We don’t run.\" – Ironhide");
                break;
            default:
                System.out.println("Invalid choice. Please run the program again and choose 1–4.");
        }

        input.close();
    }
}

