package com.example.best_travel.util;

import java.time.LocalDateTime;
import java.util.Random;

public final class BestTravelUtil {

    private static final Random random = new Random();

    public static LocalDateTime getRandomSoon() {
        var randomHours = random.nextInt(5 - 2) + 2;
        var now = LocalDateTime.now();
        return now.plusHours(randomHours);
    }

    public static LocalDateTime getRandomLatter() {
        var randomHours = random.nextInt(12 -6) + 6;
        var now = LocalDateTime.now();
        return now.plusHours(randomHours);
    }

}
