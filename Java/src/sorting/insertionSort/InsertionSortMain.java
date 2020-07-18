package sorting.insertionSort;

public class InsertionSortMain {
    public int[] insertionSort(int[] list) {
        int i; //outer loop
        int key;
        int j; //inner loop
        int temp; //for storing values while swap
        for (i = 1; i < list.length; i++) { //first element 0 is already sorted, we start from 1
            key = list[i]; //an item from 1 to the list.length
            j = i - 1; //inner loop for i-1 to 0 (elements to the left). For example, when i=1 we compare with element with index 0
            while (j >= 0 && key < list[j]) {  //key reaches value that it is not longer smaller than
                temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                //swap
                j--;
            }
        }
        return list;
    }
}
