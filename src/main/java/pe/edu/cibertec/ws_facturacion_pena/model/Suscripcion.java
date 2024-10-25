package pe.edu.cibertec.ws_facturacion_pena.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Suscripciones")
public class Suscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer suscripcionid;
    private Integer usuarioid;
    @ManyToOne
    @JoinColumn(name = "planid")
    private Plan plan;
    private Date fecha_inicio;
    private Date fecha_fin;
    private Boolean activo;
}
