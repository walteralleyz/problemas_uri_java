package com.alleyz.problemas_uri.challenges;

import java.util.Optional;

public enum ChallengesRegister {
    CN_1024("1024", Criptografia::new),
    CN_1120("1120", RevisaoDeContrato::new),
    CN_1168("1168", Led::new);

    private final String number;
    private final ChallengeConfig challengeConfig;

    ChallengesRegister(String number, ChallengeConfig challengeConfig) {
        this.number = number;
        this.challengeConfig = challengeConfig;
    }

    public static Optional<ChallengesRegister> getInstanceByNumber(String number) {
        for(ChallengesRegister register : ChallengesRegister.values()) {
            if(register.number.equalsIgnoreCase(number.trim())) {
                return Optional.of(register);
            }
        }

        return Optional.empty();
    }

    public void run() {
        challengeConfig.create().run();
    }
}
