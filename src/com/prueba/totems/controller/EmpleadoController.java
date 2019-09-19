package com.prueba.totems.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.prueba.totems.dto.EmpleadoDTO;
import com.prueba.totems.exception.RespException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
@Path("/v1")
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "Empleados")
public class EmpleadoController {

	@ApiOperation(value = "Consultar",
		      notes = "Consulta todos los empleados",responseContainer = "List", response = EmpleadoDTO.class)
	@ApiResponses(value = {
		      @ApiResponse(code = 500,response = RespException.class,
		            message = "Error Interno ha ocurrido"),
		      @ApiResponse(code = 404,
		            message = "Order not found for ID"),
		      @ApiResponse(code = 400,
		            message = "Invalid order - no order items") })
	 @GET
	    @Path("/Empleados")
	 public List<EmpleadoDTO> getAllEmpleados(@ApiParam(value = "blaaa" ,required=false) @HeaderParam(value="X-RqUID") String xRqUID) {
		 EmpleadoDTO emp1=new EmpleadoDTO(1,"Harry","Hurtado");
		 EmpleadoDTO emp2=new EmpleadoDTO(2,"Pedro","Perez");
		 EmpleadoDTO emp3=new EmpleadoDTO(3,"Nicolas","Chavez");
		 List<EmpleadoDTO> lisEmp=new ArrayList<EmpleadoDTO>();
		 lisEmp.add(emp1);
		 lisEmp.add(emp2);
		 lisEmp.add(emp3);
	       // return empleadoSessionFacade.geAlltListEmpleados();
				 return lisEmp;
	 }
}
