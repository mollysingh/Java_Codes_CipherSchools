//print x^n (stack height=n)

class Recursion6{

    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }

        if(x==0){
            return 0;
        }

        return x*calcPower(x,n-1);
    }


    public static void main(String []args){

        int x=2,n=3;
        System.out.print(calcPower(x,n));
    }
}