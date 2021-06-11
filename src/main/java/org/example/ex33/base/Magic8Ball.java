package org.example.ex33.base;

import java.util.concurrent.ThreadLocalRandom;

public class Magic8Ball {
    public String fortune() {
        String[] fortunes = {"Yes.", "No.", "Maybe.", "Ask again later."};
        int randomIndex = ThreadLocalRandom.current().nextInt(0, 4);
        return fortunes[randomIndex];
    }
}
