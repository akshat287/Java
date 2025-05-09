import java.util.*;
public class Array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][]num=new int[rows][cols];
        // int x=sc.nextInt();

        //input
        for(int i=0;i<rows;i++){
            //colums
            for(int j=0;j<cols;j++){
                num[i][j]=sc.nextInt();
            }
        }

        // //print
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         System.out.print(num[i][j]+" ");
        //     }System.out.println();
        // }

        // //Search
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         if(num[i][j]==x){
        //             System.out.println((i+1)+","+(j+1));
        //         }
        //     }
        //}

        // int rowstart=0,colstart=0,rowend=rows-1,colend=cols-1;

        // while(rowstart<=rowend && colstart<=colend){
        //     //1
        //     for(int col=colstart;col<=colend;col++){
        //         System.out.print(num[rowstart][col]+" ");
        //     }
        //     rowstart++;

        //     //2
        //     for(int row=rowstart;row<=rowend;row++){
        //         System.out.print(num[row][colend]+" ");
        //     }
        //     colend--;

        //     //3
        //     for(int col=colend;col>=colstart;col--){
        //         System.out.print(num[rowend][col]+" ");
        //     }
        //     rowend--;

        //     //4
        //     for(int row=rowend;row>=rowstart;row--){
        //         System.out.println(num[row][colstart]+" ");
        //     }
        //     colstart++;
        //     System.out.println();
        // }



        ///...Spiral_Print...///


        
    }
}