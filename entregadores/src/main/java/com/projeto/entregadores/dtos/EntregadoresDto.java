package com.projeto.entregadores.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EntregadoresDto(	
		
		@NotBlank String nome, 
		@NotBlank String cpf,
		@NotNull Integer capveic ) {
	
		 
		 
}
