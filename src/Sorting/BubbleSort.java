package Sorting;

public class BubbleSort {
    static void swap(int arr[],int index1,int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void bubbleSort(int[] arr)
    {
        int n  = arr.length;
        boolean isSwap;
        for(int i = 0; i< n-1; i++)
        {
            isSwap = false;
            for(int j=0; j < n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    isSwap = true;
                    swap(arr,j,j+1);
                }
            }
            if(isSwap == false)
            {
                break;
            }
        }
    }
    static void printArr(int[] arr)
    {
        for (int i : arr
             ) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 8 };
        bubbleSort(arr);
        printArr(arr);
    }
}
