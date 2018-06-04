import java.util.ArrayList; 

public class Client
{

    public static void main(String[] args)
    {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        vehicles = new ArrayList<Vehicle>();

        vehicles.add(new Boat()); 
        vehicles.add(new Car()); 
        vehicles.add(new Boat()); 

        for(Vehicle vehicle : vehicles)
        {
            vehicle.move(); 

            if(vehicle instanceof Boat)
            {
                vehicle = (Boat) vehicle; 
                vehicle.sail(); 
            } 
            else if(vehicle instanceof Car)
            {
                vehicle = (Car) vehicle; 
                vehicle.drive(); 
            }
        }
    }
}