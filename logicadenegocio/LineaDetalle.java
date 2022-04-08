package logicadenegocio;

/**
 * Clase LineaDetalle
 * 
 * @author Derrick Acosta
 * @version abril 2022
 */
public class LineaDetalle {
  // Atributos de la clase
  private Item item;

  /**
   * Constructor de LineaDetalle
   * 
   * @param pCantidad    la cantidad
   * @param pDescricion  la descripcion
   * @param pPrecioFinal el precio final
   * @param pGarantia    la garantia
   * @param pMarca       la marca
   */
  LineaDetalle(int pCantidad, String pDescricion, Double pPrecioFinal, int pGarantia, String pMarca) {
    item = new Articulo(pCantidad, pDescricion, pPrecioFinal, pGarantia, pMarca);
  }

  /**
   * Constructor de LineaDetalle
   * 
   * @param pCantidad      la cantidad
   * @param pDescricion    la descripcion
   * @param pPrecioFinal   el precio final
   * @param pGarantia      la garantia
   * @param pCodigoTecnico el codigo del tecnico
   */
  LineaDetalle(int pCantidad, String pDescricion, int pPrecioFinal, int pGarantia, int pCodigoTecnico,
      int pMantenimientoOReparacion) {
    item = new Servicio(pCantidad, pDescricion, pPrecioFinal, pGarantia, pCodigoTecnico, pMantenimientoOReparacion);
  }

  /**
   * Metodo para representar el objeto
   * 
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "";
    msj += item.toString();
    return msj;
  }

  /**
   * Metodo accesor para obtener el precio
   * 
   * @return item.getPrecioFinal() el precio
   */
  public double getPrecio() {
    return item.getPrecioFinal();
  }
}
