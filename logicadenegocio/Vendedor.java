package logicadenegocio;

/**
 * clase vendedor
 */
public class Vendedor extends Empleado {
  private int comision;

  Vendedor(String pNombre, int pSalarioBase, int pPlusSalarial, int pComision) {
    super(pNombre, pSalarioBase, pPlusSalarial);
    comision = pComision;
  }

  public String toString() {
    String msj = "";
    msj += super.toString();
    msj += "Comision: " + comision + "\n";
    return msj;
  }

}
