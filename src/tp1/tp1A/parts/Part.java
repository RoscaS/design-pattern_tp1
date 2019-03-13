package tp1.tp1A.parts;

import java.io.Serializable;


public class Part implements Component, Serializable {

    public Part(String name, Dimension3D dimensions, double weight) {
        this.dimensions = dimensions;
        this.name = name;
        this.weight = weight;
    }

    public double getVolume() {
        return this.dimensions.x * this.dimensions.y * this.dimensions.z;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public Dimension3D getDimensions() {
        return this.dimensions;
    }

    @Override
    public String toString() {
        return "Part[" + this.name + "," + this.dimensions + "," + this.weight + "]";
    }

    /*------------------------------------------------------------------*\
   	|*							Attributs 						        *|
   	\*------------------------------------------------------------------*/

    final static private long serialVersionUID = -8298269984120412487L;

	final private String name;
	final private double weight;
	final private Dimension3D dimensions;
}
