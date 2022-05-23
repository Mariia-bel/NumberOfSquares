package ru.netology.sqr;

public class SQRService {
    public int squares(int rangeMin, int rangeMax, int expected) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= rangeMin)
                if (x <= rangeMax) {
                    count++;
                }
        }
        return count;
    }
}
