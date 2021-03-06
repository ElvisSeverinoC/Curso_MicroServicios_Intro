package pe.edu.galaxy.training.java.ms.gestion.talleres.controller.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Response {

	private Integer codigo;
	private String mensaje;

	@JsonInclude(Include.NON_NULL)
	private Object data;
}
