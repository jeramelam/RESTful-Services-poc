package org.endpoint.theone.myendpoint.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.endpoint.theone.myendpoint.model.ErrorMsg;

@Provider
public class DataFormatErrorExceptionMapper implements ExceptionMapper<DataFormatErrorException> {
	@Override
	public Response toResponse(DataFormatErrorException exception) {
		ErrorMsg errMsg = new ErrorMsg("Incorrect JSON format. reqValue must be an integer.", "{reqValue: <integer>}","{reqValue: 4}");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errMsg).build();
	}
	
}
