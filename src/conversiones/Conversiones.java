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
public class Conversiones {

    ObjetoRobot robot = new ObjetoRobot();
    
    String valorObtenidoDelTeclado = "";
    char inv;
    double exp=0;
    String inv2="";
    
    

    public boolean comprobarSiEsBinario(String numero){
        
        int longitud=numero.length();
        String num="";
        boolean validacion=true;
        
        do{  
            num=""+numero.charAt(longitud-1);
            
            if (num.equalsIgnoreCase("1") || num.equalsIgnoreCase("0")){
                validacion=true;
            }else{
                JOptionPane.showMessageDialog(null, " El número no corresponde a un Binario");
                validacion =false;
            }
            
            longitud--;
            
        }while (longitud>=1 && validacion);   
        
        return validacion;
    }
    
    
    public int binarioADecimal(String Decimal){
        
        int nVeces = Decimal.length();
        double pot=0;
        double resultado=0;

        while(nVeces>=1){

            inv = Decimal.charAt(nVeces-1);
            inv2=""+ inv;

           if ((inv2.equalsIgnoreCase("1"))){          

               pot=Math.pow(2, exp);
               resultado+=pot;
           }

           exp++;
           nVeces--;     
        }     

            return (int)resultado;    
    }
}
