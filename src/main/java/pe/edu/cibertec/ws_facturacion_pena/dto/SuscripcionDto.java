package pe.edu.cibertec.ws_facturacion_pena.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Builder
@Data
public class SuscripcionDto {
    private Integer suscripcionid;
    private Integer usuarioid;
    private Integer planid;
    private Date fecha_inicio;
    private Date fecha_fin;
    private Boolean activo;
}
