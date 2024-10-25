package pe.edu.cibertec.ws_facturacion_pena.service.implementacion;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ws_facturacion_pena.controller.PagoController;
import pe.edu.cibertec.ws_facturacion_pena.dto.PagoDto;
import pe.edu.cibertec.ws_facturacion_pena.model.Pago;
import pe.edu.cibertec.ws_facturacion_pena.respository.PagoRepository;
import pe.edu.cibertec.ws_facturacion_pena.service.IPagoService;
import pe.edu.cibertec.ws_facturacion_pena.util.convert.PagoConvert;

@RequiredArgsConstructor
@Service
public class PagoService implements IPagoService {
    private final PagoRepository pagoRepository;
    private final PagoConvert pagoConvert;
    @Override
    public void registrarPagoYFactura(PagoDto pagoDto) {
        pagoRepository.registrarPagoyFactura(
                pagoDto.getUsuarioid(),
                pagoDto.getSuscripcionid());

    }
}
