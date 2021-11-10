package fr.warzou.api.kitapi.common.random;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomObject {

    private final @NotNull Random random;
    private final @NotNull Object[] values;
    private final double[] probabilities;

    public RandomObject(@NotNull Object[] values, double[] probabilities) {
        this(ThreadLocalRandom.current(), values, probabilities);
    }

    public RandomObject(@NotNull Random random, @NotNull Object[] values, double[] probabilities) {
        this.random = random;
        this.values = values;
        this.probabilities = probabilities;
        checkCurrentVariable();
    }

    @Contract("_ -> new")
    public static @NotNull RandomObject createRandomObject(@NotNull Object... values) {
        double[] probabilities = new double[values.length];
        Arrays.fill(probabilities, 1.0 / values.length);
        return new RandomObject(values, probabilities);
    }

    public static @NotNull RandomObject createRandomObject(@NotNull List<Object> values) {
        return createRandomObject(values.toArray());
    }

    public static @NotNull RandomObject createRandomObject(@NotNull Object[] values, double... probabilities) {
        return new RandomObject(values, probabilities);
    }

    public static @NotNull RandomObject createRandomObject(@NotNull List<Object> values, double... probabilities) {
        return createRandomObject(values.toArray(), probabilities);
    }

    @Contract("_, _ -> new")
    public static @NotNull RandomObject createRandomObject(@NotNull List<Object> values, List<Double> probabilities) {
        Object[] objects = values.toArray();
        double[] probabilitiesArray = new double[probabilities.size()];
        for (int i = 0; i < probabilities.size(); i++)
            probabilitiesArray[i] = probabilities.get(i);
        return new RandomObject(objects, probabilitiesArray);
    }

    public Object next() {
        checkCurrentVariable();
        double next = this.random.nextDouble();
        double sum = 0;
        double[] doubles = this.probabilities;
        for (int i = 0; i < doubles.length; i++) {
            if ((sum += doubles[i]) > next)
                return this.values[i];
        }
        throw new IllegalStateException("No object found !");
    }

    public @NotNull Random getRandom() {
        return this.random;
    }

    public @NotNull Object[] getValues() {
        return this.values;
    }

    public double[] getProbabilities() {
        return this.probabilities;
    }

    private double sum(double[] array) {
        return Arrays.stream(array).sum();
    }

    private void checkCurrentVariable() {
        if (this.values.length != this.probabilities.length)
            throw new IllegalArgumentException("Values array length is not same of probabilities array length !");
        if (sum(this.probabilities) != 1.0)
            throw new IllegalArgumentException("Probabilities sum isn't equals to 1 (currently " + sum(probabilities) + ") !");
    }
}
