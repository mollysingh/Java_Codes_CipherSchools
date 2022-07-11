import java.util.*;
class Bubblesort{

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String []args){
        int arr[]={7,8,3,1,2};

        //bubble sort
        //time complexity = O(n^2)->which is not a good time complexity for sorting. We can do sorting in much less time with much less complexity
        //so bubble sort is not preferred.
        for(int i=0;i<arr.length-1;i++){        //O(n-1)
            for(int j=0;j<arr.length-i-1;j++){  //O(n^2)
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        printArray(arr);
    }
}