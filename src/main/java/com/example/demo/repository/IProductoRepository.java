package com.example.demo.repository;

import com.example.demo.repository.modelo.Producto;

public interface IProductoRepository {

	public void insertar(Producto producto);
	public Producto encontrarPorCodigo(String codigo);
	public int actualizarPorCodigoB(String codigoB, Integer stock);



}
