package collection.arraylist.insurancecoverage;

public class MainCoverageSystem {

    public static void main(String[] args) {
        CoverageManagment manager = new CoverageManagment();

        manager.addCoverage(new Coverage("Life Insurance", 500000, 15000));
        manager.addCoverage(new Coverage("Health Insurance", 300000, 12000));
        manager.addCoverage(new Coverage("Auto Insurance", 200000, 8000));

        System.out.println("All Coverage Options:");
        manager.displayAll();

        System.out.println("\nHighest Coverage: " + manager.getMaxCoverage());
        System.out.println("Lowest Premium: " + manager.getLowestPremium());
        System.out.println("Recommended Option: " + manager.recommendBestOption());
    }

}
