package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Enclosure> enclosures = new ArrayList<>();

    public void add(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void accept(ZooVisitor visitor) {
        for (Enclosure enclosure : enclosures) {
            enclosure.accept(visitor);
        }
    }
}
