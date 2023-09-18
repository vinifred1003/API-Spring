package dio.web.api.doc;



import org.springframework.boot.autoconfigure.SpringBootApplication;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;



@SpringBootApplication
@OpenAPIDefinition(
		
		info = @Info(
				title ="Title - Rest API",
				description = "API exemplo de uso de Springboot REST API",
				version = "1.0",
				termsOfService = "Termo de uso: Open Source" ,
		contact = @Contact(
				name ="vinifred1003",
				url = "meusite@.com.br",
				email = "viniciusfrederico1003@gmail.com"
				),
		license = @License (
				name = "license",
				url = "meusite"
				)
		)
)
public class SwaggerConfig {
	
}
