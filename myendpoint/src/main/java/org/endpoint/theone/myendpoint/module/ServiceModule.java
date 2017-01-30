package org.endpoint.theone.myendpoint.module;

import org.endpoint.theone.myendpoint.dao.DAO;
import org.endpoint.theone.myendpoint.exception.DataFormatErrorException;
import org.endpoint.theone.myendpoint.model.Response;


public class ServiceModule {
	public Response getProduct(Response res){	
		if (res.getReqValue()==null) {
			throw new DataFormatErrorException("No request value found.");
		}
		DAO.preload();
		res.setDbValue(DAO.retrieveNumber());
		System.out.println("Number in Request is "+res.getReqValue());
		System.out.println("The Response Product is "+res.getProduct());
		return res;
	}
}
