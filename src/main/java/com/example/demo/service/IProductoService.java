package com.example.demo.service;

import com.example.demo.repository.modelo.Producto;

public interface IProductoService {

	public void agregar(Producto producto);
	public Producto buscarPorCodigo(String codigo);
	public int actualizarPorCodigoB(String codigoB, Integer stock);


	
}
