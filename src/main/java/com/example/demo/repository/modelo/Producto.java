package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "producto")
public class Producto {

	@SequenceGenerator(name = "seq_producto", sequenceName = "seq_producto", allocationSize = 1)
	@GeneratedValue(generator = "seq_producto", strategy = GenerationType.SEQUENCE)

	@Id
	@Column(name = "prod_id")
	private Integer id;
	@Column(name = "prod_codigo_barras")
	private String codigoDeBarras;
	@Column(name = "prod_nombre")
	private String nombre;
	@Column(name = "prod_categoria")
	private String categoria;
	@Column(name = "prod_stock")
	private Integer stock;
	@Column(name = "prod_precio")
	private BigDecimal precio;
	
	@OneToMany(mappedBy = "producto")
	private List<DetalleFactura>detalleFacturas;
	
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigoDeBarras=" + codigoDeBarras + ", nombre=" + nombre + ", categoria="
				+ categoria + ", stock=" + stock + ", precio=" + precio + "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}


	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public BigDecimal getPrecio() {
		return precio;
	}


	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	public List<DetalleFactura> getDetalleFacturas() {
		return detalleFacturas;
	}


	public void setDetalleFacturas(List<DetalleFactura> detalleFacturas) {
		this.detalleFacturas = detalleFacturas;
	}
	
	
	
}
