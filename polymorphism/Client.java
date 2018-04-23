import java.util.ArrayList; 

public class Client{
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>(); 

        persons.add(new Student("Elon", 4, "DOG34"));
        persons.add(new Student("Olav", 19, "DOG21"));
        persons.add(new Teacher("Guro", 18, "F302"));  

        for(Person person : persons){
            person.printInfo();
        }
    }
}