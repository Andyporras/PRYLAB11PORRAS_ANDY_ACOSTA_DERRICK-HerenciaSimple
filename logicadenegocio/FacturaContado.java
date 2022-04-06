package logicadenegocio;
/**
 * Clase FacturaConstado
 * @author Derrick Acosta
 * @version abril 2022
 */
public class FacturaContado extends Factura {
  /**
   * Constructor de la clase FacturaContado
   * @param pNombre el nombre de la factura
   * @param pCedulaJuridica la cedula juridica 
   * @param pDireccion la direccion
   * @param pTelefono el telefono
   * @param pCajero el cajero
   * @param pVendedor el vendedor
   * @param pCliente el cliente
   * @param pCantidad la cantidad
   * @param pDescricion la descripcion
   * @param pPrecioFinal el precio final
   * @param pGarantia la grantia 
   * @param pCodigoTecnico el codigo del tecnico
   * @param pMantenimientoOReparacion el mantenimiento o la reparacion
   */
  public FacturaContado(String pNombre, String pCedulaJuridica, String pDireccion, String pTelefono,
      Empleado pCajero, Empleado pVendedor, Cliente pCliente, int pCantidad, String pDescricion, int pPrecioFinal,
      int pGarantia, int pCodigoTecnico,
      int pMantenimientoOReparacion) {
    super(pNombre, pCedulaJuridica, pDireccion, pTelefono, pCajero, pVendedor, pCliente, pCantidad, pDescricion,
        pPrecioFinal,
        pGarantia, pCodigoTecnico, pMantenimientoOReparacion);
  }
  /**
   * Constructor de la clase FacturaContado
   * @param pNombre el nombre de la factura
   * @param pCedulaJuridica la cedula juridica 
   * @param pDireccion la direccion
   * @param pTelefono el telefono
   * @param pCajero el cajero
   * @param pVendedor el vendedor
   * @param pCliente el cliente
   * @param pCantidad la cantidad
   * @param pDescricion la descripcion
   * @param pPrecioFinal el precio final
   * @param pGarantia la grantia
   * @param pMarca la marca
   */
  public FacturaContado(String pNombre, String pCedulaJuridica, String pDireccion, String pTelefono,
      Empleado pCajero, Empleado pVendedor, Cliente pCliente, int pCantidad, String pDescricion, Double pPrecioFinal,
      int pGarantia,
      String pMarca) {
    super(pNombre, pCedulaJuridica, pDireccion, pTelefono, pCajero, pVendedor, pCliente, pCantidad, pDescricion,
        pPrecioFinal,
        pGarantia, pMarca);
  }
  /**
   * Metodo para representar el objeto
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "";
    msj += super.toString();
    return msj;
  }

}
