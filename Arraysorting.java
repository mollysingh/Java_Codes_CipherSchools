//check if the array is sorted( strictly increasing )

class Arraysorting{

    public static boolean isSorted(int arr[],int index){

        if(index==arr.length-1){
            return true;
        }

        if(arr[index]>=arr[index+1]){

            return false;
        }

        
        return isSorted(arr,index+1);
        
    }


    public static void main(String []args){
        int arr[]={1,3,5};
        System.out.print(isSorted(arr,0));
    }
}