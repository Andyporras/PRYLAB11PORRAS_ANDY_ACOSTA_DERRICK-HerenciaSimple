package logicadenegocio;

/***
 * Clase PersonaFisica
 * 
 */
public class PersonaFisica extends Cliente {
  private String email;
  private String ocupacion;

  PersonaFisica(String pNombre, String pDireccion, String pTelefono, String pCedula, String pEmail, String pOcupacion) {
    super(pNombre, pDireccion, pTelefono, pCedula);
    email = pEmail;
    ocupacion = pOcupacion;
  }

  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Email: " + email + "\n";
    msj += "Ocupacion: " + ocupacion + "\n";
    return msj;
  }

}
