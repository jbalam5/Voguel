/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author jesus
 */
public class Voguel {
    public int[] SortBurbuja(int arreglo[])
    {   
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] > arreglo[j + 1])
                {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        return arreglo;
    }
    
    public int getDemanda(int sortRow[]){
        SortBurbuja(sortRow);
        return sortRow[1] - sortRow[0];
        /*for(int i = 0; i < sortRow.length; i++ ){
                Multa[i] = sortRow[1] - sortRow[0];    
                System.outprintln(Multa[i]);
            }
        */
    }
    
    public void columns(int[][] arreglo, int index){
        System.out.print("index: "+index);
         for(int i = 0; i < arreglo.length; i++){
             System.out.println("col: "+arreglo[i][0]);
         }
    }
}
