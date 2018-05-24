public abstract class HighLowMeter extends Meter
{
    private double lowest;
    private double highest;

    public HighLowMeter()
    {
        super(); 
        setLowest(-1); 
        setHighest(-1); 
    }
    public HighLowMeter(double lowest, double highest, int location, boolean working) 
    {
        super(location, working); 
        setLowest(lowest); 
        setHighest(highest); 
    }

    @Override
    public String toString()
    {
        return "" 
        + super.toString()
        + "\nlowest: " + lowest
        + "\nhighest: " + highest; 
    }

    public double getLowest() {
        return lowest;
    }

    public double getHighest() {
        return highest;
    }

    public void setLowest(double lowest) {
        this.lowest = lowest;
    }

    public void setHighest(double highest) {
        this.highest = highest;
    }
}