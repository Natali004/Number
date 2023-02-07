package ru.netology.sqr;

public class SQRService {

    public int calc(int low, int high)
    {
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            int ii = i * i;
            if (ii >= low) {
                if (ii <= high)
                {
                    result++;
                }
            }
        }
        return result;
    }
}