package day_6_assignment.typeCasting;

//2.Convert an int to String using String.valueOf(...), 
//then back with Integer.parseInt(...). 
//Handle NumberFormatException.

public class QuestionTwo {
    public static void main(String[] args) {
        
        int num = 1234;

        // int to String
        String str = String.valueOf(num);
        System.out.println("Converted int to String: " + str);

        try {
            // String to  int
            int parsedNum = Integer.parseInt(str);
            System.out.println("Converted String back to int: " + parsedNum);
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: String is not a valid integer!");
        }
    }
}
