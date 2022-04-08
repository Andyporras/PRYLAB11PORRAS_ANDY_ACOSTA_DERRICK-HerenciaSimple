package logicadenegocio;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 * Esta es la clase de la factura va tener los detalles de la compra
 * 
 * @author Derrick Acosta
 * @version 03/04/2022
 */
public class Factura {
  //Atributos de la clase
  private static int catidadFactura;
  private String nombre;
  private String cedulaJuridica;
  private String direccion;
  private String telefono;
  private Date fechaFactura;
  private Date horaFactura;
  private int numeroFactura;
  private Mensaje anuncio;
  private ArrayList<LineaDetalle> lineaDetalle;
  private Empleado cajero;
  private Empleado vendedor;
  private Cliente cliente;

  /**
   * Constructor de la clase Factura
   * @param pNombre el nombre de la factura
   * @param pCedulaJuridica la cedula juridica de la persona
   * @param pDireccion la direccion de la persona
   * @param pTelefono el numero de telefono
   * @param pCajero el cajero 
   * @param pVendedor el vendedor
   * @param pCliente el cliente 
   * @param pCantidad la cantidad de la factura
   * @param pDescricion la descripcion de la factura
   * @param pPrecioFinal el precio final de la factura
   * @param pGarantia la garantia 
   * @param pCodigoTecnico el codigo del tecnico
   * @param pMantenimientoOReparacion el mantenimiento o la reparacion
   */
  public Factura(String pNombre, String pCedulaJuridica, String pDireccion, String pTelefono,
      Empleado pCajero, Empleado pVendedor, Cliente pCliente, int pCantidad, String pDescricion, int pPrecioFinal,
      int pGarantia,
      int pCodigoTecnico, int pMantenimientoOReparacion) {
    lineaDetalle = new ArrayList<LineaDetalle>();
    lineaDetalle.add(new LineaDetalle(pCantidad, pDescricion, pPrecioFinal, pGarantia, pCodigoTecnico,
        pMantenimientoOReparacion));
    nombre = pNombre;
    cedulaJuridica = pCedulaJuridica;
    direccion = pDireccion;
    telefono = pTelefono;
    setFechaFactura();
    setHoraFactura();
    catidadFactura++;
    numeroFactura = catidadFactura;
    cajero = pCajero;
    vendedor = pVendedor;
    cliente = pCliente;
  }

