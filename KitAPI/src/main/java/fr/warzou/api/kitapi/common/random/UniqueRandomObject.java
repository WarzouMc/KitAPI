package fr.warzou.api.kitapi.common.random;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Allow getting random (same type) object from an array of object and an array of probabilities.
 *
 * @see RandomObject
 * @author Warzou
 * @since 0.0.1
 * @version 0.0.1
 * @param <O> type
 */
public class UniqueRandomObject<O> extends RandomObject {

    /**
     * Create a new instance of {@link UniqueRandomObject}.
     * @param values target objects
     * @param probabilities objects probabilities
     * @since 0.0.1
     */
    public UniqueRandomObject(@NotNull O[] values, double[] probabilities) {
        super(values, probabilities);
    }

    /**
     * Create a new instance of {@link UniqueRandomObject}.
     * @param random used random
     * @param values target objects
     * @param probabilities objects probabilities
     * @since 0.0.1
     */
    public UniqueRandomObject(@NotNull Random random, @NotNull O[] values, double[] probabilities) {
        super(random, values, probabilities);
    }

    /**
     * Create a new instance of {@link UniqueRandomObject}.
     * <br>
     * All probabilities are equals and their value is {@code 1/values.length}.
     * @param values target objects
     * @return new instance of {@link UniqueRandomObject}
     * @param <O> type
     * @since 0.0.1
     */
    @SafeVarargs
    @Contract("_ -> new")
    public static @NotNull <O> UniqueRandomObject<O> createUniqueRandomObject(@NotNull O... values) {
        double[] probabilities = new double[values.length];
        Arrays.fill(probabilities, 1.0 / values.length);
        return new UniqueRandomObject<>(values, probabilities);
    }

    /**
     * Create a new instance of {@link UniqueRandomObject}.
     * <br>
     * All probabilities are equals and their value is {@code 1/values.length}.
     * @param values target objects
     * @return new instance of {@link UniqueRandomObject}
     * @param <O> type
     * @since 0.0.1
     */
    @Contract("_ -> new")
    public static @NotNull <O> UniqueRandomObject<O> createUniqueRandomObject(@NotNull List<O> values) {
        return createUniqueRandomObject((O[]) values.toArray());
    }

    /**
     * Create a new instance of {@link UniqueRandomObject}.
     * @param values target objects
     * @param probabilities target probabilities
     * @return new instance of {@link UniqueRandomObject}
     * @param <O> type
     * @since 0.0.1
     */
    @Contract("_, _ -> new")
    public static @NotNull <O> UniqueRandomObject<O> createUniqueRandomObject(@NotNull O[] values, double... probabilities) {
        return new UniqueRandomObject<>(values, probabilities);
    }

    /**
     * Create a new instance of {@link UniqueRandomObject}.
     * @param values target objects
     * @param probabilities target probabilities
     * @return new instance of {@link UniqueRandomObject}
     * @param <O> type
     * @since 0.0.1
     */
    @Contract("_, _ -> new")
    public static @NotNull <O> UniqueRandomObject<O> createUniqueRandomObject(@NotNull List<O> values, double... probabilities) {
        return createUniqueRandomObject((O[]) values.toArray(), probabilities);
    }

    /**
     * Create a new instance of {@link UniqueRandomObject}.
     * @param values target objects
     * @param probabilities target probabilities
     * @return new instance of {@link UniqueRandomObject}
     * @param <O> type
     * @since 0.0.1
     */
    @Contract("_, _ -> new")
    public static @NotNull <O> UniqueRandomObject<O> createUniqueRandomObject(@NotNull List<O> values, List<Double> probabilities) {
        O[] objects = (O[]) values.toArray();
        double[] probabilitiesArray = new double[probabilities.size()];
        for (int i = 0; i < probabilities.size(); i++)
            probabilitiesArray[i] = probabilities.get(i);
        return new UniqueRandomObject<>(objects, probabilitiesArray);
    }

    @Override
    public O next() {
        return (O) super.next();
    }

    @Override
    public @NotNull O[] getValues() {
        return (O[]) super.getValues();
    }
}
