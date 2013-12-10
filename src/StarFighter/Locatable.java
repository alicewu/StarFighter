package StarFighter;

/**
 * Interface for Locatable objects containing methods to set and get the position of an object
 * @author Alice
 */
public interface Locatable
{
    /**
     * Abstract method to set an object's position to (x,y)
     * @param x Inputted x coordinate
     * @param y Inputted y coordinate
     */
    public void setPos( int x, int y);
    
    /**
     * Abstract method to set an object's x position
     * @param x Inputted x coordinate
     */
    public void setX( int x );
    
    /**
     * Abstract method to set an object's y position
     * @param y Inputted y coordinate
     */
    public void setY( int y );
    
    /**
     * Abstract method to get an object's x position
     * @return X coordinate
     */
    public int getX();
    
    /**
     * Abstract method to get an object's y position
     * @return Y coordinate
     */
    public int getY();
}
