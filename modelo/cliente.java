
package modelo;

/**
 *
 * @author SENA
 */
public class cliente {
    private String nombreCliente;
    private String[]listaClientes;
    private int contador;
    
    public cliente(){
        this.nombreCliente="";
        this.contador=0;
        this.listaClientes= new String[3];
    }
    public String getNombreCliente(){
       return nombreCliente; 
    }
    public void setNomreCliente(String nombreCliente){
        this.nombreCliente= nombreCliente;
    }
    public String[]getListaClientes(){
        return listaClientes;
    }
    public void guardarCliente(String datoNombre){
        if(this.contador<this.listaClientes.length){
            this.listaClientes[this.contador]=datoNombre;
            this.contador++;
            System.out.println("informacion guardada");
        }
    }
    public void imprimirClientes(){
        for (int i = 0; i <this.listaClientes.length; i++) {
            System.out.println("xxxx:"+ this.listaClientes[i]);
            
        }   
    }
    
}

