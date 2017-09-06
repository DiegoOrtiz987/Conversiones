
/**
 * -------------------------
 * Fecha: 4/09/2017
 * @author: Diego Alexander Ortiz Diaz
 * -------------------------
 */

package conversiones;

import javax.swing.JOptionPane;


public class ObjetoRobot {
    
    public boolean pedirNuevamente=true; 
	
        // Obtener un String
    
	public String Leer (String mensaje)
	{
		String  valorObtenido="";
                
		try {
			valorObtenido = JOptionPane.showInputDialog(null,mensaje);
			pedirNuevamente= false; 
		    
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente= true;
		}
		
		return valorObtenido;
	}
	
        // Conversión a Entero
        
	public int Leer2 (String mensaje)
	{
		String  valorObtenidoDelTeclado;
		int valorConvertido=0;
                
                do{
                    try {
                            /*InputStreamReader io = new InputStreamReader(System.in);
                            BufferedReader leo = new BufferedReader(io);
                            valorObtenido = leo.readLine();*/

                            valorObtenidoDelTeclado = JOptionPane.showInputDialog(null,mensaje);
                            valorConvertido = Integer.parseInt(valorObtenidoDelTeclado);
                            pedirNuevamente= false; 

                    } catch (NumberFormatException nf) {
                            JOptionPane.showMessageDialog (null," MENSAJE: El valor ingresado no corresponde a un dato válido.");
                            pedirNuevamente= true;

                    } catch (Exception e) {
                            // TODO: handle exception
                            pedirNuevamente= true;
                    }
		}while (pedirNuevamente);
                
		return valorConvertido;
	}
	
        // Conversión a Flotante
        
	public float Leer3 (String mensaje){
            
		String  valorObtenido;
		float valorConvertido=0;
                
                do{
                    try {
                            valorObtenido = JOptionPane.showInputDialog(null,mensaje);
                            valorConvertido = Float.parseFloat(valorObtenido);
                            pedirNuevamente= false; 

                    } catch (NumberFormatException nf) {
                            JOptionPane.showMessageDialog(null," MENSAJE: El valor ingresado no corresponde a un numero.");
                            pedirNuevamente= true;

                    } catch (Exception e) {
                            // TODO: handle exception
                            pedirNuevamente= true;
                    }
                }while (pedirNuevamente);
		
		return valorConvertido;
	}
	

	// Conversión a Entero mayor a Cero (0)
        
	public int Leer4 (String mensaje){
            
		String  valorObtenido;
		int valorConvertido=0;
                
                do {

                    try {
                            valorObtenido = JOptionPane.showInputDialog(null,mensaje);
                            valorConvertido = Integer.parseInt(valorObtenido);
                            pedirNuevamente= false; 
                            
                            if (valorConvertido<=0) {
                                    JOptionPane.showMessageDialog(null," MENSAJE: El numero ingresado debe ser mayor a Cero(0).");
                                    pedirNuevamente = !pedirNuevamente;
                            }
                            
                    } catch (NumberFormatException nf) {
                            JOptionPane.showMessageDialog(null," MENSAJE: El valor ingresado no corresponde a un numero.");
                            pedirNuevamente= true;

                    } catch (Exception e) {
                            // TODO: handle exception
                            pedirNuevamente= true;
                    }
                
                } while (pedirNuevamente);
                
		return valorConvertido;
	}
    
    // Conversión a Double
        
    public double leer5 (String alumno){
		
		String valorObtenidoDelTeclado = "";
		double valorRetornado = 0;
                
                do{
                    try{

                            valorObtenidoDelTeclado = (JOptionPane.showInputDialog(null," Digite la nota del/a alumno/a " + alumno));
                            valorRetornado = Double.parseDouble(valorObtenidoDelTeclado);
                            pedirNuevamente= false; 

                    }catch (NumberFormatException e) {
                            // TODO: handle exception
                            JOptionPane.showMessageDialog(null,"Ingreso un valor incorrecto" );
                            pedirNuevamente= true;
                    }catch (Exception e) {
                                // TODO: handle exception
                                pedirNuevamente= true;
                    }
 
                }while (pedirNuevamente);
       
	return valorRetornado;    
    
    }
}




