package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IDetalleFactura;
import com.example.demo.repository.IFacturaRepo;
import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.DetalleFactura;
import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.Producto;
import com.example.demo.repository.modelo.dto.ProductoDto;
@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired 
	private IFacturaRepo facturaRepo;
	@Autowired
	private IProductoRepository iProductoRepository;
	
	@Autowired
	private IDetalleFactura detalleFactura;
	
	@Override
	public void agregar(List<ProductoDto> productos, String cedula) {
		// TODO Auto-generated method stub
		productos.forEach(a->{
		Producto producto=	this.iProductoRepository.encontrarPorCodigo(a.getCodigoB());
			Factura factura= new Factura();
			factura.setCedulaCliente(cedula);
			factura.setFecha(LocalDate.now());
			factura.setTotalFactura(producto.getPrecio().multiply(new BigDecimal(a.getCantida())));
			
			
			if(producto.getStock().compareTo(a.getCantida())<=0) {
				System.out.println("No se puede realizar la factura");
			}else {
				
				DetalleFactura detalleFactura = new DetalleFactura();
				detalleFactura.setCantidad(a.getCantida());
				detalleFactura.setFactura(factura);
				detalleFactura.setPrecioUnitario(producto.getPrecio());
				detalleFactura.setProducto(producto);
				detalleFactura.setSubtotal(producto.getPrecio().multiply(new BigDecimal(a.getCantida())));
				
				this.facturaRepo.ingresar(factura);
				this.detalleFactura.insertar(detalleFactura);
			}
			
		});
		
		
		
		
		
	}

}
