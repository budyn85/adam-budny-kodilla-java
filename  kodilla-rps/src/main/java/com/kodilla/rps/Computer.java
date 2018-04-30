package com.kodilla.rps;

import java.util.Random;

import static com.kodilla.rps.Choices.PAPER;
import static com.kodilla.rps.Choices.ROCK;
import static com.kodilla.rps.Choices.SCISSORS;

public class Computer {
    private Random random;

    public Computer() {
        super();
        random = new Random();
    }

    public Choices getChoice() {
        int choice = 1 + random.nextInt(3);

        switch (choice) {
            case 1:
                return ROCK;
            case 2:
                return PAPER;
        }
                return SCISSORS;
    }
}

