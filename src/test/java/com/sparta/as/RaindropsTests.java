package com.sparta.as;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RaindropsTests {

    private static Raindrops raindrops;

    @BeforeAll
    static void setUpAll() {
        raindrops = new Raindrops();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, -3})
    @DisplayName("Check that numbers with only a factor of 3 return 'Pling'")
    void checkThatNumbersWithOnlyAFactorOf3ReturnPling(int number) {
        Assertions.assertEquals("Pling", raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, -24})
    @DisplayName("Check that numbers with only a factor of 5 return 'Plang'")
    void checkThatNumbersWithOnlyAFactorOf5ReturnPlang(int number) {
        Assertions.assertEquals("Plang", raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, -14, 28})
    @DisplayName("Check that numbers with only a factor of 7 return 'Plong'")
    void checkThatNumbersWithOnlyAFactorOf7ReturnPlong(int number) {
        Assertions.assertEquals("Plong", raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {34, 0, -11})
    @DisplayName("Check that numbers with no respective factors return themselves as a string")
    void checkThatNumbersWithNoRespectiveFactorsReturnThemselvesAsAString(int number) {
        Assertions.assertEquals("" + number + "", raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, -30, 30})
    @DisplayName("Check that numbers with a factor of 3 and 5 return 'PlingPlang'")
    void checkThatNumbersWithAFactorOf3And5ReturnPlingPlang(int number) {
        Assertions.assertEquals("PlingPlang", raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {21, -42})
    @DisplayName("Check that numbers with a factor of 3 and 7 return 'PlingPlong'")
    void checkThatNumbersWithAFactorOf3And7ReturnPlingPlong(int number) {
        Assertions.assertEquals("PlingPlong", raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {35, -70})
    @DisplayName("Check that numbers with a factor of 5 and 7 return 'PlangPlong'")
    void checkThatNumbersWithAFactorOf5And7ReturnPlangPlong(int number) {
        Assertions.assertEquals("PlangPlong", raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {105, -210})
    @DisplayName("Check that numbers with a factor of 3, 5 and 7 return 'PlingPlangPlong'")
    void checkThatNumbersWithAFactorOf35And7ReturnPlingPlangPlong(int number) {
        Assertions.assertEquals("PlingPlangPlong", raindrops.plingPlangPlong(number));
    }
}
