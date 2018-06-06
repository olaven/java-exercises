public class Client
{
    public static void main(String[] args)
    {
        PeopleFactory factory = new PeopleFactory(); 
        Person me = factory.getPerson("student"); 
        Person stand = factory.getPerson(""); 
        Person gamer = factory.getPerson("gamer"); 
    }
}