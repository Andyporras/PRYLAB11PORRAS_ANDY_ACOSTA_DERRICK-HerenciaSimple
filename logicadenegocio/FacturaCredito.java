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

  FacturaCredito(String pNombre, String pCedulaJuridica, String pDireccion, int pTelefono, Empleado pCajero,
      Empleado pVendedor, int pCantidadMeses, double pInteresMensual,
      double pCuotaMensual) {
    super(pNombre, pCedulaJuridica, pDireccion, pTelefono, pCajero, pVendedor);
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
    msj += "Subtotal: " + subTotal + "\n";
    return msj;
  }

}
