package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepository iProductoRepository;
	
	@Override
	public void agregar(Producto producto) {
		// TODO Auto-generated method stub
		Producto productoE=this.iProductoRepository.encontrarPorCodigo(producto.getCodigoDeBarras());
		if(producto == null) {
			this.iProductoRepository.insertar(producto);
		}else {
			Integer nuevoStock= producto.getStock()+productoE.getStock();
			
			this.iProductoRepository.actualizarPorCodigoB(productoE.getCodigoDeBarras(), nuevoStock);
			
		}
		
		
	}

	@Override
	public Producto buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.encontrarPorCodigo(codigo);
	}

	@Override
	public int actualizarPorCodigoB(String codigoB, Integer stock) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.actualizarPorCodigoB(codigoB, stock);
	}

}
