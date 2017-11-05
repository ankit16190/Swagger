package docCreation;

import static org.asciidoctor.Asciidoctor.Factory.create;
import static org.asciidoctor.OptionsBuilder.options;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.internal.JRubyAsciidoctor;

public class AsciidoctorDemo {

	public static void main(String args[]){
		
		Asciidoctor asciidoctor = JRubyAsciidoctor.create();
		Map<String, Object> options = options()
				  .inPlace(true)
				  .backend("pdf")
				  .asMap();
		
		String output = asciidoctor
				  .convertFile(new File("PathTo.adoc file"), new HashMap<String, Object>());
		
		
	}
}
