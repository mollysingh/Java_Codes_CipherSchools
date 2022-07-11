public class Towerofhanoi{

    public static void hanoi(int n,String src, String helper, String dest){

        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }

        hanoi(n-1,src,dest,helper);             //step 1 to transfer n-1 disks from src to helper
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);              //step 2
        hanoi(n-1,helper,src,dest);                 //step 3
    }

    public static void main(String []args){
        int n=3;
        hanoi(n,"S","H","D");

    }

}