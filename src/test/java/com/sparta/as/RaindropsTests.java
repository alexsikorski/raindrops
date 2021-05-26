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

    @ParameterizedTest
    @ValueSource(ints = {7})
    @DisplayName("Check that numbers with only a factor of 7 return 'Plong'")
    void checkThatNumbersWithOnlyAFactorOf7ReturnPlong(int number) {
        Assertions.assertEquals("Plong", raindrops.plingPlangPlong(7));
    }

    @ParameterizedTest
    @ValueSource(ints = {34, 0})
    @DisplayName("Check that numbers with no respective factors return themselves as a string")
    void checkThatNumbersWithNoRespectiveFactorsReturnThemselvesAsAString(int number) {
        Assertions.assertEquals("" + number + "", raindrops.plingPlangPlong(number));
    }
}
