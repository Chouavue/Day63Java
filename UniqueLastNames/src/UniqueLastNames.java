import java.util.Scanner;
import java.util.ArrayList;

public class UniqueLastNames {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number. Enter Negative Number to Exit");

        ArrayList<Person> persons = new ArrayList<>();

        while (true){
        System.out.println("Continue personal information Input? \"quit\"ends:" );
        System.out.print("Input first name: ");
        String firstName = scan.nextLine(); 
            if(firstName.equals("quit"))
            break;

        System.out.print("Input last name: ");
        String lastName = scan.nextLine();
            if(lastName.equals("quit"))
            break;
        System.out.print("Input year of  birth: ");
        String birthYear = scan.nextLine();
            if (birthYear.equals("quit")){
                break;
            }
            persons.add(new Person (firstName, lastName, birthYear));
        }
        persons.stream()
            .map(person -> person.getLastName()) 
            .distinct()
            .sorted()
            .forEach(lastname -> System.out.println(lastname));
        }
}

