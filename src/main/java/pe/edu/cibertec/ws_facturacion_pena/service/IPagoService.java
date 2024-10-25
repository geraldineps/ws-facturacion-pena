package pe.edu.cibertec.ws_facturacion_pena.service;

import pe.edu.cibertec.ws_facturacion_pena.dto.PagoDto;
import pe.edu.cibertec.ws_facturacion_pena.dto.SuscripcionDto;

public interface IPagoService {
    void registrarPagoYFactura(PagoDto pagoDto);
}
