package logicadenegocio;

public class LineaDetalle {
  private static int cantidadItems = 0;
  private Item item;
  private int cantidad;

  LineaDetalle(int pCantidad, String pDescricion, Double pPrecioFinal, int pGarantia, String pMarca){
    cantidadItems++;
    cantidad = cantidadItems;
    item = new Articulo(pCantidad, pDescricion, pPrecioFinal, pGarantia, pMarca); 
  }

  LineaDetalle(int pCantidad, String pDescricion, int pPrecioFinal, int pGarantia, int pCodigoTecnico,
      int pMantenimientoOReparacion) {
    item = new Servicio(pCantidad, pDescricion, pPrecioFinal, pGarantia, pCodigoTecnico, pMantenimientoOReparacion);
  }

  public String toString() {
    String msj = "";
    msj += item.toString();
    return msj;
  }

  public double getPrecio() {
    return item.getPrecioFinal();
  }
}
