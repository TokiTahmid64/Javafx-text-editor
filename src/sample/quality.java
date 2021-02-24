package sample;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class quality {

    String f;

    public quality(String t) {
        f=t;
    }


    public void count()
    {
       // System.out.println(f);
        String[] keys = f.split("[\\s.,; ]");
       // System.out.println(keys.length);


        HashMap<String, Integer> capitalCities = new HashMap<String, Integer>();
        for(int j=0;j<keys.length;j++)
        {

            String s2=keys[j];
            Integer count=capitalCities.get(s2);
            if (count == null) {
                capitalCities.put(s2, 1);
            } else {
                capitalCities.put(s2, count+1);
            }
            //capitalCities.put(s2,count+1);
           // System.out.println(s2);

        }
        Map<String, Integer> hm1 = sortByValue(capitalCities);
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }

     // System.out.println(capitalCities);

    }

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
