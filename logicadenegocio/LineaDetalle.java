package logicadenegocio;

public class LineaDetalle {
  private Item item;

  LineaDetalle(int pCantidad, String pDescricion, int pPrecioFinal, int pGarantia) {
    item = new Item(pCantidad, pDescricion, pPrecioFinal, pGarantia);
  }
  public String toString(){
    String msj = "";
    msj += item.toString();
    return msj;
  }
  public double getPrecio() {
    return item.getPrecioFinal();
  }
}
