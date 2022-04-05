package logicadenegocio;

/**
 * Clase PersonaJuridica
 * 
 */
public class PersonaJuridica extends Cliente {
  private String email;
  private String razonSocial;
  private int cuentaPorPagar;

  public PersonaJuridica(String pNombre, String pDireccion, String pTelefono, String pCedula, String pEmail,
      String pRazonSocial, int pCuentaPorPagar) {
    super(pNombre, pDireccion, pTelefono, pCedula);
    email = pEmail;
    razonSocial = pRazonSocial;
    cuentaPorPagar = pCuentaPorPagar;
  }

  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Email: " + email + "\n";
    msj += "Razon Social: " + razonSocial + "\n";
    msj += "Cuenta por pagar: " + cuentaPorPagar + "\n";
    return msj;
  }
}
