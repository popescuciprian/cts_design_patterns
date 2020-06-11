package comportamentale.strategy.implementations;

import java.util.Arrays;

public class Suma implements Procesabil {

    public int compute(int[] values) {
        return Arrays.stream(values).sum();
    }
}
