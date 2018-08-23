/**
 * Phone
 */
public class ElectronicFactory {
    public Electronic create(ElectronicType type) {
        switch(type) {
            case PHONE: 
                return new Phone(); 
            case HEADSET: 
                return new Headset(); 
            case SPEAKER: 
                return new Speaker(); 
            case MONITOR: 
                return new Monitor(); 
            default: 
                return null; 
        }
    }
}