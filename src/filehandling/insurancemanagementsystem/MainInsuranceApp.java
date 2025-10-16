package filehandling.insurancemanagementsystem;

import java.io.IOException;
import java.util.List;

public class MainInsuranceApp {
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        try{
            List<Policies> policies = manager.policyReader("C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\insurancemanagementsystem\\ policies.txt");

            int totalCount = policies.size();

            double amount = 0;

            for (Policies policy : policies){
                amount += policy.getAmount();
            }

            String summaryPath = "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\insurancemanagementsystem\\ summary.txt";

            manager.summaryWriter(summaryPath,amount,totalCount);

            System.out.println("Successfully Done!");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
