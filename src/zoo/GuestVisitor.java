package zoo;

public class GuestVisitor implements ZooVisitor {
    private int totalTicketPrice = 0;

    @Override
    public void visitGorillaEnclosure(GorillaEnclosure enclosure) {
        System.out.println("Guest: watching " + enclosure.getGorillaCount() + " gorillas, ticket 10");
        totalTicketPrice += 10;
    }

    @Override
    public void visitOrangutanEnclosure(OrangutanEnclosure enclosure) {
        System.out.println("Guest: watching " + enclosure.getOrangutanCount() + " orangutans climb, ticket 8");
        totalTicketPrice += 8;
    }

    @Override
    public void visitBonoboEnclosure(BonoboEnclosure enclosure) {
        System.out.println("Guest: watching " + enclosure.getBonoboCount() + " bonobos, ticket 12");
        totalTicketPrice += 12;
    }

    public int getTotalTicketPrice() {
        return totalTicketPrice;
    }
}
