package tp1.original.parts;

import java.io.Serializable;

public class Part implements Serializable {

    public Part(String name, Dimension3D dimensions, double weight) {
        this.name = name;
        this.dimensions = dimensions;
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public Dimension3D getDimensions() {
        return this.dimensions;
    }

    public double getVolume() {
        return this.dimensions.x * this.dimensions.y * this.dimensions.z;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Part[" + this.name + "," + this.dimensions + "," + this.weight + "]";
    }

    private static final long serialVersionUID = -8298269984120412487L;

    final private String name;
    final private double weight;
    final private Dimension3D dimensions;
}
