package docCreation;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import io.github.swagger2markup.GroupBy;
import io.github.swagger2markup.Language;
import io.github.swagger2markup.OrderBy;
import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;

public class Swagger2MarkupDemo {

	
	public static void main (String args[]) throws MalformedURLException{
		
		//to access UI http://localhost:8080/SwaggerExample/dist/index.html
		
		
		URL remoteSwaggerFile = new URL("http://localhost:8080/SwaggerExample/webapi/swagger.json");
		Path outputDirectory = Paths.get("PathToProject/Swagger/SwaggerExample/WebContent/SwaggerDoc");
		Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder() 
				
		        .withMarkupLanguage(MarkupLanguage.ASCIIDOC)
		        
		        .build(); 
		Swagger2MarkupConverter.from(remoteSwaggerFile) 
		.withConfig(config)
		        .build() 
		        .toFolder(outputDirectory);

	}
}
