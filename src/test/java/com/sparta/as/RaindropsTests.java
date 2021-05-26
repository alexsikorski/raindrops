package com.sparta.as;

import com.sparta.as.testutil.RandomIntArrayGenerator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class RaindropsTests {

    private static Raindrops raindrops;

    private static final String PLING = "Pling";
    private static final String PLANG = "Plang";
    private static final String PLONG = "Plong";
    private static final String PLING_PLANG = "PlingPlang";
    private static final String PLING_PLONG = "PlingPlong";
    private static final String PLANG_PLONG = "PlangPlong";
    private static final String PLING_PLANG_PLONG = "PlingPlangPlong";

    @BeforeAll

    static void setUpAll() {
        raindrops = new Raindrops();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, -3})
    @DisplayName("Check that numbers with only a factor of 3 return 'Pling'")
    void checkThatNumbersWithOnlyAFactorOf3ReturnPling(int number) {
        Assertions.assertEquals(PLING, raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, -25})
    @DisplayName("Check that numbers with only a factor of 5 return 'Plang'")
    void checkThatNumbersWithOnlyAFactorOf5ReturnPlang(int number) {
        Assertions.assertEquals(PLANG, raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, -14, 28})
    @DisplayName("Check that numbers with only a factor of 7 return 'Plong'")
    void checkThatNumbersWithOnlyAFactorOf7ReturnPlong(int number) {
        Assertions.assertEquals(PLONG, raindrops.plingPlangPlong(number));
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
        Assertions.assertEquals(PLING_PLANG, raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {21, -42})
    @DisplayName("Check that numbers with a factor of 3 and 7 return 'PlingPlong'")
    void checkThatNumbersWithAFactorOf3And7ReturnPlingPlong(int number) {
        Assertions.assertEquals(PLING_PLONG, raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {35, -70})
    @DisplayName("Check that numbers with a factor of 5 and 7 return 'PlangPlong'")
    void checkThatNumbersWithAFactorOf5And7ReturnPlangPlong(int number) {
        Assertions.assertEquals(PLANG_PLONG, raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {105, -210})
    @DisplayName("Check that numbers with a factor of 3, 5 and 7 return 'PlingPlangPlong'")
    void checkThatNumbersWithAFactorOf35And7ReturnPlingPlangPlong(int number) {
        Assertions.assertEquals(PLING_PLANG_PLONG, raindrops.plingPlangPlong(number));
    }

    @Nested
    @DisplayName("Is 'Pling', 'Plang' or 'Plong' methods tests")
    class isPlingPlangPlongMethodTests {

        @ParameterizedTest
        @ValueSource(ints = {699, -294})
        @DisplayName("check isPlingFactor returns 'Pling'")
        void checkIsPlingFactorReturnsPling(int number) {
            Assertions.assertEquals(PLING, raindrops.isPlingFactor(number));
        }

        @ParameterizedTest
        @ValueSource(ints = {170, -2835})
        @DisplayName("Check isPlangFactor returns 'Plang'")
        void checkIsPlangFactorReturnsPlang(int number) {
            Assertions.assertEquals(PLANG, raindrops.isPlangFactor(number));
        }

        @ParameterizedTest
        @ValueSource(ints = {483, -2401})
        @DisplayName("Check isPlongFactor returns 'Plong'")
        void checkIsPlongFactorReturnsPlong(int number) {
            Assertions.assertEquals(PLONG, raindrops.isPlongFactor(number));
        }

        @Test
        @DisplayName("Check isPlingFactor returns empty string when 0 is an input")
        void checkIsPlingFactorReturnsEmptystringWhen0IsAnInput() {
            Assertions.assertEquals("", raindrops.isPlangFactor(0));
        }

        @Test
        @DisplayName("Check isPlangFactor returns empty string when 0 is an input")
        void checkIsPlangFactorReturnsEmptyStringWhen0IsAnInput() {
            Assertions.assertEquals("", raindrops.isPlangFactor(0));
        }

        @Test
        @DisplayName("Check isPlongFactor returns empty string when 0 is an input")
        void checkIsPlongFactorReturnsEmptyStringWhen0IsAnInput() {
            Assertions.assertEquals("", raindrops.isPlongFactor(0));
        }
    }


    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @Nested
    @DisplayName("Randomised test cases for plingPlangPlong")
    class randomisedPlingPlangPlongTests {

        private static final int RANDOM_SAMPLE_SIZE = 10;

        @ParameterizedTest
        @MethodSource("generateRandomIntsForPling")
        @DisplayName("Check plingPlangPlong method returns 'Pling' with random numbers of factor 3 ")
        void checkPlingPlangPlongMethodReturnsPlingWithRandomNumbersOfFactor3(int number) {
            Assertions.assertEquals(PLING, raindrops.plingPlangPlong(number));
        }

        @ParameterizedTest
        @MethodSource("generateRandomIntsForPlang")
        @DisplayName("Check plingPlangPlong method returns 'Plang' with random numbers of factor 5")
        void checkPlingPlangPlongMethodReturnsPlangWithRandomNumbersOfFactor5(int number) {
            Assertions.assertEquals(PLANG, raindrops.plingPlangPlong(number));
        }

        @ParameterizedTest
        @MethodSource("generateRandomIntsForPlong")
        @DisplayName("Check plingPlangPlong method returns 'Plong' with random numbers of factor 7")
        void checkPlingPlangPlongMethodReturnsPlongWithRandomNumbersOfFactor7(int number) {
            Assertions.assertEquals(PLONG, raindrops.plingPlangPlong(number));
        }



        private int[] generateRandomIntsForPling() {
            return RandomIntArrayGenerator.generateRandomNumbersOfFactor(RANDOM_SAMPLE_SIZE, 3);
        }

        private int[] generateRandomIntsForPlang() {
            return RandomIntArrayGenerator.generateRandomNumbersOfFactor(RANDOM_SAMPLE_SIZE, 5);
        }

        private int[] generateRandomIntsForPlong() {
            return RandomIntArrayGenerator.generateRandomNumbersOfFactor(RANDOM_SAMPLE_SIZE, 7);
        }
    }
}
