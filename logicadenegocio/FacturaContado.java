package logicadenegocio;

public class FacturaContado extends Factura {

  FacturaContado(String pNombre, String pCedulaJuridica, String pDireccion, int pTelefono,
      Empleado pCajero, Empleado pVendedor) {
    super(pNombre, pCedulaJuridica, pDireccion, pTelefono, pCajero, pVendedor);
  }

  public String toString() {
    String msj = "";
    msj += super.toString();
    return msj;
  }

}
