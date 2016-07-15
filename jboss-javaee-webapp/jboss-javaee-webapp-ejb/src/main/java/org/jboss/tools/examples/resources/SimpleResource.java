package org.jboss.tools.examples.resources;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Stateless
@Path("/simple")
@Api(value="/simple")
public class SimpleResource {

	@GET
	@ApiOperation(value="Say hello")
	public String sayHello(){
		return "Hello there!\n I'm here!";
	}
	
}
