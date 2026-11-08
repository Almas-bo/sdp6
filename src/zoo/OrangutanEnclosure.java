package zoo;

public class OrangutanEnclosure implements Enclosure {
    private final int orangutanCount;
    private final int treeHeightMeters;

    public OrangutanEnclosure(int orangutanCount, int treeHeightMeters) {
        this.orangutanCount = orangutanCount;
        this.treeHeightMeters = treeHeightMeters;
    }

    public int getOrangutanCount() {
        return orangutanCount;
    }

    public int getTreeHeightMeters() {
        return treeHeightMeters;
    }

    @Override
    public void accept(ZooVisitor visitor) {
        visitor.visitOrangutanEnclosure(this);
    }
}
