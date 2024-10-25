package pe.edu.cibertec.ws_facturacion_pena.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Plan")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer planid;
    private String descripcion;
    private Integer duracion;
    private Double precio;
}
