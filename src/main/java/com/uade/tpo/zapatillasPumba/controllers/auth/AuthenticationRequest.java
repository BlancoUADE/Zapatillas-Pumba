package com.uade.tpo.zapatillasPumba.controllers.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/* Estas anotaciones de Lombok generan automaticamente
 * los metodos getters, setters, constructores y el builder
 * Los vamos a estar repitiendo mucho
 */

@Data // Genera getters y setters
@Builder // Permite el uso del patron builder
@AllArgsConstructor // Genera un constructor con todos los atributos
@NoArgsConstructor // Genera un constructor vacio

// Los requests son los objetos que mandamos desde el cliente al servidor
public class AuthenticationRequest {

    private String email;
    private String password;
}
