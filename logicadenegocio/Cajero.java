package logicadenegocio;

/**
 * clase cajero
 */
public class Cajero extends Empleado {
  private Factura factura;
  private int antiguedad;
  private int anosLaborados;
  private int montoAnual;

  Cajero(String pNombre, int pSalarioBase, int pPlusSalarial, int pAntiguedad, int pAnosLaborados, int pMontoAnual) {
    super(pNombre, pSalarioBase, pPlusSalarial);
    antiguedad = pAntiguedad;
    anosLaborados = pAnosLaborados;
    montoAnual = pMontoAnual;
  }

  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Antiguedad: " + antiguedad + "\n";
    msj += "Anos Laborados: " + anosLaborados + "\n";
    msj += "Monto Anual: " + montoAnual + "\n";
    return msj;
  }

}
