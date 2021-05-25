package com.sparta.as;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RaindropsTest {

    private static Raindrops raindrops;

    @BeforeAll
    static void setUpAll() {
        raindrops = new Raindrops();
    }

    @Test
    @DisplayName("checkInput3ReturnsPling")
    void checkInput3ReturnsPling() {
        Assertions.assertEquals("Pling", raindrops.plingPlangPlong(3));
    }

    @Test
    @DisplayName("checkInput5ReturnsPlang")
    void checkInput5ReturnsPlang() {
        Assertions.assertEquals("Plang", raindrops.plingPlangPlong(5));
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
}
