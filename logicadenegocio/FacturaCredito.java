package logicadenegocio;

/**
 * 
 * @author
 * @version
 */
public class FacturaCredito extends Factura {

  private int cantidadMeses;
  private double interesMensual;
  private double cuotaMensual;
  private double subTotal;

  public FacturaCredito(String pNombre, String pCedulaJuridica, String pDireccion, String pTelefono, Empleado pCajero,
      Empleado pVendedor, Cliente pCliente, int pCantidadMeses, double pInteresMensual,
      double pCuotaMensual, int pCantidad, String pDescricion, Double pPrecioFinal, int pGarantia, String pMarca) {
    super(pNombre, pCedulaJuridica, pDireccion, pTelefono, pCajero, pVendedor, pCliente, pCantidad, pDescricion,
        pPrecioFinal,
        pGarantia, pMarca);
    cantidadMeses = pCantidadMeses;
    interesMensual = pInteresMensual;
    cuotaMensual = pCuotaMensual;
    subTotal = super.calcularSubTotal();
  }

  public FacturaCredito(String pNombre, String pCedulaJuridica, String pDireccion, String pTelefono, Empleado pCajero,
      Empleado pVendedor, Cliente pCliente, int pCantidadMeses, double pInteresMensual,
      double pCuotaMensual, int pCantidad, String pDescricion, int pPrecioFinal, int pGarantia, int pCodigoTecnico,
      int pMantenimientoOReparacion) {
    super(pNombre, pCedulaJuridica, pDireccion, pTelefono, pCajero, pVendedor, pCliente, pCantidad, pDescricion,
        pPrecioFinal,
        pGarantia, pCodigoTecnico, pMantenimientoOReparacion);
    cantidadMeses = pCantidadMeses;
    interesMensual = pInteresMensual;
    cuotaMensual = pCuotaMensual;
    subTotal = super.calcularSubTotal();
  }

  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Cantidad de meses: " + cantidadMeses + "\n";
    msj += "Interes mensual: " + interesMensual + "\n";
    msj += "Cuota mensual: " + cuotaMensual + "\n";
    return msj;
  }

}
