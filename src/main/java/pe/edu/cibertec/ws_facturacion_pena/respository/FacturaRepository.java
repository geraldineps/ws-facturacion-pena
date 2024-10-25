package pe.edu.cibertec.ws_facturacion_pena.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ws_facturacion_pena.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura,Integer> {
}
