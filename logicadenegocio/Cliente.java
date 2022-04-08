package logicadenegocio;

/**
 * Clase Cliente que va tener los datos del cliente
 * 
 * @author Andy Porras
 * @version abril 2022
 */
public class Cliente {
  // Atributos de la clase
  private String nombre;
  private String direccion;
  private String telefono;
  private String cedula;

  /**
   * Construcctor de la clase Cliente
   * 
   * @param pNombre    el nombre del cliente
   * @param pDireccion la direccion del cliente
   * @param pTelefono  el telefono del cliente
   * @param pCedula    la cedula del cliente
   */
  Cliente(String pNombre, String pDireccion, String pTelefono, String pCedula) {
    nombre = pNombre;
    direccion = pDireccion;
    telefono = pTelefono;
    cedula = pCedula;
  }

  /**
   * Metodo para representar el objeto
   * 
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "Cliente: \n";
    msj += "Cedula: " + cedula + "\n";
    msj += "Nombre: " + nombre + "\n";
    msj += "Direccion: " + direccion + "\n";
    msj += "Telefono: " + telefono + "\n";
    return msj;
  }
}
