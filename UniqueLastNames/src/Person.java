
public class Person {

    private String firstName;
    private String lastName;
    private String birthYear;
  
    public Person(String firstName, String lastName, String birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    public String getFirstName() {
    return firstName;
    }

    public String getLastName() {
    return lastName;
    }

    public String getBirthYear() {
    return birthYear;
    }

}
