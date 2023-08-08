package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.dto.FacturaDto;

public interface IFacturaRepo {

	public void ingresar(Factura factura);
	public List<FacturaDto> encontrarPorFecha(LocalDate fecha,String categoria,Integer cantidad);
	
}
