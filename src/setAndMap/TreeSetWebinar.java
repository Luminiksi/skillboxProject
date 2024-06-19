package setAndMap;

import java.util.HashSet;
import java.util.Objects;

public class TreeSetWebinar {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        HashSet<Client> hashSet = new HashSet<>();

        Client alex = new Client("Alex", 1);
        Client sandra = new Client("Sandra", 2);
        Client sandraClone = new Client("Sandra", 2);

        hashSet.add(alex);
        hashSet.add(sandra);
        hashSet.add(sandraClone);

        for (Client client : hashSet) {
            System.out.println(client.getName() + " -> " + client.hashCode());
        }
        System.out.printf("hash %04d -> equals %04d%n", Client.getHashCodeCount(), Client.getEqualsCount());

        System.out.println(hashSet.size());
    }
}

class Client {
    static int hashCodeCount;
    static int equalsCount;
    private final String name;
    private final int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        hashCodeCount++;
        return Objects.hash(name, id);
    }

    public Client(String name, int id) {
        equalsCount++;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getHashCodeCount() {
        return hashCodeCount;
    }

    public static int getEqualsCount() {
        return equalsCount;
    }
}
