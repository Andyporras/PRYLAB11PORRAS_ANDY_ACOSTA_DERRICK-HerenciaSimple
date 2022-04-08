package logicadenegocio;

/**
 * Clase FacturaCredito
 * 
 * @author Andy Porras
 * @version abril 2022
 */
public class FacturaCredito extends Factura {
  // Atributos de la clase
  private int cantidadMeses;
  private double interesMensual;
  private double cuotaMensual;
  private double subTotal;

  /**
   * Constructor de FacturaCredito
   * 
   * @param pNombre         el nombre de la factura
   * @param pCedulaJuridica la cedula juridica
   * @param pDireccion      la direccion
   * @param pTelefono       el telefono
   * @param pCajero         el cajero
   * @param pVendedor       el vendedor
   * @param pCliente        el cliente
   * @param pCantidadMeses  la cantidad de meses
   * @param pInteresMensual el interes mensual
   * @param pCuotaMensual   la cuota mensual
   * @param pCantidad       la cantidad
   * @param pDescricion     la descipcion
   * @param pPrecioFinal    el precio final
   * @param pGarantia       la garantia
   * @param pMarca          la marca
   */
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

  /**
   * Constructor de FacturaCredito
   * 
   * @param pNombre                   el nombre de la factura
   * @param pCedulaJuridica           la cedula juridica
   * @param pDireccion                la direccion
   * @param pTelefono                 el telefono
   * @param pCajero                   el cajero
   * @param pVendedor                 el vendedor
   * @param pCliente                  el cliente
   * @param pCantidadMeses            la cantidad de meses
   * @param pInteresMensual           el interes mensual
   * @param pCuotaMensual             la cuota mensual
   * @param pCantidad                 la cantidad
   * @param pDescricion               la descipcion
   * @param pPrecioFinal              el precio final
   * @param pGarantia                 la garantia
   * @param pCodigoTecnico            el codigo del tecnico
   * @param pMantenimientoOReparacion el mantenimiento o la reparacion
   */
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

  /**
   * Metodo para representar el objeto
   * 
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "informacion de la factura de credito\n";
    msj += "Cantidad de meses para pagar: " + cantidadMeses + "\n";
    msj += "Interes mensual: " + interesMensual + "\n";
    msj += "Cuota mensual: " + cuotaMensual + "\n";
    return msj;
  }

}
