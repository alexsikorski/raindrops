package com.sparta.as.testutil;

import java.util.Random;

public class RandomIntArrayGenerator {

    public static int[] generateRandomNumbersOfFactor(int size, int... factors) {

        boolean factor3 = false;
        boolean factor5 = false;
        boolean factor7 = false;

        for (int factor : factors) {
            switch (factor) {
                case 3:
                    factor3 = true;
                case 5:
                    factor5 = true;
                case 7:
                    factor7 = true;
            }
        }

        if (factor3) return new Random().ints()
                .filter(n -> (n % 3) == 0 && (n % 5) != 0 && (n % 7) != 0)
                .limit(size)
                .toArray();

        if (factor5) return new Random().ints()
                .filter(n -> (n % 3) != 0 && (n % 5) == 0 && (n % 7) != 0)
                .limit(size)
                .toArray();

        if (factor7) return new Random().ints()
                .filter(n -> (n % 3) != 0 && (n % 5) != 0 && (n % 7) == 0)
                .limit(size)
                .toArray();

        return null;
    }
}
