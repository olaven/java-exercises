public class CoffeeDecorator
{
    private Drink drink; 
    public CoffeeDecorator(Drink drink)
    {
        this.drink = drink; 
    }
    public void getDescription()
    {
        System.out.println("This is a coffee"); 
    }

    public void coffeeFunctionality()
    {
        System.out.println("Coffee functionality"); 
    }
}