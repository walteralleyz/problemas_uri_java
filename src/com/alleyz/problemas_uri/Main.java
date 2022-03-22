package com.alleyz.problemas_uri;

import com.alleyz.problemas_uri.challenges.ChallengesRegister;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0 || !args[0].startsWith("--cn")) {
            throw new RuntimeException("Should insert some challenger number at console line!");
        }

        String number = args[0].substring(5);

        Optional<ChallengesRegister> register = ChallengesRegister.getInstanceByNumber(number);

        if(register.isEmpty()) {
            throw new RuntimeException("Cant found the challenge by number");
        }

        register.get().run();
    }
}
