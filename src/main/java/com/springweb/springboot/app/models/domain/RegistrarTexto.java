package com.springweb.springboot.app.models.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public class RegistrarTexto {
	
	@NotBlank(message="Debes escribir un texto")
	private String textInput;
	
	@NotEmpty
	private String fileInput;

	public String getTextInput() {
		return textInput;
	}

	public void setTextInput(String textInput) {
		this.textInput = textInput;
	}

	public String getFileInput() {
		return fileInput;
	}

	public void setFileInput(String fileInput) {
		this.fileInput = fileInput;
	}
}