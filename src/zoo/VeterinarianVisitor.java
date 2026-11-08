package zoo;

public class VeterinarianVisitor implements ZooVisitor {
    private int treatedEnclosures = 0;

    @Override
    public void visitGorillaEnclosure(GorillaEnclosure enclosure) {
        if (enclosure.isSilverbackSick()) {
            System.out.println("Vet: treating sick silverback, checking all " + enclosure.getGorillaCount() + " gorillas");
            treatedEnclosures++;
        } else {
            System.out.println("Vet: gorillas are healthy");
        }
    }

    @Override
    public void visitOrangutanEnclosure(OrangutanEnclosure enclosure) {
        if (enclosure.getTreeHeightMeters() > 10) {
            System.out.println("Vet: trees are high, checking " + enclosure.getOrangutanCount() + " orangutans for injuries");
            treatedEnclosures++;
        } else {
            System.out.println("Vet: orangutans are healthy");
        }
    }

    @Override
    public void visitBonoboEnclosure(BonoboEnclosure enclosure) {
        if (enclosure.hasBabies()) {
            System.out.println("Vet: vaccinating baby bonobos");
            treatedEnclosures++;
        } else {
            System.out.println("Vet: bonobos are healthy");
        }
    }

    public int getTreatedEnclosures() {
        return treatedEnclosures;
    }
}
