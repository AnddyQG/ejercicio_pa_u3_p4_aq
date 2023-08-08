package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.repository.modelo.dto.ProductoDto;
import com.example.demo.service.IFacturaService;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class EjercicioPaU3P4AqApplication implements CommandLineRunner{

	private static final Logger LOG = LoggerFactory.getLogger(EjercicioPaU3P4AqApplication.class);
	
	@Autowired
	private IProductoService iProductoService;
	@Autowired
	private IFacturaService facturaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4AqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		// TODO Auto-generated method stub
		Producto producto= new Producto();
		producto.setCategoria("Comida");
		producto.setCodigoDeBarras("122");
		producto.setNombre("Atun");
		producto.setPrecio(new BigDecimal(2.50));
		producto.setStock(2);
		this.iProductoService.agregar(producto);
		
		Producto producto2= new Producto();
		producto2.setCategoria("Higiene");
		producto2.setCodigoDeBarras("133");
		producto2.setNombre("Jabon");
		producto2.setPrecio(new BigDecimal(1.50));
		producto2.setStock(2);
		this.iProductoService.agregar(producto2);
		
		List<ProductoDto>list= new ArrayList<>();
		ProductoDto dto= new ProductoDto();
		dto.setCantida(1);
		dto.setCodigoB("122");
		list.add(dto);
		ProductoDto dto2= new ProductoDto();
		dto2.setCantida(1);
		dto2.setCodigoB("133");
		list.add(dto2);
		this.facturaService.agregar(list, "1233");
		
	}

}
