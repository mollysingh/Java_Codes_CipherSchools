class Recursion3{

    // public static int printSum(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     return n+printSum(n-1);

    // }

    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.print(sum);
            return;
        }

        sum+=i;
        printSum(i+1,n,sum);
    }

    public static void main(String []args){
        //int n;
        printSum(1,5,0);
    }
}