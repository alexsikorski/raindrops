package com.sparta.as;

public class Raindrops {

    public String plingPlangPlong(int number) {
        return null;
    }

    private String isPlingFactor(int number) {
        return number != 0 && number % 3 == 0 ? "Pling" : "";
    }

    private String isPlangFactor(int number) {
        return number != 0 && number % 5 == 0 ? "Plang" : "";
    }

    private String isPlongFactor(int number) {
        return number != 0 && number % 7 == 0 ? "Plong" : "";
    }
}
