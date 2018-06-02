public class Client
{
    public static void main(String[] args) {
        Drink drink = new Drink();
        // drink.coffeeFunctionality() // -> does not work
        CoffeeDecorator coffee = new CoffeeDecorator(drink);

        /**
         * Coffee now has all the functionality of drink without direct inheritance.
         * Coffee also has some extra coffee functionality
         */
        coffee.coffeeFunctionality(); 
    }
}