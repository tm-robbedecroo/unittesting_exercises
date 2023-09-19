package ex03_more_arrays;

import java.util.Arrays;

public class ArrayOfInts {

    //private final int[] aoi;

    public int[] findCommonElements(int[] a, int[]b){

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

}
