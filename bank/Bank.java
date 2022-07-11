package bank;

 class Account{
    //public String name;

    public void printName(){
        System.out.println("hello");
    }
}

class Bank{
    public static void main(String args){
        Account acc1=new Account();
        acc1.printName();
    }
    
}