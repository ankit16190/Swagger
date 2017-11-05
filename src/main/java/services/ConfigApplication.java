package services;



import org.glassfish.jersey.server.ResourceConfig;

import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import rs.PeopleRestService;

public class ConfigApplication extends ResourceConfig{
	
	public ConfigApplication(){
		
		register(ApiListingResource.class);
		register(SwaggerSerializers.class);
		register(PeopleRestService.class);
	}

}
