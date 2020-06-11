package comportamentale.strategy.implementations;

import java.util.Arrays;

public class Medie implements Procesabil {
    @Override
    public int compute(int[] values) {
        return Arrays.stream(values).sum() / values.length;
    }
}
