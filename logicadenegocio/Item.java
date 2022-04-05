package logicadenegocio;

public class Item {
  private int cantidad;
  private String descripcion;
  private double precioFinal;
  private int garantia;

  Item(int pCantidad, String pDescricion, double pPrecioFinal, int pGarantia) {
    cantidad = pCantidad;
    descripcion = pDescricion;
    precioFinal = pPrecioFinal;
    garantia = pGarantia;
  }

  public String toString() {
    String msj = "";
    msj += " " + cantidad + "\t";
    msj += " " + descripcion + "\t";
    msj += " " + precioFinal + "\t";
    return msj;
  }

  public double getPrecioFinal() {
    return precioFinal;
  }
}
