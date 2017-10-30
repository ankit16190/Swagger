package services;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import io.swagger.jaxrs.config.BeanConfig;

public class SwaggerConfiguration extends HttpServlet{
	
	public void init(ServletConfig config) throws ServletException{
		super.init(config);

		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setTitle("Search engine");
		beanConfig.setVersion("1.0");
		beanConfig.setSchemes(new String[]{"http"});
		beanConfig.setHost("localhost:8080");
		beanConfig.setBasePath("/SwaggerExample/webapi");
		beanConfig.setResourcePackage("rs");
		beanConfig.setScan(true);
		beanConfig.setDescription("Faster full text search engine");
		System.out.println("inside swagger");
	}
}
