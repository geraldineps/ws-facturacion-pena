package pe.edu.cibertec.ws_facturacion_pena.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "RegistroPago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pagoid;
    private Integer usuarioid;
    @ManyToOne
    @JoinColumn(name = "suscripcionid")
    private Suscripcion suscripcion;
    private Date fecha_transaccion;
    private String estado;
}
