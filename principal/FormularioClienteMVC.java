
package principal;
import controlador.controlador;
import modelo.cliente;
import vista.registroCliente;
/**
 *
 * @author SENA
 */
public class FormularioClienteMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cliente objCliente= new cliente();
        registroCliente objFormulario= new registroCliente();
        controlador objControlador= new controlador(objCliente,objFormulario);
        objControlador.iniciarFormulario();
    }
    
}
