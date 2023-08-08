package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {
	
	@SequenceGenerator(name = "seq_defa", sequenceName = "seq_defa", allocationSize = 1)
	@GeneratedValue(generator = "seq_defa", strategy = GenerationType.SEQUENCE)

@Id
@Column(name = "defa_id")
private Integer id;
	
	@Column(name = "defa_cantidad")
	private Integer cantidad;
	@Column(name = "defa_precio_unitario")
	private BigDecimal precioUnitario;
	@Column(name = "defa_subtotal")
	private BigDecimal subtotal;
	
	@ManyToOne()
	@JoinColumn(name = "defa_id_factura")
	private Factura factura;
	
	@ManyToOne
	@JoinColumn(name = "defa_id_producto")
	private Producto producto;
	
	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ ", subtotal=" + subtotal + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	

	
	
	
	
}
