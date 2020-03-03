public class SortOfSort {

    public static void sortOfSort(int[] arr){
        //counter is used to know if the largest value is going at the beginning or the end of the array
        int counter  = 0;

        //start and end indexes are used to know the boundaries of the array as it is being sorted
        int startIndex = 0;
        int endIndex = arr.length-1;

        //max is the index of the maximum value in the array
        int max = 0;

        //this boolean is used to place the maximum value at the beginning or the end of the array
        boolean lastIndex = true;

        //this is kind of a base case, where the array only has one value or no values and there's nothing to sort
        if(arr.length <= 1)
            return;

        for(int i = 0; i < arr.length; i++) {

            //first we look for the maximum value in the array
            max = findMax(arr, startIndex, endIndex);

            //this if is for when the maximum value goes at the end of the array
            if (lastIndex) {
                swapIndex(arr, max, endIndex);
                //endIndex decreases every time to know what is the upper boundary of what is left to be sorted
                endIndex--;
            }

            //this else if for when the maximum value goes at the beginning of the array
            else {
                swapIndex(arr, max, startIndex);
                startIndex++;
            }

            //counter always goes up with every iteration
            counter++;

            //when counter is larger than 2, it resets and changes the value of lastIndex to
            //indicate the next largest value is going to be at the opposite end of the array
            if (counter > 1) {
                counter = 0;
                lastIndex = !lastIndex;
            }
        }
    }

    //Helped method to find the index of the maximum value in an array within the start and end indexes
    //This method only returns the index of the maximum value as that's all we need for the sorting method, not the actual maximum value
    public static int findMax(int[] arr, int startIndex, int endIndex){
        if(startIndex == endIndex)
            return startIndex;
        int[] max = {Integer.MIN_VALUE, -1};
        for(int i = startIndex; i <= endIndex; i++){
            if(arr[i] > max[0]){
                max[0] = arr[i];
                max[1] = i;
            }
        }
        return max[1];
    }

    //Helper method to swap two values in an array
    public static void swapIndex(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}