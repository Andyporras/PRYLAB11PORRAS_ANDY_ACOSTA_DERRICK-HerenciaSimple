package logicadenegocio;

/**
 * clase Empleado
 */
public abstract class Empleado {
  private String nombre;
  private int salarioBase;
  private int plusSalarial;

  Empleado(String pNombre, int pSalarioBase) {
    nombre = pNombre;
    salarioBase = pSalarioBase;
  }

  public int getSalarioBase() {
    return salarioBase;
  }

  public abstract double calcularPlusSalarial();

  public String toString() {
    String msj = "";
    msj += "Nombre: " + nombre + "\n";
    msj += "Salario Base: " + salarioBase + "\n";
    msj += "Plus Salarial: " + plusSalarial + "\n";
    return msj;
  }
}
