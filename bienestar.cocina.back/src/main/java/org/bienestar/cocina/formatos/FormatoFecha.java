package org.bienestar.cocina.formatos;

public class FormatoFecha {

	private String formato;
	
	public FormatoFecha() {
		this.formato = "^([0-2][0-9]|3[0-1])(\\/)(0[1-9]|1[0-2])\\2(\\d{4})$";
	}

	public String getFormato() {
		return formato;
	}

}
