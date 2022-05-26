import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AverageOfNumbers {
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
        double average = inputs.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .average()
        .getAsDouble();

        System.out.println("average of the numbers: "+ average );
    }
}
    
