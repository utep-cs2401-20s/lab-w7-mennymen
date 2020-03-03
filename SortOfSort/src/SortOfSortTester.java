import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortOfSortTester {

    //This test looks at an array with integers in no order, with some repeated values
    //Test passed
    @Test
    public void sortOfSortTester1() {
        int[] test1 = {7,6,1,9,5,3,7,0,4,3,1,8,7};
        SortOfSort.sortOfSort(test1);
        assertArrayEquals(test1, new int[] {7,7,5,4,1,1,0,3,3,6,7,8,9});
        }

    //This test looks at an array of positive integers that is already sorted (not sort of sorted)
    //Test passed
    @Test
    public void sortOfSortTester2(){
        int[] test2 = {1,2,3,4,5,6,7};
        SortOfSort.sortOfSort(test2);
        assertArrayEquals(test2, new int[] {5,4,1,2,3,6,7});
    }

    //This test looks at repeated numbers
    //Test passed
    @Test
    public void sortOfSortTester3(){
        int[] test3 = {1,4,1,4,1,4};
        SortOfSort.sortOfSort(test3);
        assertArrayEquals(test3, new int[] {4,1,1,1,4,4});
    }

    //This test looks at negative and positive numbers
    //Test passed
    @Test
    public void sortOfSortTester4(){
        int[] test4 = {-1,2,-3,4,0,-5,6,-7};
        SortOfSort.sortOfSort(test4);
        assertArrayEquals(test4, new int[] {2,0,-5,-7,-3,-1,4,6});
    }

    //This test only verifies that if the method receives an array that's already sort of sorted, it won't move anything
    //Test passed
    @Test
    public void sortOfSortTester5(){
        int[] test5 = {8,7,4,3,1,2,5,6,9,10};
        SortOfSort.sortOfSort(test5);
        assertArrayEquals(test5, new int[] {8,7,4,3,1,2,5,6,9,10});
    }
}