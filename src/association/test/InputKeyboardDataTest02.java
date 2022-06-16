package association.test;

import java.util.Scanner;

public class InputKeyboardDataTest02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Welcome to the game!");
        System.out.println("Ask me any question and I shall reply yes or no :)");
        String question = sc.nextLine();
        if (question.charAt(0) == ' '){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
