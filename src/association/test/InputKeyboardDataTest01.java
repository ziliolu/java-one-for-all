package association.test;

import java.util.Scanner;

public class InputKeyboardDataTest01 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Hello! Please type your name:");
            String name = scanner.nextLine();

            System.out.println("Please type your age:");
            int age = scanner.nextInt();

            System.out.println("Please type M or F for your gender:");
            char gender = scanner.next().charAt(0);

            System.out.println("------------------");
            System.out.println("Hello, " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Do you confirm your personal data?");
            System.out.println("Please type YES or NO");

            String dataStatus = scanner.next();
            System.out.println("dataStatus: "+ dataStatus);
            if ((dataStatus.equals("YES")) || (dataStatus.equals("yes"))){
                System.out.println("That's perfect! Thank you for your subscription:)");
            } else {
                System.out.println("Let's try again! :( ");
            }



    }
}
