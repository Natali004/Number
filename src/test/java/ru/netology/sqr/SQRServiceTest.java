package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    public void testCaseSeveralSquares() {
        SQRService service = new SQRService();
        int actual = service.calc(200, 300);
        int exepted = 3;
        Assertions.assertEquals(exepted, actual);

    }

    @Test
    public void testCaseZeroSquares() {
        SQRService service = new SQRService();
        int actual = service.calc(10, 20);
        int exepted = 0;
        Assertions.assertEquals(exepted, actual);

    }

    @Test
    public void testCaseFiveSquares() {
        SQRService service = new SQRService();
        int actual = service.calc(300, 500);
        int exepted = 5;
        Assertions.assertEquals(exepted, actual);

    }
}