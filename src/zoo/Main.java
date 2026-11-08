package zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add(new GorillaEnclosure(5, true));
        zoo.add(new OrangutanEnclosure(3, 12));
        zoo.add(new BonoboEnclosure(6, true));

        VeterinarianVisitor veterinarian = new VeterinarianVisitor();
        zoo.accept(veterinarian);
        System.out.println("Enclosures treated: " + veterinarian.getTreatedEnclosures());

        System.out.println();

        GuestVisitor guest = new GuestVisitor();
        zoo.accept(guest);
        System.out.println("Total ticket price: " + guest.getTotalTicketPrice());
    }
}
