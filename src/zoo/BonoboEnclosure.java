package zoo;

public class BonoboEnclosure implements Enclosure {
    private final int bonoboCount;
    private final boolean hasBabies;

    public BonoboEnclosure(int bonoboCount, boolean hasBabies) {
        this.bonoboCount = bonoboCount;
        this.hasBabies = hasBabies;
    }

    public int getBonoboCount() {
        return bonoboCount;
    }

    public boolean hasBabies() {
        return hasBabies;
    }

    @Override
    public void accept(ZooVisitor visitor) {
        visitor.visitBonoboEnclosure(this);
    }
}
