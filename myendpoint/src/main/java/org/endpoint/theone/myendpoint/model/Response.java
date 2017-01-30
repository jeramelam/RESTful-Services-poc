package org.endpoint.theone.myendpoint.model;

public class Response {
	private Integer reqValue;
	private Integer dbValue;
	private Integer product;
	public Response(){
		
	}	
	public Response(Integer reqValue, Integer dbValue) {
		this.reqValue = reqValue;
		this.dbValue = dbValue;
		this.product = reqValue*dbValue;
	}
	public Integer getReqValue() {
		return reqValue;
	}
	public void setReqValue(Integer reqValue) {
		this.reqValue = reqValue;
	}
	public Integer getDbValue() {
		return dbValue;
	}
	public void setDbValue(Integer dbValue) {
		this.dbValue = dbValue;
	}
	public Integer getProduct() {
		product = reqValue * dbValue;
		return product;
	}
	public void setProduct(Integer product) {
		this.product = product;
	}
}