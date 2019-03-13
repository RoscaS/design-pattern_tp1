package tp1.updated.parts;

import java.io.Serializable;


public class Dimension3D implements Serializable {

    public Dimension3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }


    private static final long serialVersionUID = 8578422516218299513L;
    public final double x;
    public final double y;
    public final double z;
}
