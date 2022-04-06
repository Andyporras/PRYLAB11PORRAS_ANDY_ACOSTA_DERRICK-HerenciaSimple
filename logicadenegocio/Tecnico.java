package logicadenegocio;

/**
 * clase Técnico
 * @author Andy Porras
 * @version abril 2022
 */
public class Tecnico extends Empleado {
  //Atributos de la clase
  private int horasExtra;
  /**
   * Clase constructor de Tecnico
   * @param pNombre el nombre del tecnico
   * @param pSalarioBase el salario base del tecnico
   * @param pHorasExtra la hora extra del tecnico
   */
  public Tecnico(String pNombre, int pSalarioBase, int pHorasExtra) {
    super(pNombre, pSalarioBase);
    horasExtra = pHorasExtra;
  }
  /**
   * Metodo para representar el objeto
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Horas Extra: " + horasExtra + "\n";
    return msj;
  }
  /**
   * metodo que calcula el plus salarial del tecnico
   * @return plusSalarial el plus salarial del tecnico
   */
  @Override
  public double calcularPlusSalarial() {
    double plusSalarial = 0;
    plusSalarial = horasExtra * 0.5;
    return plusSalarial;
  }

}
