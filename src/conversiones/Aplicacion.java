/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiones;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Aplicacion {
    
    
       public static void main (String [] args){
        
        Conversiones decimal = new Conversiones();
        ObjetoRobot robot = new ObjetoRobot();
        
        String numeroBinario="";
        boolean val=false;
        
       do{
           numeroBinario=robot.Leer("Digite el número binario a convertir: ");
           val=decimal.comprobarSiEsBinario(numeroBinario);
           
       }  while(val!=true);
       
      JOptionPane.showMessageDialog(null, " El número Binario " + numeroBinario + " corresponde al numero " + decimal.binarioADecimal(numeroBinario)+ " en decimal");
      JOptionPane.showMessageDialog(null, " Fin del programa.");
        
    }
    
}
