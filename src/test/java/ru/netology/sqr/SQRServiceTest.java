package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @org.junit.jupiter.params.ParameterizedTest
    @CsvSource({
            "200, 300, 3",
            "-100, 100, 1",
            "0, 99, 0"

    })

    public void sqtest(int rangeMin, int rangeMax, int expected) {
        SQRService service = new SQRService();
        int actual = service.squares(rangeMin, rangeMax, expected);

        Assertions.assertEquals(expected, actual);

    }
}
