package com.sparta.as;

public class Raindrops {

    public String plingPlangPlong(int number) {
        String output = isPlingFactor(number) + isPlangFactor(number) + isPlongFactor(number);
        return output.isEmpty() ? "" + number + "" : output;
    }

    public String isPlingFactor(int number) {
        return number != 0 && number % 3 == 0 ? "Pling" : "";
    }

    public String isPlangFactor(int number) {
        return number != 0 && number % 5 == 0 ? "Plang" : "";
    }

    public String isPlongFactor(int number) {
        return number != 0 && number % 7 == 0 ? "Plong" : "";
    }
}
