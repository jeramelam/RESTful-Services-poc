package org.endpoint.theone.myendpoint.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.endpoint.theone.myendpoint.model.ErrorMsg;

@Provider
public class DatabaseErrorExceptionMapper implements ExceptionMapper<DatabaseErrorException> {
	@Override
	public Response toResponse(DatabaseErrorException exception) {
		ErrorMsg errMsg = new ErrorMsg("Unable to connect to the database.");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errMsg).build();
	}
	
}
