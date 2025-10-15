package filehandling.problems.largedatafileprocessing;

import java.io.*;

public class FilterTransactions {

    public static void main(String[] args) {

        String inputFilePath = "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\problems\\largedatafileprocessing\\transactions.txt";
        String outputFilePath = "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\problems\\largedatafileprocessing\\filtered_transactions.txt";

        double threshold = 10000.0; // filter condition

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {

                // Split the line by comma
                String[] parts = line.split(",");

                if (parts.length == 4) {
                    String transactionId = parts[0];
                    String customerId = parts[1];
                    double amount = Double.parseDouble(parts[2]);
                    String date = parts[3];

                    // Filter condition
                    if (amount > threshold) {
                        writer.write(transactionId + "," + customerId + "," + amount + "," + date);
                        writer.newLine();
                    }
                }
            }

            System.out.println("Filtered transactions written successfully to " + outputFilePath);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
