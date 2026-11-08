package zoo;

public class GorillaEnclosure implements Enclosure {
    private final int gorillaCount;
    private final boolean silverbackSick;

    public GorillaEnclosure(int gorillaCount, boolean silverbackSick) {
        this.gorillaCount = gorillaCount;
        this.silverbackSick = silverbackSick;
    }

    public int getGorillaCount() {
        return gorillaCount;
    }

    public boolean isSilverbackSick() {
        return silverbackSick;
    }

    @Override
    public void accept(ZooVisitor visitor) {
        visitor.visitGorillaEnclosure(this);
    }
}
