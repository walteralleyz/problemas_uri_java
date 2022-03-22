package com.alleyz.problemas_uri.challenges;

import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Criptografia extends Challenge {

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);

        int times = Integer.parseInt(in.nextLine().trim());

        for(int i = 0; i < times; i++) {
            String text = in.nextLine();
            System.out.println(applyCrypto(text));
        }

        in.close();
    }

    public String applyCrypto(String text) {
        String crypto = getCharsTransformed(text, 3, true);
        crypto = new StringBuilder(crypto).reverse().toString();

        return crypto.substring(0, crypto.length()/2)
            + getCharsTransformed(crypto.substring(crypto.length()/2), -1, false);
    }

    public String getCharsTransformed(String text, int sum, boolean filtered) {
        Function<Integer, Boolean> rule = el -> (el >= 65 && el <= 90) || (el >= 97 && el <= 122);

        return text.chars()
            .map(el -> filtered ? rule.apply(el) ? el + sum : el : el + sum)
            .boxed()
            .map(el -> (char) el.intValue())
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}
