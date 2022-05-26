import java.util.Scanner;
import java.util.ArrayList;

public class LimitedNumbers {
        public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Number. Enter Negative Number to Exit");
    
            ArrayList<Integer> something = new ArrayList<>();
    
            while (true){
            Integer userInput = scan.nextInt();
                if (userInput < 0) {
                    break;
                }
                    something.add(userInput);
                }
            something.stream()
                .filter(num -> num >= 4 && num <= 5)
                .forEach(num -> System.out.println(num)); {
                }
            }
}
    
