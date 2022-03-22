package com.alleyz.problemas_uri.challenges;

import java.util.Scanner;

public class RevisaoDeContrato extends Challenge {

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        String l;

        while(!(l = in.nextLine()).trim().equalsIgnoreCase("0 0")) {
            String[] failAndWord = l.split(" ");

            String temp = failAndWord[1].replace(failAndWord[0], "");
            temp = temp.replaceFirst("0*", "");

            System.out.println(temp.length() > 0 ? temp : 0);
        }

        in.close();
    }
}
