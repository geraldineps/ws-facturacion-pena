package pe.edu.cibertec.ws_facturacion_pena.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.ws_facturacion_pena.dto.GenericResponseDto;
import pe.edu.cibertec.ws_facturacion_pena.dto.SuscripcionDto;
import pe.edu.cibertec.ws_facturacion_pena.service.ISuscripcionService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/suscripcion")
public class SuscripcionController {
    private final ISuscripcionService suscripcionService;

    @PutMapping("")
    public ResponseEntity<GenericResponseDto<String>> actualizarSuscripcion(
            @RequestBody SuscripcionDto suscripcionDto
    ) {
        try {
            suscripcionService.actualizarSuscripcion(suscripcionDto);
            return new ResponseEntity<>(GenericResponseDto.<String>builder()
                    .correcto(true).mensaje("Suscripción actualizada correctamente")
                    .build(), HttpStatus.CREATED);
        }catch (Exception ex){
            return new ResponseEntity<>(GenericResponseDto.<String>builder()
                    .correcto(false).mensaje("Suscripcion no actualizada")
                    .build(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
