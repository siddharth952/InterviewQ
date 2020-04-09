package com.company.CodingBlocksClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Lecture16 {

    public static void main(String[] args) {

        int[] arr = {3,6,4,1,2};
        ArrayList<Integer> n = new ArrayList<>();
//        n.
//        System.out.println(Arrays.toString(divide(arr)));
    }




    public static int[] divide(int arr[]){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int first[] = divide(Arrays.copyOfRange(arr,0,mid));
        int second[] = divide(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(first,second);
    }

    public static int[] merge(int[] first,int[]second){

        int i=0,j=0,k=0;
        int mix[] = new int[first.length+second.length];


        while(i<first.length && j < second.length) {
            //[123] , [4,5]
            //
            if (first[i] < second[j]) {

                mix[k] = first[i];
                k++;
                i++;

            } else {
                mix[k] = second[j];
                k++;
                j++;
            }
        }
            //Insert into it remaining
            while(i<first.length){
                mix[k] = first[i];
                k++;
                i++;

            }
            while(j<second.length){
                mix[k] = second[j];
                k++;
                j++;

            }

        return mix;
    }

}
