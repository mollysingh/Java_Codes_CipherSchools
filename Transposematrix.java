//For a given matrix of N x M, print its transpose.

import java.util.*;
class Transposematrix{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //int arr1[][]=new int[cols][rows];

        System.out.println("Transpose Matrix:");

        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // for(int i=0;i<cols;i++){
        //     for(int j=0;j<rows;j++){
        //         System.out.print(arr1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        }
    }
