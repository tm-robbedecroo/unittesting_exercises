package ex03_more_arrays;

import java.util.Arrays;
import java.util.Objects;

public class ArrayOfInts {

    //private final int[] aoi;

    public int[] findCommonElements(int[] a, int[] b){

        boolean hit = false;
        int count = 0;

        int[] c = Arrays.copyOf(a, a.length);
        int[] d = new int[Math.min(a.length, b.length)];
        Arrays.sort(c);

        for(int i = 0; i < c.length; i++){

            //check of het al in nieuwe lijst staat
            for(int j = 0; j < d.length; j++){
                if(d[j] == c[i]) hit = true;
            }

            if(!hit){
                for(int j = 0; j < b.length; j++){
                    if(c[i] == b[j]) d[count++] = c[i];
                }
            }

            hit = false;

        }

        if(count == 0) return new int[]{};

        return d;
    }

    public Integer[] findCommonElementsInteger(Integer[] a, Integer[] b)
    {
        boolean hit = false;
        int count = 0;

        Integer[] c = Arrays.copyOf(a, a.length);
        Integer[] e = Arrays.copyOf(b, b.length);

        Integer[] f = new Integer[c.length];
        Integer[] g = new Integer[e.length];

        Integer[] aList, bList;

        for(int i = 0; i < c.length; i++)
        {
            if(c[i] != null) f[count++] = c[i];
        }
        if(count == 0) return new Integer[]{};
        aList = new Integer[count];
        for(int i = 0; i < count; i++){
            aList[i] = f[i];
        }

        count = 0;
        for(int i = 0; i < e.length; i++)
        {
            if(e[i] != null) g[count++] = e[i];
        }
        if(count == 0) return new Integer[]{};
        bList = new Integer[count];
        for(int i = 0; i < count; i++)
        {
            bList[i] = g[i];
        }

        count = 0;

        Integer[] d = new Integer[Math.min(aList.length, bList.length)];
        Arrays.sort(aList);

        for(int i = 0; i < aList.length; i++){

            //check of het al in nieuwe lijst staat
            for(int j = 0; j < d.length; j++){
                if(d[j] == aList[i]) hit = true;
            }

            if(!hit){
                for(int j = 0; j < bList.length; j++){
                    if(aList[i] == bList[j]) d[count++] = aList[i];
                }
            }

            hit = false;

        }

        if(count == 0) return new Integer[]{};

        return d;

    }

    public int[] findDuplicateValues(int[] list){

        if(list == null || list.length == 0) return new int[]{};
        int[] listOfDupes = new int[list.length];

        boolean hit = false;
        int count = 0;

        for(int i = 0; i < list.length - 1; i++)
        {
            for(int j = i + 1; j < list.length; j++)
            {
                if(list[i] == list[j])
                {
                    for(int x = 0; x < listOfDupes.length; x++)
                    {
                        if(list[i] == listOfDupes[x]) hit = true;
                    }

                    if(!hit) listOfDupes[count++] = list[i];
                    hit = false;
                }
            }
        }

        if(count == 0) return new int[]{};
        int[] finalList = new int[count];
        for(int i = 0; i < count; i++)
        {
            finalList[i] = listOfDupes[i];
        }

        return finalList;

    }

    public Integer[] findDuplicateValuesInteger(Integer[] list){

        if(list == null || list.length == 0) return new Integer[]{};
        Integer[] listOfDupes = new Integer[list.length];

        boolean hit = false;
        int count = 0;

        //filter null
        Integer[] a = new Integer[list.length];
        for(int i = 0; i < list.length; i++) { if(list[i] != null) a[count++] = list[i]; }
        if(count == 0) return new Integer[]{};
        Integer[] aList = new Integer[count];
        for(int i = 0; i < aList.length; i++)
        {
            aList[i] = a[i];
        }

        count = 0;

        for(int i = 0; i < aList.length - 1; i++)
        {
            for(int j = i + 1; j < aList.length; j++)
            {
                if(aList[i] == aList[j])
                {
                    for(int x = 0; x < listOfDupes.length; x++)
                    {
                        if(aList[i] == listOfDupes[x]) hit = true;
                    }

                    if(!hit) listOfDupes[count++] = aList[i];
                    hit = false;
                }
            }
        }

        if(count == 0) return new Integer[]{};
        Integer[] finalList = new Integer[count];
        for(int i = 0; i < count; i++)
        {
            finalList[i] = listOfDupes[i];
        }

        return finalList;

    }

}
