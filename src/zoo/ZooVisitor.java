package zoo;

public interface ZooVisitor {
    void visitGorillaEnclosure(GorillaEnclosure enclosure);
    void visitOrangutanEnclosure(OrangutanEnclosure enclosure);
    void visitBonoboEnclosure(BonoboEnclosure enclosure);
}
