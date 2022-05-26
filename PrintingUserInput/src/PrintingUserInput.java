import java.util.ArrayList;
import java.util.Scanner;


public class PrintingUserInput {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter something. Enter to Exit");

        ArrayList<String> something = new ArrayList<>();

        while (true){
            String userInput = scan.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
                something.add(userInput);
            }
        something.stream()
            .forEach(word -> System.out.println(word));
        }
    }



