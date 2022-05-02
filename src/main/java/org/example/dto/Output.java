package org.example.dto;

import java.io.Serializable;

public class Output implements Serializable {
	
	private static final long serialVersionUID = 3538437013854893036L;
	
	
	private String output;
	private String description;
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
