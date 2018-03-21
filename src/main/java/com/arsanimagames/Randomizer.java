package com.arsanimagames;

import java.util.Random;

public abstract class Randomizer {
    int numberOfVariants;

    int nextVariant() {
        Random random = new Random();
        return random.nextInt(numberOfVariants) + 1;
    }
}
