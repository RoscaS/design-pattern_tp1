package tp1.updated.parts;


public class AssembledPart extends CompositeComponent {

    public AssembledPart(Dimension3D dimensions) {
        this.dimensions = dimensions;
    }

    public double getVolume() {
        return this.dimensions.x * this.dimensions.y * this.dimensions.z;
    }

    @Override
    public Dimension3D getDimensions() {
        return this.dimensions;
    }

    @Override
    public String toString() {
        return "Assembled[" + this.components.toString() + ":" + this.dimensions + "]";
    }

	/*------------------------------------------------------------------*\
	|*							Attributs 						        *|
	\*------------------------------------------------------------------*/

    private static final long serialVersionUID = -2805555670934919157L;

    final private Dimension3D dimensions;
}
