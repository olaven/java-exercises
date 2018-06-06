public class PeopleFactory
{
    public Person getPerson(String type)
    {
        switch(name)
        {
            case "student": 
                return new Person("Studentsy", 20, "This i a standard student"); 
                break; 
            case "gamer":   
                return new Person("Gamersy", 17, "This is a standard gamer"); 
                break; 
            default: 
                return new Person("Standard", 25, "this is a default person"); 
        }
    }
}