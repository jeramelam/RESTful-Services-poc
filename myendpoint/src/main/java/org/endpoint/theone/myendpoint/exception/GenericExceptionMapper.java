package org.endpoint.theone.myendpoint.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.endpoint.theone.myendpoint.model.ErrorMsg;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {
	@Override
	public Response toResponse(Throwable exception) {
		ErrorMsg errMsg = new ErrorMsg("Invalid Request");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errMsg).build();
	}
	
}
