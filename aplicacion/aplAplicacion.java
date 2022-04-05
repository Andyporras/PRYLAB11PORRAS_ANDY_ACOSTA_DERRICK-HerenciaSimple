package aplicacion;

import logicadenegocio.*;

public class aplAplicacion {
    public static void main(String[] args) {
        AppAplicacion empresa = new AppAplicacion("Pura vida", "123456789", "Calle falsa 123", "1234567890");
        empresa.agregarCliente("Juan", "Calle falsa 123", "1234567890", "123456789", "juan@gmail.com", "Vendedor");
        empresa.agregarCliente("Pedro", "Calle falsa 123", "1234567890", "123456789", "compra de avanicos", "director",
                100);

        empresa.agregarVendedor("Pedro", 1000, 10);
        empresa.agregarCajero("Juan", 1000, 10, 10, 1000);
        empresa.agregarTecnico("Andy", 1000, 10);
        empresa.agregarAnuncio("15-11-2023", "Compre 5 y lleve uno gratis");
        empresa.agregarAnuncio("07-10-2024", "Compre 2 y lleve uno gratis");
        empresa.crearFacturaContado(5, " puerta", 20000.0, 12, "pura vida");
        empresa.crearFacturaCredito(12, 0.50, 1000, 7, " puerta", 204200.0, 12, "pura vida");
        for (Factura f : empresa.getFacturas()) {
            f.agregarItem(10, "clavos", 5000.0, 1, "pura vida");
            f.agregarItem(14, "llaves", 5400.0, 1, "pura vida");
        }
        empresa.agregarAnuncioAFactura(1, 0);
        empresa.agregarAnuncioAFactura(2, 1);
        for (Factura f : empresa.getFacturas()) {
            System.out.println(f.toString());
        }

    }
}
