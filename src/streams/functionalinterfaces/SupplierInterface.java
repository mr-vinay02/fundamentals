package streams.functionalinterfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        Supplier<Integer> random = () -> new Random().nextInt(100);

        System.out.println(random.get());

    }
}
