package tp1.tp1B.parts;

import tp1.tp1A.parts.Component;
import tp1.tp1A.parts.Dimension3D;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;


public abstract class CompositeComponent implements tp1.tp1A.parts.Component, Serializable {

    public CompositeComponent() {
        components = new LinkedList<>();
    }

    public int getNumberOfElements() {
        return this.components.size();
    }

    public void addPart(tp1.tp1A.parts.Component part) {
        this.components.add(part);
    }

    @Override
    public double getWeight() {
        double w = 0;
        for (tp1.tp1A.parts.Component p : components) {
            w += p.getWeight();
        }
        return w;
    }

    @Override
    public tp1.tp1A.parts.Dimension3D getDimensions() {
        tp1.tp1A.parts.Dimension3D total = new tp1.tp1A.parts.Dimension3D(0, 0, 0);

        for (tp1.tp1A.parts.Component component : components) {
            tp1.tp1A.parts.Dimension3D dimensions = component.getDimensions();
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
