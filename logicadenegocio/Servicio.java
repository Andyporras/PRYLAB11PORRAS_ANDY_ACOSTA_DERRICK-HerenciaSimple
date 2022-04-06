package logicadenegocio;
/**
 * Clase Servicio del servicio a ofrecer
 * @author Andy Porras
 * @version abril 2022
 */
public class Servicio extends Item {
  //Atributos de la clase
  private int codigoTecnico;
  private int mantenimientoOReparacion;
  /**
   * Constructor de servicio
   * @param pCantidad la cantidad 
   * @param pDescricion la descripcion
   * @param pPrecioFinal el precio final
   * @param pGarantia la garantía
   * @param pCodigoTecnico el codigo del tecnico
   * @param pMantenimientoOReparacion el mantenimiento o la reparacion
   */
  Servicio(int pCantidad, String pDescricion, int pPrecioFinal, int pGarantia, int pCodigoTecnico,
      int pMantenimientoOReparacion) {
    super(pCantidad, pDescricion, pPrecioFinal, pGarantia);
    codigoTecnico = pCodigoTecnico;
    mantenimientoOReparacion = pMantenimientoOReparacion;
  }
  /**
   * Metodo para representar el objeto
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "\tCodigo tecnico: " + codigoTecnico + "  ";
    msj += "Mantenimiento o reparacion: " + mantenimientoOReparacion + "\n";
    return msj;
  }
}
