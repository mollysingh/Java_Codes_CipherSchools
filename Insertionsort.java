import java.util.*;
class Insertionsort{

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String []args){
        int arr[]={7,8,3,1,2};

        //insertion sort
        for(int i=1;i<arr.length;i++){      //i starts from 1 because we consider element at 0 to be sorted
            int current=arr[i];             //the element from us part to be sent to s part
            int j=i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            //placement
            arr[j+1]=current;
        }

        printArray(arr);
    }
}