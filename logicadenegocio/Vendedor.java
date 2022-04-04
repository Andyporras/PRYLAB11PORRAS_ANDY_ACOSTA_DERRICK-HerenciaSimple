package logicadenegocio;

/**
 * clase vendedor
 */
public class Vendedor extends Empleado {
  private int comision;

  Vendedor(String pNombre, int pSalarioBase, int pComision) {
    super(pNombre, pSalarioBase);
    comision = pComision;
  }

  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Comision: " + comision + "\n";
    return msj;
  }

  @Override
  public double calcularPlusSalarial() {
    double plusSalarial = 0;
    plusSalarial = comision * 0.05;
    return plusSalarial;
  }

}
