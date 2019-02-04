import java.util.ArrayList;
/**
 * Write a description of class GameManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameManager
{
    // instance variables - replace the example below with your own
    public ArrayList<Unit> units = new ArrayList<Unit>();
    /**
     * Constructor for objects of class GameManager
     */
    public GameManager()
    {
        // initialise instance variables
    }
    
    public void addUnit(Unit _unit){
        units.add(_unit);
    }
    
}
