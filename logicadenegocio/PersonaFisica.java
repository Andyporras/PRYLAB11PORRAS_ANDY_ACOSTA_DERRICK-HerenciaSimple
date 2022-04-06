package logicadenegocio;

/***
 * Clase PersonaFisica
 * @author Andy Porras
 * @version abril 2022
 */
public class PersonaFisica extends Cliente {
  //Atributos de la clase
  private String email;
  private String ocupacion;
  /**
   * Construcctor de PersonaFisica
   * @param pNombre el nombre de la persona
   * @param pDireccion la direccion de la persona
   * @param pTelefono el telefono de la persona
   * @param pCedula la cedula de la persona
   * @param pEmail el email de la persona
   * @param pOcupacion la ocupacion de la persona
   */
  public PersonaFisica(String pNombre, String pDireccion, String pTelefono, String pCedula, String pEmail, String pOcupacion) {
    super(pNombre, pDireccion, pTelefono, pCedula);
    email = pEmail;
    ocupacion = pOcupacion;
  }
  /**
   * Metodo para representar el objeto
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Email: " + email + "\n";
    msj += "Ocupacion: " + ocupacion + "\n";
    return msj;
  }
}
