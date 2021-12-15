package ru.netology.sqr;

public class SQRService {

    public int findSqr(int minLimit, int maxLimit) {

        int count = 0;
        int i = 0;

        for (i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= minLimit && sqr <= maxLimit) {
                count++;
            }
            System.out.println(count);
        }
        return count;
    }
}