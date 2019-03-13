package tp1.updated.parts;


public class Machine extends CompositeComponent {

    public Machine() { }

    public void addAssembledPart(Component part) {
        this.components.add(part);
    }

    @Override
    public String toString() {
        return "Machine{\n " +
            this.components.toString() + "\n " +
            "dimensions=" + getDimensions() + "\n " +
            "weight=" + getWeight() + "\n}";
    }

    /*------------------------------------------------------------------*\
   	|*							Attributs 						        *|
   	\*------------------------------------------------------------------*/

    private static final long serialVersionUID = -4131418366537245416L;
}
