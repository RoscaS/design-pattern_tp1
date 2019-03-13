package tp1.tp1A.parts;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;


public abstract class CompositeComponent implements Component, Serializable {

    public CompositeComponent() {
        components = new LinkedList<>();
    }

    public int getNumberOfElements() {
        return this.components.size();
    }

    public void addPart(Component part) {
        this.components.add(part);
    }

    @Override
    public double getWeight() {
        double w = 0;
        for (Component p : components) {
            w += p.getWeight();
        }
        return w;
    }

    @Override
    public Dimension3D getDimensions() {
        Dimension3D total = new Dimension3D(0, 0, 0);

        for (Component component : components) {
            Dimension3D dimensions = component.getDimensions();
            double x = total.x + dimensions.x;
            double y = Math.max(total.y, dimensions.y);
            double z = Math.max(total.z, dimensions.z);
            total = new Dimension3D(x, y, z);
        }
        return total;
    }

    /*------------------------------------------------------------------*\
    |*							Private Attributs 						*|
    \*------------------------------------------------------------------*/

    final protected Collection<Component> components;
}
