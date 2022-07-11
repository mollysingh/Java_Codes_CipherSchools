//factorial
class Recursion4{

    public static int calcFact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*calcFact(n-1);
    }

    public static void main(String []args){
        int n=5;
        System.out.print(calcFact(5));
    }
}