package ru.netology.sqr;

public class SQRService {
    public int squares() {
        int count = 0;
        int rangeMin = 200;
        int rangeMax = 300;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= rangeMin) {
                if (x <= rangeMax) {
                    count++;
                }
            }
        }
        return count;
    }
}
