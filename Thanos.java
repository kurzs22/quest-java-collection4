import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet
        Map<Hero, Flower> party = new TreeMap<>();
        party.put(hulk, rose);
        party.put(thor, rose);
        party.put(scarletWitch, rose);
        party.put(vision, tulip);
        party.put(captainAmerica, lily);
        party.put(doctorStrange, violet);
        party.put(blackWidow, violet);
        
        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println("It is " + party.values().contains(begonia) + " that the TreeMap includes `begonia`.");

        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for(Entry<Hero,Flower> entry : party.entrySet()) {
            //System.out.print(entry.getKey().getName() + " has a ");
            System.out.println(entry.getValue().getName());
        }
    }
}
