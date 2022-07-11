//print fibonacci till nth term
class Recursion5{

    public static int fib(int i){
        if(i==0 || i==1){
                return i;
        }

        return fib(i-1)+fib(i-2);
    }


    public static void main(String args[]){
        int n=6;
        for(int i=0;i<6;i++){
            System.out.print(fib(i)+" ");
        }
    }
}