package pe.edu.cibertec.ws_facturacion_pena.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws_facturacion_pena.dto.PagoDto;
import pe.edu.cibertec.ws_facturacion_pena.dto.SuscripcionDto;
import pe.edu.cibertec.ws_facturacion_pena.model.Pago;
import pe.edu.cibertec.ws_facturacion_pena.model.Plan;
import pe.edu.cibertec.ws_facturacion_pena.model.Suscripcion;

@Component
public class PagoConvert {
    public PagoDto convertirPagoAPagoDto(Pago pago){
        return PagoDto.builder().pagoid(pago.getPagoid())
                .usuarioid(pago.getUsuarioid())
                .suscripcionid(pago.getSuscripcion().getSuscripcionid())
                .fecha_transaccion(pago.getFecha_transaccion())
                .estado(pago.getEstado())
                .build();
    }

    public Pago convertirPagoDtoAPago(PagoDto pagoDto){
        Pago pago = new Pago();
        pago.setPagoid(pagoDto.getPagoid());
        pago.setUsuarioid(pagoDto.getUsuarioid());
        Suscripcion suscripcion = new Suscripcion();
        pago.setSuscripcion(suscripcion);
        suscripcion.setSuscripcionid(pagoDto.getSuscripcionid());
        pago.setFecha_transaccion(pagoDto.getFecha_transaccion());
        pago.setEstado(pagoDto.getEstado());
        return pago;
    }


}
