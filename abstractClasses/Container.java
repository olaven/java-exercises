/**
 * Parent class for all containers
 */
public abstract class Container
{
    protected int volume; 

    //all inheritants will have to handle these constructor requirements
    public Container(int volume)
    {
        this.volume = volume; 
    }

    /**
     * Fill the container with something. 
     * I don't know how, so I don't want a body
     */
    public abstract void fill(); 

    /**
     * Empty the container. 
     * I don't know how, so I don't want a body
     */
    public abstract void empty(); 

}