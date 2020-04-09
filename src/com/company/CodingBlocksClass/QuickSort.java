package com.company.CodingBlocksClass;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int ar[] = {3,6,4,1,2};



        quick(ar,0,ar.length);
        System.out.println(Arrays.toString(ar));
    }

    class Three{

    }


    public static void quick(int ar[],int start,int end){
        if(end <= start){
            return;
        }

        int pivot = end -1;

        pivot = pivotUpdate(ar,start,pivot);

        quick(ar,start,pivot);
        quick(ar,pivot+1,end);



    }

    public static int pivotUpdate(int ar[],int start,int pivot){

            int i = start;
            int j = start;
            for(i = start;i<pivot;){
                if(ar[i] < pivot){
                    //swap
                    int temp = ar[i];
                    ar[j] = pivot;
                    pivot = temp;
                    j++;
                }
                i++;
            }

            int temp = ar[j];
            ar[j] = pivot;
            pivot = temp;

            return j;

    }


}
