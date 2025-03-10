
package controlador;
import modelo.cliente;
import vista.registroCliente;

/**
 *
 * @author SENA
 */
public class controlador {
    private registroCliente objformulario_registro;
    private cliente objModelo_cliente;
    
    public controlador(cliente objCliente,registroCliente objfromulario){
        this.objModelo_cliente = objCliente;
        this. objformulario_registro= objfromulario;
    }
    public void iniciarFormulario(){
        int opcion= 0;
        do {opcion=this.objformulario_registro.mostarMenu();
        switch(opcion){
            case 1:
                String auxNombre= this.objformulario_registro.tomardatos_clientes();
                this.objModelo_cliente.guardarCliente(auxNombre);
                break;
                case 2:
                    this.objModelo_cliente.imprimirClientes();
                    break;
                    case 3:
                        System.out.println("saliendo del sistema....");
                        break;
                        default:
                            System.out.println("opcion no valida");
        }
            
        } while (opcion!=3);
    }
    
}
