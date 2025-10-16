package filehandling.insurancemanagementsystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PolicyManager implements FileHandler{
    @Override
    public List<Policies> policyReader(String path) throws IOException {

        List<Policies> policies = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(path)))
        {
            String line ;
            while ((line = reader.readLine()) != null ){
                String[] values = line.split(",");

                int id = Integer.parseInt(values[0].trim());
                String name = values[1].trim();
                double amount = Double.valueOf(values[2].trim());

                policies.add(new Policies(id,name,amount));
            }
        }
        return policies;
    }

    @Override
    public void summaryWriter(String path, double totalAmount, int numberOfPolicies) throws IOException {

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))){

            writer.write("Total number of the policies :"+numberOfPolicies);
            writer.newLine();
            writer.write("Total amount of the policies :"+totalAmount);
        }

    }
}
