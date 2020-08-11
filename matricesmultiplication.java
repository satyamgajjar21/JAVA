/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationarray;

/**
 *
 * @author 91909
 */
public class Multiplicationarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
    int b[][] = {{1,3,4},{2,4,3},{3,4,5}}; 
    
    int c[][] = new int[3][3];
    
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            c[i][j]=0;
            for(int k=0;k<3;k++)
            {
                c[i][j]+=a[i][k]*b[k][j];
            }
            System.out.println(c[i][j]+" ");
            
        }
        System.out.println();
    }
    }
    
}




//output
//19 
//31 
//33 

//19 
//34 
//35 

//26 
//45 
//49 
