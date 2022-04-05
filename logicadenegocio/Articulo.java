package logicadenegocio;

public class Articulo extends Item {
  private static int cantidadItems = 0;
  private String marca;
  private int numeroSerie;

  Articulo(int pCantidad, String pDescricion, Double pPrecioFinal, int pGarantia, String pMarca) {
    super(pCantidad, pDescricion, pPrecioFinal, pGarantia);
    cantidadItems++;
    marca = pMarca;
    numeroSerie = cantidadItems;
  }

  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "\tMarca: " + marca + "  ";
    msj += " Numero de serie: " + numeroSerie + "\n";
    return msj;
  }
}
