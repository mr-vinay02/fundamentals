package collection.arraylist;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;

public class RemoveDupliactes {
    public static void main(String[] args) {

        List<Integer> elements = Arrays.asList(45,61,64,42,61,511,54,54,51,45,51,51,761,984,12);

        elements.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
