# Zoo Visitor Pattern

Assignment 6. Elements are primate enclosures, visitors are a veterinarian and a guest.

- `Enclosure` is the element interface with `accept(ZooVisitor)`
- `GorillaEnclosure`, `OrangutanEnclosure`, `BonoboEnclosure` are concrete elements
- `ZooVisitor` has one `visit` method per enclosure type
- `VeterinarianVisitor`, `GuestVisitor` are concrete visitors
- `Zoo` is the object structure that holds enclosures

Run:

    javac -d out src/zoo/*.java
    java -cp out zoo.Main
