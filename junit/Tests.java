import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {
    Integer[] array; 
    Sorts sort = new Sorts(new Comparator());

    private void unsortODD(){
        array[0] = 5;
        array[1] = 3;
        array[2] = 8;
        array[3] = 6;
        array[4] = 1;
    }

    private void unsortEVEN(){
        array[0] = 5;
        array[1] = 3;
        array[2] = 6;
        array[3] = 1;
    }

    @Test
    public void GnomeSort(){
        array = new Integer[5];
        unsortODD();
        sort.GnomeSort(array);
        assertEquals((Integer) 1, array[0]);
        assertEquals((Integer) 3, array[1]);
        assertEquals((Integer) 5, array[2]);
        assertEquals((Integer) 6, array[3]);
        assertEquals((Integer) 8, array[4]);

        array = new Integer[4];
        unsortEVEN();
        sort.GnomeSort(array);
        assertEquals((Integer) 1, array[0]);
        assertEquals((Integer) 3, array[1]);
        assertEquals((Integer) 5, array[2]);
        assertEquals((Integer) 6, array[3]);
    }

    @Test
    public void BubbleSort(){
        array = new Integer[5];
        unsortODD();
        sort.BubbleSort(array);
        assertEquals((Integer) 1, array[0]);
        assertEquals((Integer) 3, array[1]);
        assertEquals((Integer) 5, array[2]);
        assertEquals((Integer) 6, array[3]);
        assertEquals((Integer) 8, array[4]);

        array = new Integer[4];
        unsortEVEN();
        sort.BubbleSort(array);
        assertEquals((Integer) 1, array[0]);
        assertEquals((Integer) 3, array[1]);
        assertEquals((Integer) 5, array[2]);
        assertEquals((Integer) 6, array[3]);
    }

    @Test
    public void MergeSort(){
        array = new Integer[5];
        unsortODD();
        sort.MergeSort(array, 0 , 4);
        assertEquals((Integer) 1, array[0]);
        assertEquals((Integer) 3, array[1]);
        assertEquals((Integer) 5, array[2]);
        assertEquals((Integer) 6, array[3]);
        assertEquals((Integer) 8, array[4]);

        array = new Integer[4];
        unsortEVEN();
        sort.MergeSort(array, 0 , 3);
        assertEquals((Integer) 1, array[0]);
        assertEquals((Integer) 3, array[1]);
        assertEquals((Integer) 5, array[2]);
        assertEquals((Integer) 6, array[3]);
    }

    @Test
    public void QuickSort(){
        array = new Integer[5];
        unsortODD();
        sort.QuickSort(array, 0 , 4);
        assertEquals((Integer) 1, array[0]);
        assertEquals((Integer) 3, array[1]);
        assertEquals((Integer) 5, array[2]);
        assertEquals((Integer) 6, array[3]);
        assertEquals((Integer) 8, array[4]);

        array = new Integer[4];
        unsortEVEN();
        sort.QuickSort(array, 0 , 3);
        assertEquals((Integer) 1, array[0]);
        assertEquals((Integer) 3, array[1]);
        assertEquals((Integer) 5, array[2]);
        assertEquals((Integer) 6, array[3]);
    }

    @Test
    public void RadixSort(){
        array = new Integer[5];
        unsortODD();
        sort.RadixSort(array);
        assertEquals((Integer) 1, array[0]);
        assertEquals((Integer) 3, array[1]);
        assertEquals((Integer) 5, array[2]);
        assertEquals((Integer) 6, array[3]);
        assertEquals((Integer) 8, array[4]);

        array = new Integer[4];
        unsortEVEN();
        sort.RadixSort(array);
        assertEquals((Integer) 1, array[0]);
        assertEquals((Integer) 3, array[1]);
        assertEquals((Integer) 5, array[2]);
        assertEquals((Integer) 6, array[3]);
    }


}
