package logicadenegocio;

public class Articulo extends Item {
  private String marca;
  private int numeroSerie;

  Articulo(int pCantidad, String pDescricion, int pPrecioFinal, int pGarantia, String pMarca, int pNumeroSerie) {
    super(pCantidad, pDescricion, pPrecioFinal, pGarantia);
    marca = pMarca;
    numeroSerie = pNumeroSerie;
  }

  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Marca: " + marca + "\n";
    msj += "Numero de serie: " + numeroSerie + "\n";
    return msj;
  }
}
