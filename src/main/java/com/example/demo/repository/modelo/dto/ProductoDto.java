package com.example.demo.repository.modelo.dto;

public class ProductoDto {

	private String codigoB;
	private Integer cantida;
	
	
	
	
	public ProductoDto(String codigoB, Integer cantida) {
		super();
		this.codigoB = codigoB;
		this.cantida = cantida;
	}
	
	public ProductoDto() {
		
	}
	public String getCodigoB() {
		return codigoB;
	}
	public void setCodigoB(String codigoB) {
		this.codigoB = codigoB;
	}
	public Integer getCantida() {
		return cantida;
	}
	public void setCantida(Integer cantida) {
		this.cantida = cantida;
	}
	
	
	
}
