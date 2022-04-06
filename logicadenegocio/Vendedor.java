package logicadenegocio;
/**
 * clase vendedor
 * @author Andy Porras
 * @version abril 2022
 */
public class Vendedor extends Empleado {
  //Atributos de la clase
  private int comision;
  /**
   * Contructor de la clase Vendedor
   * @param pNombre el nombre del vendedor
   * @param pSalarioBase el salario base 
   * @param pComision la comision del vendedor
   */
  public Vendedor(String pNombre, int pSalarioBase, int pComision) {
    super(pNombre, pSalarioBase);
    comision = pComision;
  }
  /**
   * Metodo para representar el objeto
   * @return msj la informacion del objeto
   */
  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Comision: " + comision + "\n";
    return msj;
  }
  /**
   * metodo que calcula el plus salarial del vendedor
   * @return plusSalarial el plus salarial del vendedor
   */
  @Override
  public double calcularPlusSalarial() {
    double plusSalarial = 0;
    plusSalarial = comision * 0.05;
    return plusSalarial;
  }
}
