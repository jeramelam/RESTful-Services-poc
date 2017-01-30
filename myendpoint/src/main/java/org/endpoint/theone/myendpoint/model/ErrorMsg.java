package org.endpoint.theone.myendpoint.model;

public class ErrorMsg {
	private String errorMessage;
	private String jsonInputFormat;
	private String jsonInputExample;
	public ErrorMsg(){
		
	}
	public ErrorMsg(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public ErrorMsg(String errorMessage, String jsonInputFormat, String jsonInputExample) {
		this.errorMessage = errorMessage;
		this.jsonInputFormat = jsonInputFormat;
		this.jsonInputExample = jsonInputExample;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getJsonInputFormat() {
		return jsonInputFormat;
	}
	public void setJsonInputFormat(String jsonInputFormat) {
		this.jsonInputFormat = jsonInputFormat;
	}
	public String getJsonInputExample() {
		return jsonInputExample;
	}
	public void setJsonInputExample(String jsonInputExample) {
		this.jsonInputExample = jsonInputExample;
	}
}
