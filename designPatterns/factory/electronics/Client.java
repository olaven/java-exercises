import java.util.ArrayList; 

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        ElectronicFactory electronicFactory = new ElectronicFactory();
        ArrayList<Electronic> list = new ArrayList<Electronic>(); 
        
        list.add(electronicFactory.create(ElectronicType.PHONE)); 
        list.add(electronicFactory.create(ElectronicType.MONITOR));
        list.add(electronicFactory.create(ElectronicType.SPEAKER));
        list.add(electronicFactory.create(ElectronicType.HEADSET));

        for(Electronic item : list) {
            item.printInfo(); 
        }
        
    }
}