//first and last occurance of an element in a string

class Firstlast{

    public static int first=-1;
    public static int last=-1;          // they are declared static because their values are fixed and need not be updated in every stack layer call.

    public static void getIndices(String str, int index, char element){

        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if(str.charAt(index)==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        getIndices(str,index+1,element);
    }

    public static void main(String []args){
        String str="abaacdaefaah";
        getIndices(str,0,'a');

    }
}