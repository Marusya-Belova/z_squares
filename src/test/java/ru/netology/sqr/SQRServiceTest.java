package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldFindSqrLimit() {
        SQRService sqrService = new SQRService();
        int minLimit = 100;
        int maxLimit = 9801;
        int expected = 90;
        int actual = sqrService.findSqr(minLimit,maxLimit);
        assertEquals(expected,actual);
    }
    @Test
    void shouldFindSqr0() {
        SQRService sqrService = new SQRService();
        int minLimit = 0;
        int maxLimit = 0;
        int expected = 0;
        int actual = sqrService.findSqr(minLimit,maxLimit);
        assertEquals(expected,actual);
    }
    @Test
    void shouldFindSqrBeforeLimit() {
        SQRService sqrService = new SQRService();
        int minLimit = 0;
        int maxLimit = 99;
        int expected = 0;
        int actual = sqrService.findSqr(minLimit,maxLimit);
        assertEquals(expected,actual);
    }
    @Test
    void shouldFindSqrAfterLimit() {
        SQRService sqrService = new SQRService();
        int minLimit = 9802;
        int maxLimit = 5000000;
        int expected = 0;
        int actual = sqrService.findSqr(minLimit,maxLimit);
        assertEquals(expected,actual);
    }
    @Test
    void shouldFindSqrInTask() {
        SQRService sqrService = new SQRService();
        int minLimit = 200;
        int maxLimit = 300;
        int expected = 3;
        int actual = sqrService.findSqr(minLimit,maxLimit);
        assertEquals(expected,actual);
    }
}