package aplicacion;

import logicadenegocio.*;

/**
 * Clase donde creamos y agregamos informacion a los objetos para ver el
 * funcionamiento correcto de los metodos de logicadenegocio
 */
public class aplAplicacion {
  public static void main(String[] args) {
    AppAplicacion empresa = new AppAplicacion("tecnoLogic S.A.", "200-01-78-4551-1",
        "San Pedro de Montes de Oca, frente sucursal BAC.",
        "(506) 2450-4598");
    empresa.agregarCliente("Luis Pablo Soto Chaves", "Peshurt frente la ganolinera ", "89357243", "70301434",
        "luisSoto@gmail.com",
        "Profesor");
    empresa.agregarCliente("Andy Porras", "Paraiso sixaola", "89357284", "703101047", "andyporras@gmail.com",
        "director",
        100);

    empresa.agregarVendedor("Pedro", 1000, 10);
    empresa.agregarCajero("Juan", 1000, 10, 10, 1000);
    empresa.agregarTecnico("Andy", 1000, 10);
    empresa.agregarAnuncio("15-11-2023", "50% de descuento en todos los productos intel");
    empresa.agregarAnuncio("07-10-2024", "30% de descuento en todos los productos de la marca HP");
    empresa.crearFacturaContado(5, " puerta", 20000.0, 12, "hp", 0, 0, 0);
    empresa.crearFacturaCredito(12, 0.50, 1000, 7, " puerta", 204200.0, 12, "hp", 0, 0, 1);
    Factura factura1 = empresa.getFacturas().get(0);
    Factura factura2 = empresa.getFacturas().get(1);
    factura1.agregarItem(10, "Ranto ", 5000.0, 1, "hp");
    factura1.agregarItem(14, "Teclado ", 5400.0, 1, "hp");
    factura2.agregarItem(15, "Laptos ", 4500.0, 1, "hp");
    factura2.agregarItem(10, "procesadir intel i 7 generacion 8", 5000.0, 1, "hp");
    empresa.agregarAnuncioAFactura(1, 0);
    empresa.agregarAnuncioAFactura(2, 1);
    for (Factura f : empresa.getFacturas()) {
      System.out.println(f.toString());
    }

  }
}
