/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package txtreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class Txtreader {

    /**
     * @param args the command line arguments
     */
    
    String[]ms=new String [0];
    String ss="";
    public void read () throws FileNotFoundException{
  
  
        try {
            InputStream doc= new FileInputStream("C:/1.txt");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(doc,
                                                                     "Cp1251") );
            
            String [] ms1 = new String[0];
            String ss1 = "";
            Vector v=new Vector();
            
            // открываем поток для чтения
          
            String str1 = "";
            // читаем содержимое
            while ((str1 = br1.readLine()) != null) {
                
             
                v.add(str1);
                
                
            }
           
            System.out.println(v);
        } catch (IOException ex) {
            Logger.getLogger(Txtreader.class.getName()).log(Level.SEVERE, null, ex);
        }

        

    }
    public static void main(String[] args) {
        Txtreader tr=new Txtreader();
        try {
           tr.read();
            // TODO code application logic here
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Txtreader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

  
}
