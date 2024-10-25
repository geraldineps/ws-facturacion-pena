package pe.edu.cibertec.ws_facturacion_pena.service.implementacion;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ws_facturacion_pena.dto.SuscripcionDto;
import pe.edu.cibertec.ws_facturacion_pena.respository.SuscripcionRepository;
import pe.edu.cibertec.ws_facturacion_pena.service.ISuscripcionService;
@RequiredArgsConstructor
@Service
public class SuscripcionService implements ISuscripcionService {

    public final SuscripcionRepository suscripcionRepository;
    @Override
    public void actualizarSuscripcion(SuscripcionDto suscripcionDto) {
        suscripcionRepository.actualizarSuscripcion(
                suscripcionDto.getSuscripcionid(),
                suscripcionDto.getPlanid());
    }

}
