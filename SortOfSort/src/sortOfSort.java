public class sortOfSort {

    public static int[] sortOfSort(int[] arr){
        int counter = 0;
        int startIndex = 0;
        int endIndex = arr.length;
        boolean lastIndex = true;
        if(arr.length < 0)
            return arr;

        for(int i = 0; i < arr.length; i++){
            if(lastIndex){
                swapIndex(arr, findMax(arr, startIndex, endIndex), arr[arr.length-i-1]);
                endIndex--;
            }

            else{
                swapIndex(arr, findMax(arr, startIndex, endIndex), arr[i]);
                startIndex++;
            }
            counter++;

            if(counter == 2)
                counter = 0;
                lastIndex = !lastIndex;
        }
        return arr;
    }

    public static int findMax(int[] arr, int startIndex, int endIndex){
        int max = Integer.MIN_VALUE;
        for(int i = startIndex; i < endIndex; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int swapIndex(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
