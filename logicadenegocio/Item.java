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
    msj += "Cantidad: " + cantidad + "\n";
    msj += "Descripcion: " + descripcion + "\n";
    msj += "Precio Final: " + precioFinal + "\n";
    msj += "Garantia: " + garantia + "\n";
    return msj;
  }

  public double getPrecioFinal() {
    return precioFinal;
  }
}
