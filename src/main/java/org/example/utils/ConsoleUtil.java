package org.example.utils;

import java.util.Scanner;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class ConsoleUtil {
    private final Scanner input = new Scanner(System.in);


    public String captureString(String message) {
        System.out.println(message);
        return input.nextLine();
    }

    public Integer captureInteger(String message) {
        System.out.println(message);
        Integer value = 0;
        try{
            value = input.nextInt();
            input.nextLine();
        }catch (NumberFormatException e){
            captureInteger(message);
        }
        return value;
    }

    public boolean captureBoolean(String message) {
        System.out.println(message);
        return input.nextLine().equalsIgnoreCase("si");
    }
}
