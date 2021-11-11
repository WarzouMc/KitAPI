package fr.warzou.api.kitapi.common.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueRandomObjectTest {

    @Test
    void next() {
        double probability1 = 0;
        double probability2 = 1/3.0;
        double probability3 = 2/3.0;
        double[] probabilities = {probability1, probability2, probability3};
        String[] values = {"1", "2", "3"};
        UniqueRandomObject<String> object = new UniqueRandomObject<>(values, probabilities);
        int test = 10_000;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < test; i++) {
            Object value = object.next();
            if (value.equals(values[0]))
                count1++;
            if (value.equals(values[1]))
                count2++;
            if (value.equals(values[2]))
                count3++;
        }
        assertEquals(round(probability1, 1), round(count1 / (test + 0.0), 1));
        assertEquals(round(probability2, 1), round(count2 / (test + 0.0), 1));
        assertEquals(round(probability3, 1), round(count3 / (test + 0.0), 1));
    }

    private double round(double d, int round) {
        return Math.round(d * Math.pow(10, round)) / (Math.pow(10, round) + 0.0);
    }
}