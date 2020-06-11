package comportamentale.strategy.implementations;

import java.util.Arrays;

public class Produs implements Procesabil {
    @Override
    public int compute(int[] values) {
        return Arrays.stream(values).reduce(1, (subtotal, element) -> subtotal * element);
    }
}
