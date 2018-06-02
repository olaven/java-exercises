import java.util.HashMap; 
import java.util.List;
import java.util.ArrayList;

public class MeterArchive
{
    private HashMap<Integer, Meter> meters; 

    public MeterArchive()
    {
        meters = new HashMap<Integer, Meter>(); 
    }


    /**
     * Returns all meters as a List  
     */
    public List<Meter> getMeters()
    {
        ArrayList<Meter> list = new ArrayList<Meter>(); 
        for(Meter meter : meters.values())
        {
            list.add(meter); 
        }
        return list;
    }

    /**
     * Adds a meter 
     * Returns true if successful, false if not
     * @param meter the meter to add
     */
    public boolean add(Meter meter)
    {
        if(meters.containsKey(meter.getId()))
            return false; 
        meters.put(meter.getId(), meter); 
        return true; 
    }

    /**
     * Removes a meter 
     * Returns true if successful, false if not
     * @param meter the meter to remove  
     */
    public boolean remove(Meter meter) {
        if (!meters.containsKey(meter.getId()))
            return false; 
        meters.remove(meter.getId()); 
        return true; 
    }

    /**
     * Meter's location is altered 
     * Returns true if successful, false if not 
     * @param id the id of the meter 
     * @param location the new location value 
     */
    public boolean alterLocation(int id, int location)
    {
        if(archiveContains(id))
        {
            meters.get(id).setLocation(location);
            return true; 
        }
        return false; 
    }

    /**
     * Meter's working-status is changed 
     * Returns true if successful, false if not 
     * @param id the id of the meter 
     */
    public boolean alterWorking(int id)
    {
        if(archiveContains(id))
        {
            meters.get(id).setWorking(!meters.get(id).getWorking()); 
            return true;
        }
        return false; 
    }

    /**
     * Retunrs true if archive contains meter 
     * Made to improve readability in rest of class 
     * @param id id of meter 
     */
    private boolean archiveContains(int id)
    {
        if (meters.containsKey(id))
            return true; 
        return false; 
    }
}