package aplicacion;

import java.util.ArrayList;

import logicadenegocio.*;

public class AppAplicacion {
    private String nombre;
    private String cedulaJuridica;
    private String direccion;
    private String telefono;
    private ArrayList<Empleado> empleados;
    private ArrayList<Empleado> vendedores;
    private ArrayList<Factura> facturas;
    private ArrayList<Cliente> personaFisica;
    private ArrayList<Cliente> personaJuridica;
    private ArrayList<Empleado> cajeros;
    private Publicidad publicidad;
    private ArrayList<Cliente> clientes;

    AppAplicacion(String pNombre, String pCedulaJuridica, String pDireccion, String pTelefono) {
        nombre = pNombre;
        cedulaJuridica = pCedulaJuridica;
        direccion = pDireccion;
        telefono = pTelefono;
        vendedores = new ArrayList<Empleado>();
        facturas = new ArrayList<Factura>();
        personaFisica = new ArrayList<Cliente>();
        personaJuridica = new ArrayList<Cliente>();
        cajeros = new ArrayList<Empleado>();
        publicidad = new Publicidad();
        clientes = new ArrayList<Cliente>();
        empleados = new ArrayList<Empleado>();
    }

    public void agregarCliente(String pNombre, String pDireccion, String pTelefono, String pCedula, String pEmail,
            String pOcupacion) {
        clientes.add(new PersonaFisica(pNombre, pDireccion, pTelefono, pCedula, pEmail, pOcupacion));
    }

    public void agregarCliente(String pNombre, String pDireccion, String pTelefono, String pCedula, String pEmail,
            String pRazonSocial, int pCuentaPorPagar) {
        clientes.add(
                new PersonaJuridica(pNombre, pDireccion, pTelefono, pCedula, pEmail, pRazonSocial, pCuentaPorPagar));
    }

    public void agregarEmpleado(String pNombre, int pSalarioBase, int pComision) {
        empleados.add(new Vendedor(pNombre, pSalarioBase, pComision));
    }

    public void agregarVendedor(String pNombre, int pSalarioBase, int pComision) {
        vendedores.add(new Vendedor(pNombre, pSalarioBase, pComision));
    }

    public void agregarCajero(String pNombre, int pSalarioBase, int pAntiguedad, int pAnosLaborados, int pMontoAnual) {
        cajeros.add(new Cajero(pNombre, pSalarioBase, pAntiguedad, pAnosLaborados, pMontoAnual));
    }

    public void agregarTecnico(String pNombre, int pSalarioBase, int pHorasExtra) {
        vendedores.add(new Tecnico(pNombre, pSalarioBase, pHorasExtra));
    }

    public void crearFacturaContado(int pCantidad, String pDescricion,
            Double pPrecioFinal, int pGarantia, String pMarca) {
        if (cajeros.size() > 0 && vendedores.size() > 0) {
            facturas.add(
                    new FacturaContado(nombre, cedulaJuridica, direccion, telefono, cajeros.get(0), vendedores.get(0),
                            pCantidad, pDescricion, pPrecioFinal, pGarantia, pMarca));
        }

    }

    public void crearFacturaCredito(int pCantidadMeses, double pInteresMensual,
            double pCuotaMensual, int pCantidad, String pDescricion,
            Double pPrecioFinal, int pGarantia, String pMarca) {
        if (cajeros.size() > 0 && vendedores.size() > 0) {
            facturas.add(new FacturaCredito(nombre, cedulaJuridica, direccion, telefono, cajeros.get(0),
                    vendedores.get(0), pCantidadMeses, pInteresMensual, pCuotaMensual, pCantidad, pDescricion,
                    pPrecioFinal, pGarantia, pMarca));
        }
    }

    public void agregarAnuncio(String pFechaVigencia, String pDetalle) {
        publicidad.agregarMensaje(pFechaVigencia, pDetalle);
    }

    public void agregarAnuncioAFactura(int pNumFactura, int pAnuncio) {
        for (Factura factura : facturas) {
            if (factura.getNumFactura() == pNumFactura) {
                factura.agregarAnuncio(publicidad.getMensajes().get(pAnuncio));
            }
        }
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
}
