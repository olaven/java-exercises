public class Client
{
    public static void main(String[] args)
    {

        MeterArchive archive = new MeterArchive(); 

        Thermometer thermometer = new Thermometer(0.0, 39.5, 43, true); 
        Clock clock = new Clock(0.9995, 40, true); 
        Weight weight = new Weight(0, 100.5, 43, true); 
    
        archive.add(thermometer); 
        archive.add(clock); 
        archive.add(weight); 

        for(Meter meter : archive.getMeters())
        {
            System.out.println(question.toString()); 
        }

        System.out.println("-------------------------------------------------");

        if(archive.alterWorking(clock.getId()))
        {
            System.out.println(clock.toString() + "\n\n\nChanged, as expected"); 
        } else 
        {
            System.out.println("Weird.");
        }

        if (!archive.alterWorking(new Clock(10, 2, true).getId())) {
            System.out.println("\n\n\nError, as expected");
        } else 
        {
            System.out.println("Weird."); 
        }



        System.out.println("-------------------------------------------------");



        System.out.println("Adding new Thermometer\n\n\n"); 
        archive.add(new Thermometer(0, 200, 44, true)); 
        System.out.println("\n\n\n"); 
        for (Meter meter : archive.getMeters()) {
            System.out.println(question.toString());
        }


        System.out.println("-------------------------------------------------");

        System.out.println("Removing old Thermometer\n\n\n");
        archive.remove(thermometer);
        System.out.println("\n\n\n");
        for (Meter meter : archive.getMeters()) {
            System.out.println(meter.toString());
        }


        System.out.println("-------------------------------------------------");

        System.out.println("Altering location\n\n\n");
        System.out.println(archive.alterLocation(clock.getId(), 4040) ? clock.toString() : "weird."); 
    }
}

