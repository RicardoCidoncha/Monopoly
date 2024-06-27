
package juego.monopoly;
import javax.swing.JOptionPane;
import model.*;
/**
 *
 * @author Ricardo
 */






public class JuegoMonopoly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        //Creamos un Array de objetos con máximo 2 jugadores
        
        Jugador arrayJugador[] = new Jugador [2];
      
        //Creamos un blucle for para pedir los nombres y despùés introducirlos.
        
        for (int i=0; i<arrayJugador.length; i++)
        {
         String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
       
         arrayJugador[i] = new Jugador(nombre);
               
   //Estoy parado en introducir los nombres pedidos al usuario en el array list
         
        }
                
                
    }            
                
                
                
                
                
}                
                
                
                   
        
        /*Creamos 2 objetos de la clase Jugador
        
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador(); 
        
      
        
        //Introducimos los nombres pedidos al usuario
        
        jugador1.setNombre(nombre1);
        jugador2.setNombre(nombre2);
        

        //Sacamos por pantalla nombre y dinero inicial de ambos jugadores
        System.out.println("El nombre del jugador 1 es " + jugador1.getNombre() + " y tiene " + jugador1.getDinero() + " euros.");
        System.out.println("El nombre del jugador 2 es " + jugador2.getNombre() + " y tiene " + jugador2.getDinero() + " euros.");
        
       
        }
    }
    */

