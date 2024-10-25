package pe.edu.cibertec.ws_facturacion_pena.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.ws_facturacion_pena.dto.GenericResponseDto;
import pe.edu.cibertec.ws_facturacion_pena.dto.PagoDto;
import pe.edu.cibertec.ws_facturacion_pena.service.IPagoService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/pago")
public class PagoController {
    private final IPagoService pagoService;

    @PostMapping("")
    public ResponseEntity<GenericResponseDto<String>> RegistrarPago(
            @RequestBody PagoDto pagoDto
    ) {
        try {
            pagoService.registrarPagoYFactura(pagoDto);
            return new ResponseEntity<>(GenericResponseDto.<String>builder()
                    .correcto(true).mensaje("Pago registrado correctamente")
                    .build(), HttpStatus.CREATED);
        }catch (Exception ex){
            return new ResponseEntity<>(GenericResponseDto.<String>builder()
                    .correcto(false).mensaje("Pago no registrado")
                    .build(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
