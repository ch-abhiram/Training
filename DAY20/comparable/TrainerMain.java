package DAY20.comparable;

import java.util.*;

class Trainer {
    int id;
    String name;
    String sub;

    Trainer(int id, String name, String sub) {
        this.id = id;
        this.name = name;
        this.sub = sub;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sub;
    }
}

class TrainerComparator implements Comparator<Trainer> {
    @Override
    public int compare(Trainer t1, Trainer t2) {
        // Sort by id
        int idCompare = Integer.compare(t1.id, t2.id);

        // If id is same, sort by name
        if (idCompare == 0) {
            return t1.name.compareTo(t2.name);
        }

        return idCompare;
    }
}

public class TrainerMain {
    public static void main(String[] args) {

        ArrayList<Trainer> list = new ArrayList<>();

        list.add(new Trainer(3, "Prudhvi", "Java"));
        list.add(new Trainer(1, "Raj", "Python"));
        list.add(new Trainer(2, "Bal", "DSA"));
        list.add(new Trainer(2, "Arun", "C"));

        Collections.sort(list, new TrainerComparator());

        for (Trainer t : list) {
            System.out.println(t);
        }
    }
}
