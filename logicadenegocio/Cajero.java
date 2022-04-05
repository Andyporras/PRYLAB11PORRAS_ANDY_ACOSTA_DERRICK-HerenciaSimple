package logicadenegocio;

/**
 * clase cajero
 */
public class Cajero extends Empleado {
  private int antiguedad;
  private int anosLaborados;
  private int montoAnual;

  public Cajero(String pNombre, int pSalarioBase, int pAntiguedad, int pAnosLaborados, int pMontoAnual) {
    super(pNombre, pSalarioBase);
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

  @Override
  public double calcularPlusSalarial() {
    double plusSalarial = 0;
    plusSalarial = (anosLaborados * 0.05) + (montoAnual * 0.02);
    return plusSalarial;
  }

}
