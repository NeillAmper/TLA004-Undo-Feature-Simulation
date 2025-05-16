package com.mycompany.amper_tla004;

import java.util.*;

public class Amper_TLA004 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Stack<String> actionsStack = new Stack<>();

        while (true) {
            System.out.print("Enter an action (type 'undo' to undo, 'exit' to stop): ");
            String input = myObj.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("undo")) {
                if (!actionsStack.isEmpty()) {
                    String lastAction = actionsStack.pop();
                    System.out.println("You undid \"" + lastAction + "\"");
                } else {
                    System.out.println("Nothing to undo.");
                }
            } else {
                actionsStack.push(input);
                System.out.println("You " + input);
            }
        }
    }
}
