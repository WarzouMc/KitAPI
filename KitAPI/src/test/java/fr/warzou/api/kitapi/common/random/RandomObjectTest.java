package fr.warzou.api.kitapi.common.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RandomObjectTest {

    @Test
    public void next() {
        double[] probabilities = {0, 1/2.0, 1/2.0};
        String[] value = {"1", "2", "3"};
        RandomObject object = new RandomObject(value, probabilities);
        for (int i = 0; i < 100; i++) {
            assertNotEquals("1", object.next());
        }
    }
}