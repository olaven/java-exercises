/**
 * Describes a purse
 */
public class Purse extends Container {
    public Purse(int volume) {
        //have to call this constructor as it has required paramters
        super(volume);
    }

    @Override
    public void fill() {
        System.out.println("This is how a purse fills up");
    }

    @Override
    public void empty() {
        System.out.println("This is how a purse empties");
    }
}