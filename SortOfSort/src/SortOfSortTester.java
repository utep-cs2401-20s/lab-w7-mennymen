
import org.junit.jupiter.api.Test;

public class SortOfSortTester {
    int[] test1 = {3,1,8,2,7};

    @Test
    public void sortOfSortTester1() {
        int[] test1 = {3,1,-3,2,7};
        int [] bla = sortOfSort.sortOfSort(test1);

        for(int i = 0; i < bla.length;i++){
            System.out.println(bla[i]);
        }

    }

}
