import java.util.ArrayList; 

public class Client
{
    public static void main(String[] args)
    {
        ArrayList<Fruit> list = new ArrayList<Fruit>(); 

        list.add(new Orange()); 
        list.add(new Strawberry()); 

        for(Fruit fruit : list)
        {
            if(fruit instanceof Orange)
            {
                Orange casted = (Orange) fruit; 
                casted.orangeThing(); 
            }
            else if(fruit instanceof Strawberry)
            {
                Strawberry casted = (Strawberry) fruit; 
                casted.strawberryThing();
            }
        }
    }
}