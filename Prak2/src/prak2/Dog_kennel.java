package prak2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dog_kennel {
    private ArrayList<Dog> kennel;

    public Dog_kennel(Dog[] ken)
    {
        this.kennel = new ArrayList<>();
        for(Dog k : ken)
        {
            this.kennel.add(k);
        }
    }

    public void addDog(Dog dog)
    {
        this.kennel.add(dog);
    }

    public void add_many_Dogs(Dog[] ken)
    {
        for(Dog k : ken)
        {
            this.kennel.add(k);
        }
    }

    public String toString()
    {
        String str = "";
        for(Dog ken : kennel)
        {
            str += ken.toString() + "\n";
        }
        return str;
    }

    public int how_many_Dogs()
    {
        return kennel.size();
    }
    public String[] names_of_Dogs()
    {
        String[] names = new String[kennel.size()];
        for(int i = 0; i < kennel.size(); i++)
        {
            names[i] = kennel.get(i).getName();
        }
        return names;
    }

    public int[] ages_of_Dogs()
    {
        int[] ages = new int[kennel.size()];
        for(int i = 0; i < kennel.size(); i++)
        {
            ages[i] = kennel.get(i).getAge();
        }
        return ages;
    }
}
