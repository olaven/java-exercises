/**
 * Describes a backpack
 */
public class BackPack extends Container{
    public BackPack(int x, int y, int volume){
        //have to call this constructor as it has required paramters
        super(volume); 
    }

    @Override
    public void fill()
    {
        System.out.println("This is how a backpack fills up"); 
    }

    @Override
    public void empty()
    {
        System.out.println("This is how a backpack empties");
    }
}