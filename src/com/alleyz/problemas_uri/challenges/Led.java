package com.alleyz.problemas_uri.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Led extends Challenge {

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        Map<Character, Integer> ledConfig = new HashMap<>();
        ledConfig.put('0', 6);
        ledConfig.put('1', 2);
        ledConfig.put('2', 5);
        ledConfig.put('3', 5);
        ledConfig.put('4', 4);
        ledConfig.put('5', 5);
        ledConfig.put('6', 6);
        ledConfig.put('7', 3);
        ledConfig.put('8', 7);
        ledConfig.put('9', 6);

        int times = Integer.parseInt(in.nextLine().trim());

        for(int i = 0; i < times; i++) {
            String presentation = in.nextLine().trim();
            int led = presentation.chars()
                .map(uni -> ledConfig.get((char) uni))
                .sum();

            System.out.printf("%d leds%n", led);
        }
    }
}
