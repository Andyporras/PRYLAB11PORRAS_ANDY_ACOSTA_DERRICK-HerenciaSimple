package logicadenegocio;

public class Servicio extends Item {
  private int codigoTecnico;
  private int mantenimientoOReparacion;

  Servicio(int pCantidad, String pDescricion, int pPrecioFinal, int pGarantia, int pCodigoTecnico,
      int pMantenimientoOReparacion) {
    super(pCantidad, pDescricion, pPrecioFinal, pGarantia);
    codigoTecnico = pCodigoTecnico;
    mantenimientoOReparacion = pMantenimientoOReparacion;
  }

  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "\tCodigo tecnico: " + codigoTecnico + "  ";
    msj += "Mantenimiento o reparacion: " + mantenimientoOReparacion + "\n";
    return msj;
  }
}
