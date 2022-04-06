package aplicacion;

import java.util.ArrayList;

import logicadenegocio.*;
/**
 * Clase donde creamos los objetos para ver el funcionamiento correcto de los metodos de logicadenegocio
 * @author Andy Porras
 * @version abril 2022
 */
public class AppAplicacion {
  private String nombre;
  private String cedulaJuridica;
  private String direccion;
  private String telefono;
  private ArrayList<Empleado> empleados;
  private ArrayList<Empleado> vendedores;
  private ArrayList<Factura> facturas;
  
  private ArrayList<Empleado> cajeros;
  private Publicidad publicidad;
  private ArrayList<Cliente> clientes;
  /**
   * Constructor de AppAplicacion para setear
   * @param pNombre el nombre 
   * @param pCedulaJuridica la cedula juridica
   * @param pDireccion la direccion
   * @param pTelefono el telefono
   */
  AppAplicacion(String pNombre, String pCedulaJuridica, String pDireccion, String pTelefono) {
    nombre = pNombre;
    cedulaJuridica = pCedulaJuridica;
    direccion = pDireccion;
    telefono = pTelefono;
    vendedores = new ArrayList<Empleado>();
    facturas = new ArrayList<Factura>();
    cajeros = new ArrayList<Empleado>();
    publicidad = new Publicidad();
    clientes = new ArrayList<Cliente>();
    empleados = new ArrayList<Empleado>();
  }
  /**
   * Metodo que agrega a clientes
   * @param pNombre el nombre 
   * @param pDireccion la direccion
   * @param pTelefono el telefono
   * @param pCedula la cedula
   * @param pEmail el email
   * @param pOcupacion la ocupacion
   */
  public void agregarCliente(String pNombre, String pDireccion, String pTelefono, String pCedula, String pEmail,
                             String pOcupacion) {
    clientes.add(new PersonaFisica(pNombre, pDireccion, pTelefono, pCedula, pEmail, pOcupacion));
  }
  /**
   * Metodo que agrega a clientes
   * @param pNombre el nombre 
   * @param pDireccion la direccion
   * @param pTelefono el telefono
   * @param pCedula la cedula
   * @param pEmail el email
   * @param pRazonSocial la razon social
   * @param pCuentaPorPagar la cuenta por pagar
   */
  public void agregarCliente(String pNombre, String pDireccion, String pTelefono, String pCedula, String pEmail,
                             String pRazonSocial, int pCuentaPorPagar) {
    clientes.add(
                 new PersonaJuridica(pNombre, pDireccion, pTelefono, pCedula, pEmail, pRazonSocial, pCuentaPorPagar));
  }
  /**
   * Metodo para agregar un empleado
   * @param pNombre el nombre 
   * @param pSalarioBase el salario base
   * @param pComision la comision
   */
  public void agregarEmpleado(String pNombre, int pSalarioBase, int pComision) {
    empleados.add(new Vendedor(pNombre, pSalarioBase, pComision));
  }
  /**
   * Metodo para agregar un vendedor
   * @param pNombre el nombre del vendedor
   * @param pSalarioBase el salario base
   * @param pComision la comision del vendedor
   */
  public void agregarVendedor(String pNombre, int pSalarioBase, int pComision) {
    vendedores.add(new Vendedor(pNombre, pSalarioBase, pComision));
  }
  /**
   * Metodo que arega un cajero
   * @param pNombre el nombre 
   * @param pSalarioBase el salario base
   * @param pAntiguedad la antiguedad del cajero
   * @param pAnosLaborados los años laborados
   * @param pMontoAnual el monto anual del cajero
   */
  public void agregarCajero(String pNombre, int pSalarioBase, int pAntiguedad, int pAnosLaborados, int pMontoAnual) {
    cajeros.add(new Cajero(pNombre, pSalarioBase, pAntiguedad, pAnosLaborados, pMontoAnual));
  }
  /**
   * Metodo que agrega un tecnico
   * @param pNombre el  nombre del tecnico
   * @param pSalarioBase el salario base del tecnico
   * @param pHorasExtra las horas extras del tecnico
   */
  public void agregarTecnico(String pNombre, int pSalarioBase, int pHorasExtra) {
    vendedores.add(new Tecnico(pNombre, pSalarioBase, pHorasExtra));
  }
  /**
   * Metodo que crea una factura de contado
   * @param pCantidad la cantidad de la factura
   * @param pDescricion la descripcion
   * @param pPrecioFinal el preciofinal de la factura
   * @param pGarantia la garantia
   * @param pMarca la marca
   */
  public void crearFacturaContado(int pCantidad, String pDescricion,
                                  Double pPrecioFinal, int pGarantia, String pMarca) {
    if (cajeros.size() > 0 && vendedores.size() > 0) {
      facturas.add(
                   new FacturaContado(nombre, cedulaJuridica, direccion, telefono, cajeros.get(0), vendedores.get(0),
                                      clientes.get(0), pCantidad, pDescricion, pPrecioFinal, pGarantia, pMarca));
      
    }
    
  }
  /**
   * Metodo que crea una factura de credito
   * @param pCantidadMeses la cantidad de los meses
   * @param pInteresMensual los intereses mensuales
   * @param pCuotaMensual la cuota por meses
   * @param pCantidad la cantidad 
   * @param pDescricion la descripcion
   * @param pPrecioFinal el precio final
   * @param pGarantia la garantia
   * @param pMarca la marca
   */
  public void crearFacturaCredito(int pCantidadMeses, double pInteresMensual,
                                  double pCuotaMensual, int pCantidad, String pDescricion,
                                  Double pPrecioFinal, int pGarantia, String pMarca) {
    if (cajeros.size() > 0 && vendedores.size() > 0) {
      facturas.add(new FacturaCredito(nombre, cedulaJuridica, direccion, telefono, cajeros.get(0),
                                      vendedores.get(0), clientes.get(0), pCantidadMeses, pInteresMensual, pCuotaMensual, pCantidad,
                                      pDescricion,
                                      pPrecioFinal, pGarantia, pMarca));
    }
  }
  /**
   * metodo que agrega un anuncio
   * @param pFechaVigencia fecha de vigencia del anuncio
   * @param pDetalle el detalle del anuncio
   */
  public void agregarAnuncio(String pFechaVigencia, String pDetalle) {
    publicidad.agregarMensaje(pFechaVigencia, pDetalle);
  }
  /**
   * Metodo que agrega un anuncio a la factura
   * @param pNumFactura numero de la factura
   * @param pAnuncio el anuncio que desee agregar
   */
  public void agregarAnuncioAFactura(int pNumFactura, int pAnuncio) {
    for (Factura factura : facturas) {
      if (factura.getNumFactura() == pNumFactura) {
        factura.agregarAnuncio(publicidad.getMensajes().get(pAnuncio));
      }
    }
  }
  /**
   * Metodo accesor para obtener la cadenas de facturas
   * @return facturas la factura
   */
  public ArrayList<Factura> getFacturas() {
    return facturas;
  }
}
