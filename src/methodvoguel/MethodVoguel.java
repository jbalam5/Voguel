/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodvoguel;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jesus
 */
public class MethodVoguel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] obj = new int[4][4];
        int[][] backupObj = new int[5][5];
        
        obj[0][0] = 5;
        obj[0][1] = 2;
        obj[0][2] = 7;
        obj[0][3] = 3;
        
        obj[1][0] = 3;
        obj[1][1] = 6;
        obj[1][2] = 6;
        obj[1][3] = 1;
        
        obj[2][0] = 6;
        obj[2][1] = 1;
        obj[2][2] = 2;
        obj[2][3] = 4;
        
        obj[3][0] = 4;
        obj[3][1] = 3;
        obj[3][2] = 6;
        obj[3][3] = 6;
        
        
        backupObj[0][0] = 5;
        backupObj[0][1] = 2;
        backupObj[0][2] = 7;
        backupObj[0][3] = 3;
        
        backupObj[1][0] = 3;
        backupObj[1][1] = 6;
        backupObj[1][2] = 6;
        backupObj[1][3] = 1;
        
        backupObj[2][0] = 6;
        backupObj[2][1] = 1;
        backupObj[2][2] = 2;
        backupObj[2][3] = 4;
        
        backupObj[3][0] = 4;
        backupObj[3][1] = 3;
        backupObj[3][2] = 6;
        backupObj[3][3] = 6;
        
        Clases.Voguel CLSvoguel = new Clases.Voguel();
        
        for( int row = 0; row < obj.length; row ++){
            
            int demandaRow = CLSvoguel.getDemanda(obj[row]);
            CLSvoguel.columns(obj, 0);
            
            
            for( int col = 0; col <  obj[row].length  ; col ++){
            //    System.out.println(backupObj[row][col] );
                /*int[] sortCol = new int[obj.length];
                sortCol[row] = obj[col][row];
                int[] tempCol = CLSvoguel.SortBurbuja(sortCol);
                
                int demandaCol = CLSvoguel.getDemanda(tempCol);
                System.out.println("Demanda Columna: " +   +demandaCol );
*/
            }
        }
    }
}
