package logicadenegocio;
/**
 * clase cajero
 * @author Andy Porras
 * @version abril 2022
 */
public class Cajero extends Empleado {
    //Atributos de la clase
  private int antiguedad;
  private int anosLaborados;
  private int montoAnual;
  /**
   * Constructor de la clase Cajero
   * @param pNombre el nombre del cajero
   * @param pSalarioBase el salario base
   * @param pAntiguedad la antiguedad del cajero trabajando
   * @param pAnosLaborados los años del cajero laborados
   * @param pMontoAnual el monto anual que recibe el cajero
   * 
   */
  public Cajero(String pNombre, int pSalarioBase, int pAntiguedad, int pAnosLaborados, int pMontoAnual) {
    super(pNombre, pSalarioBase);
    antiguedad = pAntiguedad;
    anosLaborados = pAnosLaborados;
    montoAnual = pMontoAnual;
  }
  /**
   * Metodo para representar el objeto
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Antiguedad: " + antiguedad + "\n";
    msj += "Anos Laborados: " + anosLaborados + "\n";
    msj += "Monto Anual: " + montoAnual + "\n";
    return msj;
  }
  /**
   * metodo que calcula el plus salarial del cajero
   * @return plusSalarial el plus salarial del cajero
   */
  @Override
  public double calcularPlusSalarial() {
    double plusSalarial = 0;
    plusSalarial = (anosLaborados * 0.05) + (montoAnual * 0.02);
    return plusSalarial;
  }
}
