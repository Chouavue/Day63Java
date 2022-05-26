import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        List<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type 'end' to stop.");
        
        while(true){
            String num = scan.nextLine();
            if(num.equals("end")){
                break;
            }
            inputs.add(num);
        }
        System.out.println("Print the average of the negative numbers or positive numbers? (n/p) ");

                String userInput = scan.nextLine();

                if (userInput.equals("n")){
                        double negativeAverage = inputs.stream()
                        .mapToInt(s-> Integer.valueOf(s))
                        .filter(number -> number < 0)
                        .average()
                        .getAsDouble();
                        System.out.println("average of the negative numbers: "+ negativeAverage );
                }else{
                    double positiveAverage = inputs.stream()
                    .mapToInt(s-> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
                    System.out.println("average of the postive numbers: "+ positiveAverage );
            }
        }
    }


