package scenariobasedproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AirportBoardingGateSimulation {

    static int isValidator(int[] tickesNumbers)
    {
        System.out.println(Arrays.toString(tickesNumbers));
        int[] actualBroading = new int[tickesNumbers.length];

        for(int i = 0;i<actualBroading.length;i++)
        {
            actualBroading[i] = tickesNumbers[i];
        }
        Arrays.sort(actualBroading);
        System.out.println(Arrays.toString(actualBroading));

        int count = 0 ;

        for (int j = 0; j < actualBroading.length; j++) {
            if( actualBroading[j] != tickesNumbers[j])
                count++;
        }
        return --count;
    }


    public static void main(String[] args) {

        int[] array = {101,103,102,104};

        int result = isValidator(array);

        System.out.println(result);

    }
}
