package logicadenegocio;
/**
 * clase Empleado
 * @author Andy Porras
 * @version abril 2022
 */
public abstract class Empleado {
  //Atributos de la clase
  private static int cantidaEmpleados;
  private String nombre;
  private int salarioBase;
  private int plusSalarial;
  private int numeroEmpleado;
  /**
   * Constructor de la clase
   * @param pNombre el nombre del empleado
   * @param pSalarioBase el salario base que gana
   */
  
  Empleado(String pNombre, int pSalarioBase) {
    nombre = pNombre;
    salarioBase = pSalarioBase;
    cantidaEmpleados++;
    numeroEmpleado = cantidaEmpleados;
  }
  /**
   * metodo accesor para obtener el numero del empleado
   * @return numeroEmpleado el numero de empleado
   */
  public int getNumeroEmpleado() {
    return numeroEmpleado;
  }
  /**
   * metodo accesor para obtener el nombre
   * @return nombre el nombre
   */
  public String getNombre() {
    return nombre;
  }
  /**
   * metodo accesor para obtener el salario base
   * @return salarioBase el salario base
   */
  public int getSalarioBase() {
    return salarioBase;
  }
  /**
   * Invocacion del metodo abstrcato calcularPlusSalarial()
   */
  public abstract double calcularPlusSalarial();
  /**
   * Metodo para representar el objeto
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "";
    msj += "Nombre: " + nombre + "\n";
    msj += "Salario Base: " + salarioBase + "\n";
    msj += "Plus Salarial: " + plusSalarial + "\n";
    return msj;
  }

}
