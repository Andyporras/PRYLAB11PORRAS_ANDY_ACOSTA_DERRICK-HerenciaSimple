package logicadenegocio;

/**
 * clase Empleado
 */
public abstract class Empleado {
  private static int cantidaEmpleados;
  private String nombre;
  private int salarioBase;
  private int plusSalarial;
  private int numeroEmpleado;

  Empleado(String pNombre, int pSalarioBase) {
    nombre = pNombre;
    salarioBase = pSalarioBase;
    cantidaEmpleados++;
    numeroEmpleado = cantidaEmpleados;
  }

  public int getNumeroEmpleado() {
    return numeroEmpleado;
  }

  public String getNombre() {
    return nombre;
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
