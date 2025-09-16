package scenariobasedproblems;

public class ExamHallSeatValidator {

    static String seatValidator(int[] studentIds)
    {
        for (int i = 0; i < studentIds.length-1; i++) {

            if(studentIds[i] % 10 == studentIds[i+1] % 10)
            {
                return "Invalid - " + studentIds[i] + " and " + studentIds[i + 1] + " have same last digit";
            }
        }
        return "Valid Seating";
    }
    public static void main(String[] args) {
        int[] studentsIds = {21, 34, 44, 52};

        String result = seatValidator(studentsIds);

        System.out.println(result);

     }
}
