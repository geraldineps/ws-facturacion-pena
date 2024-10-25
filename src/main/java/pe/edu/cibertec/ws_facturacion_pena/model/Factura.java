package pe.edu.cibertec.ws_facturacion_pena.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Suscripciones")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer facturaid;
    @ManyToOne
    @JoinColumn(name = "pagoid")
    private Pago pago;
    private Date fecha_factura;
    private Double monto;
}
