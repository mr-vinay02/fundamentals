package collection.set;

import java.util.*;

public class FirstNonDuplicate {

    public static Integer findFirstNonDuplicate(List<Integer> nums) {

        Set<Integer> unique = new LinkedHashSet<>();

        for (Integer number : nums) {

            if(!unique.contains(number))
            {
                unique.add(number);
            }
            else {
                unique.remove(number);
            }
        }

        // The first element left in 'unique' is our answer
        return unique.isEmpty() ? null : unique.iterator().next();
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        System.out.println(findFirstNonDuplicate(nums)); // Output: 6
    }
}
