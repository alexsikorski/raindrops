package com.sparta.as;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RaindropsTests {

    private static Raindrops raindrops;

    @BeforeAll
    static void setUpAll() {
        raindrops = new Raindrops();
    }

    @ParameterizedTest
    @ValueSource(ints = {3})
    @DisplayName("Check that numbers with only a factor of 3 return 'Pling'")
    void checkThatNumbersWithOnlyAFactorOf3ReturnPling(int number) {
        Assertions.assertEquals("Pling", raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5})
    @DisplayName("Check that numbers with only a factor of 5 return 'Plang'")
    void checkThatNumbersWithOnlyAFactorOf5ReturnPlang(int number) {
        Assertions.assertEquals("Plang", raindrops.plingPlangPlong(number));
    }

    @Test
    @DisplayName("checkInput7ReturnsPlong")
    void checkInput7ReturnsPlong() {
        Assertions.assertEquals("Plong", raindrops.plingPlangPlong(7));
    }

    @Test
    @DisplayName("checkInput34ReturnsItselfAsString")
    void checkInput34ReturnsItselfAsString() {
        Assertions.assertEquals("34", raindrops.plingPlangPlong(34));
    }

    @Test
    @DisplayName("checkInput0ReturnsItselfAsString")
    void checkInput0ReturnsItselfAsString() {
        Assertions.assertEquals("0", raindrops.plingPlangPlong(0));
    }
}
