package logicadenegocio;

/**
 * clase Técnico
 * 
 */
public class Tecnico extends Empleado {
  private int horasExtra;

  Tecnico(String pNombre, int pSalarioBase, int pHorasExtra) {
    super(pNombre, pSalarioBase);
    horasExtra = pHorasExtra;
  }

  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Horas Extra: " + horasExtra + "\n";
    return msj;
  }

  @Override
  public double calcularPlusSalarial() {
    double plusSalarial = 0;
    plusSalarial = horasExtra * 0.5;
    return plusSalarial;
  }

}
