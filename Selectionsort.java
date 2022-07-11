import java.util.*;
class Selectionsort{

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String []args){
        int arr[]={7,8,3,1,2};


        //selection sort
        //outer loop runs n-1 times
        //time complexity=O(n^2), so even this is not an optimized sorting technique.

        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
        for (int j=i+1;j<arr.length;j++){   //j starts comparison from the next element after smallest(i) so starts from i+1; goes till length
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
        }

        printArray(arr);
    }
}