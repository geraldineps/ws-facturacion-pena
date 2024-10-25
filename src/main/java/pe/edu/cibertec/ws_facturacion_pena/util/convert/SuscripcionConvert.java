package pe.edu.cibertec.ws_facturacion_pena.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws_facturacion_pena.dto.SuscripcionDto;
import pe.edu.cibertec.ws_facturacion_pena.model.Plan;
import pe.edu.cibertec.ws_facturacion_pena.model.Suscripcion;

@Component
public class SuscripcionConvert {
    public Suscripcion convertirSuscripcionASuscripcionDto(SuscripcionDto suscripcionDto){
        Suscripcion suscripcion= new Suscripcion();
        suscripcion.setSuscripcionid(suscripcionDto.getSuscripcionid());
        suscripcion.setUsuarioid(suscripcionDto.getUsuarioid());
        Plan plan = new Plan();
        suscripcion.setPlan(plan);
        plan.setPlanid(suscripcionDto.getPlanid());
        suscripcion.setFecha_inicio(suscripcionDto.getFecha_inicio());
        suscripcion.setFecha_fin(suscripcionDto.getFecha_fin());
        suscripcion.setActivo(suscripcionDto.getActivo());
        return suscripcion;
    }
}
