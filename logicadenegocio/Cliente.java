package logicadenegocio;

public class Cliente{
  private String nombre;
  private String direccion;
  private String telefono;
  private String cedula;
  
  Cliente(String pNombre, String pDireccion, String pTelefono, String pCedula){
    nombre = pNombre;
    direccion = pDireccion;
    telefono = pTelefono;
    cedula = pCedula;
  }
  public String toString(){
    String msj = "";
    msj += "Nombre: " + nombre + "\n";
    msj += "Direccion: " + direccion + "\n";
    msj += "Telefono: " + telefono + "\n";
    msj += "Cedula: " + cedula + "\n";
    return msj; 
  }
}
