
/**
 * A BoopleSnoot is Mr. Jaffe's animal
 * 
 * @author Mr. Jaffe
 * @version 1.0 2017-07-14
 */
public class BartolomeEva extends Animal
{
    public BartolomeEva() {
        super("Eva Bartolome", "grey", 2);
    }

    // Override methods
    @Override
    public String speak() {
        return "honk honk";
    }

    @Override
    public String getDisposition() {
        return "aggressive or defensive";
    }

    @Override
    public String getName() {
        return "Marty";
    }
    
    public String getType() {
        return "Ostrich";
    }
}
