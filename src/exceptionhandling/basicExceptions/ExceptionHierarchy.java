package exceptionhandling.basicExceptions;

public class ExceptionHierarchy {
    public static void main(String[] args) {
        try {
            // Case 1: Arithmetic Exception
            //int num = 10 / 0;   // throws ArithmeticException

            // Case 2: Null Pointer Exception
             String str = null;
             System.out.println(str.length());

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero.");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Null object accessed.");
        } // general Exception must in the last
        catch (Exception e) {
            System.out.println("Caught a general Exception: " + e);
        }finally {
            System.out.println("Program continues after exception handling...");
        }
    }
}
