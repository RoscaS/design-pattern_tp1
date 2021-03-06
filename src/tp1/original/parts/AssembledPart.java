package tp1.original.parts;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;

public class AssembledPart implements Serializable {

    public AssembledPart(Dimension3D dimensions) {
        this.parts = new LinkedList<Part>();
        this.dimensions = dimensions;
    }

    public double getWeight() {
        double w = 0;
        for (Part p : parts)
            w += p.getWeight();
        return w;
    }

    public Dimension3D getDimensions() {
        return this.dimensions;
    }

    int getNumberOfElements() {
        return this.parts.size();
    }

    public void addPart(Part part) {
        this.parts.add(part);
    }


    public double getVolume() {
        return this.dimensions.x * this.dimensions.y * this.dimensions.z;
    }

    public String toString() {
        return "Assembled[" + this.parts.toString() + ":" + this.dimensions + "]";
    }

    private static final long serialVersionUID = -2805555670934919157L;

    private final Collection<Part> parts;
    final private Dimension3D dimensions;
}
