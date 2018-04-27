public class FruitFacory {
    public static Fruit getFruit(String name){
        name = name.toLowerCase().trim(); 
        Fruit fruit; 
        switch(name){
            case "apple": 
                fruit = new Apple(); 
                break;
            case "banana": 
                fruit = new Banana(); 
                break; 
            case "orange": 
                fruit = new Orange(); 
                break; 
            default: 
                throw new IllegalArgumentException("Invalid fruit name"); 
        }
        return fruit; 
    }
    
}