package logicadenegocio;

/**
 * Clase Item
 * 
 * @author Derrick Acosta
 * @version abril 2022
 */
public class Item {
  // Atributos de la clase
  private int cantidad;
  private String descripcion;
  private double precioFinal;
  private int garantia;

  /**
   * Construcctor Item
   * 
   * @param pCantidad    la cantidad del item
   * @param pDescricion  la descirpcion del item
   * @param pPrecioFinal el precio final del item
   * @param pGarantia    la garantia del item
   */
  Item(int pCantidad, String pDescricion, double pPrecioFinal, int pGarantia) {
    cantidad = pCantidad;
    descripcion = pDescricion;
    precioFinal = pPrecioFinal;
    garantia = pGarantia;
  }

  /**
   * Metodo para representar el objeto
   * 
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "";
    msj += " " + cantidad + "\t";
    msj += " " + descripcion + "\t";
    msj += " " + precioFinal + "\t";
    msj += " garantia:  " + garantia + "\t";
    return msj;
  }

  /**
   * Metodo para obtener el precio final
   * 
   * @return precioFinal
   */
  public double getPrecioFinal() {
    return precioFinal;
  }

  public int getGaratia() {
    return garantia;
  }
}
