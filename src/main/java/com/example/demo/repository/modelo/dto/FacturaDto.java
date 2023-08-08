package com.example.demo.repository.modelo.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FacturaDto {
private String nombre;
private LocalDate fecha;
private Integer cantidad;
private BigDecimal precioUnitario;
private BigDecimal subtotal;

public FacturaDto(String nombre, LocalDate fecha, Integer cantidad, BigDecimal precioUnitario, BigDecimal subtotal) {
	super();
	this.nombre = nombre;
	this.fecha = fecha;
	this.cantidad = cantidad;
	this.precioUnitario = precioUnitario;
	this.subtotal = subtotal;
}


public FacturaDto() {
	
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public Integer getCantidad() {
	return cantidad;
}
public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}
public BigDecimal getPrecioUnitario() {
	return precioUnitario;
}
public void setPrecioUnitario(BigDecimal precioUnitario) {
	this.precioUnitario = precioUnitario;
}
public BigDecimal getSubtotal() {
	return subtotal;
}
public void setSubtotal(BigDecimal subtotal) {
	this.subtotal = subtotal;
}
@Override
public String toString() {
	return "FacturaDto [nombre=" + nombre + ", fecha=" + fecha + ", cantidad=" + cantidad + ", precioUnitario="
			+ precioUnitario + ", subtotal=" + subtotal + "]";
}

}
