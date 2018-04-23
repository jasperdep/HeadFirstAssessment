import java.util.HashMap;
import java.util.LinkedHashMap;

public class Trein {

    private HashMap<String, Nameable> stoelen = new LinkedHashMap<String, Nameable>();
    private Machinist machinist;

    public Trein(Machinist machinist){
        this.machinist = machinist;
    }


    public Nameable uitstappen(String name){
        if (!stoelen.containsKey(name)) {
            System.out.println(name + " is uitgestapt.");
            return null;
        }

        Nameable uitgestapte = stoelen.get(name);
        stoelen.remove(name);
        showInfo(uitgestapte, " is uitgestapt.");
        return uitgestapte;
    }


    public void instappen(Nameable nameable) {
        String key = nameable.getName();
        Nameable value = nameable;
        this.stoelen.put(key, value);
        showInfo(nameable, " is ingestapt.");
    }

    public void showInfo(Nameable mens, String actie){
        {
            System.out.println(mens.getName()+ actie);
        }

    }

    private int getCount() {
        return stoelen.size();
    }

    public String toString() {
        return "Er zitten "+ getCount() +" reizigers in de bus";
    }

    public String[] getNames(){
        String[] names = new String[getCount()];
        int i = 0;
        for ( String key : stoelen.keySet() ) {
            names[i] = key;
            i++;
        }
        return names;
    }

    public void printNames()
    {
        System.out.println("Deze reizigers zitten in de trein:");
        for(HashMap.Entry<String, Nameable> entry : stoelen.entrySet()) {
            String key = entry.getKey();
            System.out.println("- "+key);
        }
    }

    public void info(){
        System.out.println(this);
    }

}
