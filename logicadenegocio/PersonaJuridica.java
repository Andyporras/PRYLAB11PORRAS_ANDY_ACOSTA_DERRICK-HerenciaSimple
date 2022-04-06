package logicadenegocio;

/**
 * Clase PersonaJuridica
 * @author Andy Porras
 * @version abril 2022
 */
public class PersonaJuridica extends Cliente {
  //Atributos de la clase
  private String email;
  private String razonSocial;
  private int cuentaPorPagar;
  /**
   * Construcctor de PersonaJuridica
   * @param pNombre el nombre de la persona
   * @param pDireccion la direccion de la persona
   * @param pTelefono el telefono de la persona
   * @param pCedula la cedula de la persona
   * @param pEmail el email de la persona
   * @param pRazonSocial la razon social de la persona
   * @param pCuentaPorPagar la cuenta por pagar de la persona
   */
  public PersonaJuridica(String pNombre, String pDireccion, String pTelefono, String pCedula, String pEmail,
      String pRazonSocial, int pCuentaPorPagar) {
    super(pNombre, pDireccion, pTelefono, pCedula);
    email = pEmail;
    razonSocial = pRazonSocial;
    cuentaPorPagar = pCuentaPorPagar;
  }
  /**
   * Metodo para representar el objeto
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Email: " + email + "\n";
    msj += "Razon Social: " + razonSocial + "\n";
    msj += "Cuenta por pagar: " + cuentaPorPagar + "\n";
    return msj;
  }
}
