package Sorting;

import java.util.Random;

public class QuickSort {

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int low, int high)
    {
        int i = low-1;
        int pivot = arr[high];
        for(int j = low;j < high;j++){
            if(arr[j] <= pivot)
            {
                i++;
                swap(arr,j,i);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public static void quickSort(int[] arr,int left,int right)
    {
        if(left<right)
        {
            int pi = partition(arr,left,right);
            quickSort(arr,left,pi-1);
            quickSort(arr,pi+1,right);
        }

    }

    public static void printArr(int[]arr)
    {
        for (int i:arr
             ) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,15,345,1234,1,5,1,6,6,32,0};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
