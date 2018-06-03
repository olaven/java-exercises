/**
 * Meant for things that can fly. 
 * 
 *  Both Plane and Bird will implement this class, although they 
 * are very different in most respects other than the fact that 
 * they may fly. 
 * 
 * These differences, makes an abstract class unsuitable, but an 
 * interface just right.
 */
public interface CanFly
{
    void fly();
}