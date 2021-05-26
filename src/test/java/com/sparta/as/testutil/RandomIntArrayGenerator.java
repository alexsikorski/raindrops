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
                    break;
                case 5:
                    factor5 = true;
                    break;
                case 7:
                    factor7 = true;
                    break;
            }
        }

        // Pling
        if (factor3 && !factor5 && !factor7) return new Random().ints()
                .filter(n -> (n % 3) == 0 && (n % 5) != 0 && (n % 7) != 0)
                .limit(size)
                .toArray();

            // Plang
        else if (!factor3 && factor5 && !factor7) return new Random().ints()
                .filter(n -> (n % 3) != 0 && (n % 5) == 0 && (n % 7) != 0)
                .limit(size)
                .toArray();

            // Plong
        else if (!factor3 && !factor5 && factor7) return new Random().ints()
                .filter(n -> (n % 3) != 0 && (n % 5) != 0 && (n % 7) == 0)
                .limit(size)
                .toArray();

            // PlingPlang
        else if (factor3 && factor5 && !factor7) return new Random().ints()
                .filter(n -> (n % 3) == 0 && (n % 5) == 0 && (n % 7) != 0)
                .limit(size)
                .toArray();

            // PlingPlong
        else if (factor3 && !factor5 && factor7) return new Random().ints()
                .filter(n -> (n % 3) == 0 && (n % 5) != 0 && (n % 7) == 0)
                .limit(size)
                .toArray();

            // PlangPlong
        else if (!factor3 && factor5 && factor7) return new Random().ints()
                .filter(n -> (n % 3) != 0 && (n % 5) == 0 && (n % 7) == 0)
                .limit(size)
                .toArray();

            // PlingPlangPlong
        else return new Random().ints()
                    .filter(n -> (n % 3) == 0 && (n % 5) == 0 && (n % 7) == 0)
                    .limit(size)
                    .toArray();
    }
}
