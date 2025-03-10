
package vista;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class registroCliente {
    private String colorBoton;
    private int numBotones;
    private int numLabel1;
    private String colorLabel1;
    private String colorformulario;
    private Scanner objTeclado;
    
    public registroCliente(){
        this.colorBoton="rojo";
        this.numBotones=5;
        this.numLabel1=10;
        this.colorLabel1="blanco";
        this.colorformulario="amarillo";
        
    }
    
    public int mostarMenu(){
        System.out.println("registrar cliente");
        System.out.println("ver lista del cliente");
        System.out.println("salir");
        this.objTeclado= new Scanner(System.in);
        System.out.println("seleccione una opcion");
        int opcionMenu= objTeclado.nextInt();
        return opcionMenu;
    }
    public String tomardatos_clientes(){
        this.objTeclado= new Scanner(System.in);
        System.out.println("bienvenido al registro para clientes");
        System.out.println("digite el nombre cel cliente");
        String nombreCliente= objTeclado.nextLine();
        System.out.println("digite el apellido del cliente");
        String apellidoCliente= objTeclado.nextLine();
        System.out.println("digite la cedula del ciente");
        String cedulaCliente= objTeclado.nextLine();
        return nombreCliente;
    }
    
    
    
    
   
    
}
