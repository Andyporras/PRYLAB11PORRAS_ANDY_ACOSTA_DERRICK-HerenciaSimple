package logicadenegocio;

/**
 * 
 * @author 
 * @version
 */
public class FacturaCredito
{
  private int cantidadMeses;
  private double interesMensual;
  private double cuotaMensual;
  private double subTotal;
  public FacturaCredito( String pNombre, String pCedulaJuridica, String pDirrecion, int pTelefono, Empleado pCajero, Empleado pVendedor, int pCantidadMeses, double pInteresMensual, double pCuotaMensual, double pSubTotal){
    cantidadMeses=pCantidadMeses;
    interesMensual=pInteresMensual;
    cuotaMensual=pCuotaMensual;
    subTotal=pSubTotal;
  }
  public String toString(){
    return;
  }
}
