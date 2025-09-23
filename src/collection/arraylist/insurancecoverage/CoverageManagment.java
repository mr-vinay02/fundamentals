package collection.arraylist.insurancecoverage;

import java.util.*;
import java.util.Comparator;

public class CoverageManagment {

    private ArrayList<Coverage> coverageList = new ArrayList<>();

    // Add coverage
    public void addCoverage(Coverage coverage) {
        coverageList.add(coverage);
    }

    // Compare based on coverage amount
    public Coverage getMaxCoverage() {
        return Collections.max(coverageList, Comparator.comparingDouble(Coverage::getAmount));
    }

    // Compare based on lowest premium
    public Coverage getLowestPremium() {
        return Collections.min(coverageList, Comparator.comparingDouble(Coverage::getPremium));
    }

    // Recommend the best option (simple criteria: highest coverage / lowest premium ratio)
    public Coverage recommendBestOption() {
        return Collections.max(coverageList,
                Comparator.comparingDouble(c -> c.getAmount() / c.getPremium()));
    }

    // Display all coverage options
    public void displayAll() {
        for (Coverage c : coverageList) {
            System.out.println(c);
        }
    }
}
