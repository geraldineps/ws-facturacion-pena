package pe.edu.cibertec.ws_facturacion_pena.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Builder
@Data
public class PagoDto {
    private Integer pagoid;
    private Integer usuarioid;
    private Integer suscripcionid;
    private Date fecha_transaccion;
    private String estado;
}
