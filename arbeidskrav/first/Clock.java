public class Clock extends Meter
{
    private double interval; 

    public Clock(double interval, int id, int location, boolean working)
    {
        super(location, working); 
        setInterval(interval); 
    }

    @Override
    public String toString()
    {
        return "" 
        + super.toString()
        + "\n interval: " + interval; 
    }

    public double getInterval()
    {
        return interval; 
    }

    public void setInterval(double interval)
    {
        this.interval = interval; 
    }
}