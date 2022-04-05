package logicadenegocio;

public class FacturaContado extends Factura {

  public FacturaContado(String pNombre, String pCedulaJuridica, String pDireccion, String pTelefono,
      Empleado pCajero, Empleado pVendedor, int pCantidad, String pDescricion, int pPrecioFinal, int pGarantia, int pCodigoTecnico,
      int pMantenimientoOReparacion) {
    super(pNombre, pCedulaJuridica, pDireccion, pTelefono, pCajero, pVendedor, pCantidad, pDescricion, pPrecioFinal,
        pGarantia, pCodigoTecnico, pMantenimientoOReparacion);
  }
  public FacturaContado(String pNombre, String pCedulaJuridica, String pDireccion, String pTelefono,
    Empleado pCajero, Empleado pVendedor,int pCantidad, String pDescricion, Double pPrecioFinal, int pGarantia, String pMarca) {
    super(pNombre, pCedulaJuridica, pDireccion, pTelefono, pCajero, pVendedor, pCantidad, pDescricion, pPrecioFinal,
        pGarantia, pMarca);
  }

  public String toString() {
    String msj = "";
    msj += super.toString();
    return msj;
  }

}
