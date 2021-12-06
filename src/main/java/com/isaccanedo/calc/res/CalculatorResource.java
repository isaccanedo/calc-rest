package com.isaccanedo.calc.res;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.isaccanedo.calc.model.Response;
import com.isaccanedo.calc.service.impl.ResponseServiceImpl;

@Path("calc")
@Component
public class CalculatorResource {
	
	@Autowired
	private ResponseServiceImpl responseServiceImpl;
	
	@Path("add")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAdd(@QueryParam("firstNumber") int firstNumber, 
			@QueryParam("secondNumber") int secondNumber) {
		return responseServiceImpl.getAdd(firstNumber, secondNumber);
	}
	
	@Path("add")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAdd(Response response) {
		return responseServiceImpl.getAdd(response);
	}
	
	@Path("sub")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSub(@QueryParam("firstNumber") int firstNumber, 
			@QueryParam("secondNumber") int secondNumber) {
		return responseServiceImpl.getSub(firstNumber, secondNumber);
	}
	
	@Path("sub")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getSub(Response response) {
		return responseServiceImpl.getSub(response);
	}
	
	@Path("mul")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMulTiply(@QueryParam("firstNumber") int firstNumber, 
			@QueryParam("secondNumber") int secondNumber) {
		return responseServiceImpl.getMultiply(firstNumber, secondNumber);
	}
	
	@Path("mul")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getMulTiply(Response response) {
		return responseServiceImpl.getMultiply(response);
	}
	
	@Path("div")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDevide(@QueryParam("firstNumber") int firstNumber, 
			@QueryParam("secondNumber") int secondNumber) {
		return responseServiceImpl.getDevide(firstNumber, secondNumber);
	}
	
	@Path("div")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getDevide(Response response) {
		return responseServiceImpl.getDevide(response);
	}
}
