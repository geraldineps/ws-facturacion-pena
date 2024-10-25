package pe.edu.cibertec.ws_facturacion_pena.respository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ws_facturacion_pena.model.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago,Integer> {

    @Transactional
    @Modifying
    @Procedure(procedureName = "RegistrarPago")
    void registrarPagoyFactura(
            @Param("p_usuarioid") Integer usuarioid,
            @Param("p_suscripcionid") Integer suscripcionid
    );
}
