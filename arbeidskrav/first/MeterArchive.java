import java.util.HashMap; 

public class MeterArchive
{
    private HashMap<Integer, Meter> meters; 
    private MeterArchive instance; 

    private MeterArchive()
    {
        instance = new MeterArchive(); 
        meters = new HashMap<Integer, Meter>(); 
    }

    public MeterArchive getInstance()
    {
        return instance; 
    }

    public boolean add(Meter meter)
    {
        if(meters.containsKey(meter.getId()))
            return false; 
        meters.put(meter.getId(), meter); 
        return true; 
    }

    public boolean remove(Meter meter) {
        if (!meters.containsKey(meter.getId()))
            return false; 
        meters.remove(meter.getId()); 
        return true; 
    }
}