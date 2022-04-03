package logicadenegocio;

/**
 * clase Empleado
 */
public class Empleado {
  private String nombre;
  private int salarioBase;
  private int plusSalarial;

  Empleado(String pNombre, int pSalarioBase, int pPlusSalarial) {
    nombre = pNombre;
    salarioBase = pSalarioBase;
    plusSalarial = pPlusSalarial;
  }

  public String toString() {
    String msj = "";
    msj += "Nombre: " + nombre + "\n";
    msj += "Salario Base: " + salarioBase + "\n";
    msj += "Plus Salarial: " + plusSalarial + "\n";
    return msj;
  }
}
