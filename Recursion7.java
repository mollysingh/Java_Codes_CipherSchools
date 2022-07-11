//print x^n (stack length=log n)

class Recursion7{

    public static int calcFact(int x,int n){
        if(n==0){
            return 1;
        }

        if(x==0){
            return 0;
        }
    
        if(n%2==0){
            return calcFact(x,n/2) * calcFact(x,n/2);
        }

        else{
            return calcFact(x,n/2) * calcFact(x,n/2) * x;
        }
    }


    public static void main(String []args){
        int x=2,n=6;
        System.out.print(calcFact(x,n));
    }
}