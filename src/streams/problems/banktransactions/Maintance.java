package streams.problems.banktransactions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Maintance {
    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, "AC1001", 5000.00, "Credit"),
                new Transaction(2, "AC1002", 1200.50, "Debit"),
                new Transaction(3, "AC1003", 3000.00, "Credit"),
                new Transaction(4, "AC1004", 7500.25, "Debit"),
                new Transaction(5, "AC1005", 9800.00, "Credit"),
                new Transaction(6, "AC1006", 4500.00, "Debit"),
                new Transaction(7, "AC1007", 6200.00, "Credit"),
                new Transaction(8, "AC1008", 1100.00, "Debit"),
                new Transaction(9, "AC1009", 2500.00, "Credit"),
                new Transaction(10, "AC1010", 8000.00, "Debit"),
                new Transaction(11, "AC1011", 1500.00, "Credit"),
                new Transaction(12, "AC1012", 300.00, "Debit"),
                new Transaction(13, "AC1013", 7000.00, "Credit"),
                new Transaction(14, "AC1014", 9500.00, "Debit"),
                new Transaction(15, "AC1015", 4000.00, "Credit")
        );

        //Get all "DEBIT" transactions above 5000.
        transactions.stream()
                .filter(t -> t.getAmount() >= 5000)
                .filter(t -> t.getType().equals("Debit"))
                .forEach(System.out::println);

        //Find the total transaction amount using reduce()
        double totalAmount = transactions.stream()
                .map(Transaction::getAmount)
                .reduce(0.0 , (a , b) -> a + b);

        System.out.println("Total Amount :"+totalAmount);


        //Find the first "CREDIT" transaction and return it as Optional<Transaction>.

        Optional<Transaction> firstCreadit = transactions.stream()
                .filter(t -> t.getType().equals("Credit"))
                .findFirst();

        firstCreadit.ifPresentOrElse(System.out::println,() -> System.out.println("THERE IS NO CREDIT TRANSACTIONS"));
    }
}
