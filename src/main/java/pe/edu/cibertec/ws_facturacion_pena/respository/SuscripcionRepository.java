package pe.edu.cibertec.ws_facturacion_pena.respository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ws_facturacion_pena.model.Suscripcion;

import java.util.Date;

@Repository
public interface SuscripcionRepository extends JpaRepository<Suscripcion, Integer> {
    @Transactional
    @Modifying
    @Procedure(procedureName = "ActualizarSuscripcion")
    void actualizarSuscripcion(
            @Param("p_suscripcionid") Integer suscripcionid,
            @Param("p_nuevo_planid") Integer planid
    );
}
