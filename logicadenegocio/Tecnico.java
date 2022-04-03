package logicadenegocio;

/**
 * clase Técnico
 * 
 */
public class Tecnico extends Empleado {
  private int horasExtra;

  Tecnico(String pNombre, int pSalarioBase, int pPlusSalarial, int pHorasExtra) {
    super(pNombre, pSalarioBase, pPlusSalarial);
    horasExtra = pHorasExtra;
  }

  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Horas Extra: " + horasExtra + "\n";
    return msj;
  }

}
