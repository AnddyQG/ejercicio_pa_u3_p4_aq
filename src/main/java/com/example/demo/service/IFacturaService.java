package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.repository.modelo.dto.ProductoDto;

public interface IFacturaService {
public void agregar(List<ProductoDto>productos,String cedula);

}
