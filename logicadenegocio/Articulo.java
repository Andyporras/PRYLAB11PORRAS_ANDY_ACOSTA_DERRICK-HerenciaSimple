package logicadenegocio;
/**
 * Clase Articulo el articulo 
 * @author Derrick Acosta
 * @version abril 2022
 */
public class Articulo extends Item {
  //Atributos de la clase
  private static int cantidadItems = 0;
  private String marca;
  private int numeroSerie;
  /**
   * Construcctor de Articulo
   * @param pCantidad la cantidad
   * @param pDescricion la descripcion
   * @param pPrecioFinal el precio final
   * @param pGarantia la garantia
   * @param pMarca la marca
   */
  Articulo(int pCantidad, String pDescricion, Double pPrecioFinal, int pGarantia, String pMarca) {
    super(pCantidad, pDescricion, pPrecioFinal, pGarantia);
    cantidadItems++;
    marca = pMarca;
    numeroSerie = cantidadItems;
  }
  /**
   * Metodo para representar el objeto
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "\tMarca: " + marca + "  ";
    msj += " Numero de serie: " + numeroSerie + "\n";
    return msj;
  }
}