  /**
   * /**
   * Constructor de la clase Factura
   * @param pNombre el nombre de la factura
   * @param pCedulaJuridica la cedula juridica de la persona
   * @param pDireccion la direccion de la persona
   * @param pTelefono el numero de telefono
   * @param pCajero el cajero 
   * @param pVendedor el vendedor
   * @param pCliente el cliente 
   * @param pCantidad la cantidad de la factura
   * @param pDescricion la descripcion de la factura
   * @param pPrecioFinal el precio final de la factura
   * @param pGarantia la garantia que tiene
   * @param pMarca la marca
   */
  public Factura(String pNombre, String pCedulaJuridica, String pDireccion, String pTelefono,
      Empleado pCajero, Empleado pVendedor, Cliente pCliente, int pCantidad, String pDescricion, Double pPrecioFinal,
      int pGarantia,
      String pMarca) {
    lineaDetalle = new ArrayList<LineaDetalle>();
    lineaDetalle.add(new LineaDetalle(pCantidad, pDescricion, pPrecioFinal, pGarantia, pMarca));
    nombre = pNombre;
    cedulaJuridica = pCedulaJuridica;
    direccion = pDireccion;
    telefono = pTelefono;
    setFechaFactura();
    setHoraFactura();
    catidadFactura++;
    numeroFactura = catidadFactura;
    cajero = pCajero;
    vendedor = pVendedor;
    cliente = pCliente;

  }
  /**
   * Metodo accesor a la hora de factura
   */
  public void setHoraFactura() {
    horaFactura = new Date();
  }
  /**
   * Metodo accesor de la hora de factura
   * @return mascara.format(horaFactura) para obtener la hora
   */
  public String getHoraFactura() {
    SimpleDateFormat mascara = new SimpleDateFormat("HH:mm:ss");
    return mascara.format(horaFactura);
  }
  /**
   * metodo accesor a la fecha de factura
   */
  public void setFechaFactura() {
    fechaFactura = new Date();
  }
  /**
   * Metodo para calculura el sub total de la factura
   * @return la cantidad del sub total
   */
  public double calcularSubTotal() {
    double subTotal = 0;
    for (LineaDetalle linea : lineaDetalle) {
      subTotal += linea.getPrecio();
    }
    return subTotal;
  }
  /**
   * Metodo para calcular el impuesto de venta 
   * @return la cantidad del impuesto de venta
   */
  public double calcularImpuestoVenta() {
    double impuestoVenta = 0;
    for (LineaDetalle linea : lineaDetalle) {
      impuestoVenta += linea.getPrecio() * 0.13;
    }
    return impuestoVenta;
  }
  /**
   * Metodo para calcular el total de la factura
   * @return total el total por pagar
   */
  public double calcularTotal() {
    double total = 0;
    total += calcularSubTotal() + calcularImpuestoVenta();
    return total;
  }
  /**
   * metodo que añade un item a la factura
   * @param pCantidad la cantidad de la factura
   * @param pDescricion la descripcion de la factura
   * @param pPrecioFinal el precio final de la factura
   * @param pGarantia la garantia que tiene
   * @param pMarca la marca
   */
  public void agregarItem(int pCantidad, String pDescricion, Double pPrecioFinal, int pGarantia, String pMarca) {
    lineaDetalle.add(new LineaDetalle(pCantidad, pDescricion, pPrecioFinal, pGarantia, pMarca));
  }
  /**
   * metodo que añade un item a la factura
   * @param pCantidad la cantidad de la factura
   * @param pDescricion la descripcion de la factura
   * @param pPrecioFinal el precio final de la factura
   * @param pGarantia la garantia que tiene
   * @param pCodigoTecnico el codigo del tecnico
   * @param pMantenimientoOReparacion el mantenimiento o la reparacion
   */
  public void agregarItem(int pCantidad, String pDescricion, int pPrecioFinal, int pGarantia, int pCodigoTecnico,
      int pMantenimientoOReparacion) {
    lineaDetalle.add(
        new LineaDetalle(pCantidad, pDescricion, pPrecioFinal, pGarantia, pCodigoTecnico, pMantenimientoOReparacion));

  }
  /**
   * metodo que agrega un anuncio
   * @param pAnuncio el anuncio que desea agregar
   */
  public void agregarAnuncio(Mensaje pAnuncio) {
    anuncio = pAnuncio;
  }
  /**
   * metodo accesor para obtener la fecha
   * @return mascara.format(fechaFactura) la fecha
   */
  public String getFechar() {
    SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
    return mascara.format(fechaFactura);
  }
  /**
   * metodo accesor para el numero de factura
   * @return el numero de factura
   */
  public int getNumFactura() {
    return numeroFactura;
  }
  /**
   * Metodo que representa el objeto
   * @return msj toda la informacion de la factura
   */
  public String toString() {
    String msj = "";
    msj += "\t\t\t" + nombre + "\n";
    msj += "\t\tCedula Juridica: " + cedulaJuridica + "\n";
    msj += "\t\tDireccion: " + direccion + "\n";
    msj += "\t\tTelefono: " + telefono + "\n";
    msj += "Fecha Factura: " + getFechar();
    msj += " Hora: " + horaFactura + "\n\n";
    msj += "Numero de Factura: " + numeroFactura + "\n";
    msj += "Vendedor: V" + vendedor.getNumeroEmpleado() + "  " + vendedor.getNombre() + "\n";
    msj += "Cajero: C" + cajero.getNumeroEmpleado() + "  " + cajero.getNombre() + "\n";
    msj += "" + cliente.toString() + "\n\n";
    msj += "Detalle de la Factura:\n";
    msj += "Cantidad\tDescripcion\tprecio\n";
    for (LineaDetalle linea : lineaDetalle) {
      msj += linea.toString();
    }
    msj += "\t\t\tSubtotal: " + calcularSubTotal() + "\n";
    msj += "\t\t\tImpuesto: " + calcularImpuestoVenta() + "\n";
    msj += "\t\t\tTotal: " + calcularTotal() + "\n\n";
    msj += "Anuncio: " + anuncio.toString();
    return msj;
  }

}
