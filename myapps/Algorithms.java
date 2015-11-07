package com.example.priyanka.myapps;

/**
 * Created by PRIYANKA on 10/28/2015.
 */
public class Algorithms {
    public static int[] arrayNaturalNUmbers(int size){

        int index = 0;
        int[] array = new int[size];
        for(int i=0;i<array.length;i++){
            array[index++]= i+1;
        }
        return array;
    }

    public static int[] arrayRandomNumbers(int size){

        int index = 0;
        int[] array = new int[size];
        for(int i=0;i<array.length;i++){
            array[index++]= (int)Math.random()*100;
        }
        return array;
    }

    public static int[] arrayDecendingNumbers(int size){

        int index = 0;
        int[] array = new int[size];
        for(int i=array.length-1;i>=0;i--){
            array[index++]= i+1;
        }
        return array;
    }
    public static int[] bubbleSort(int[] array){

        int i,j,  temp=0;
        for(i=0;i<array.length-1;i++){
            for(j=array.length-1;j>i;j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array){

        int i,j,temp;
        for(i=0;i<array.length;i++){
            int minpos = i;
            for(j=i+1;j<array.length;j++){
                if(array[j]<array[minpos]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] array){

        int i,j,next;
        for(i=0;i<array.length-1;i++){
            next = array[i];
            j = i;
            while(j>0 && array[j-1]>next){
                array[j] = array[j-1];
                j--;
            }
            array[j] = next;
        }
        return array;
    }


}
