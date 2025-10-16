package filehandling.insurancemanagementsystem;

import java.io.IOException;
import java.util.List;

public interface FileHandler {

    public List<Policies> policyReader (String path) throws IOException;

    public void summaryWriter ( String path , double amount , int numberOfPolicies) throws IOException ;

}
