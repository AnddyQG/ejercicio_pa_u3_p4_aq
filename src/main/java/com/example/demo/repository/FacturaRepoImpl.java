package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.dto.FacturaDto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Transactional
@Repository
public class FacturaRepoImpl implements IFacturaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	
	public void ingresar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
	}

	@Override
	public List<FacturaDto> encontrarPorFecha(LocalDate fecha, String categoria, Integer cantidad) {
		TypedQuery<FacturaDto> query= this.entityManager.createQuery("SELECT NEW com.example.demo.repository.modelo.dto.FacturaDto(p.nombre,p.fache,p.cantidad,p.precioUnitario,p.subtotal) FROM Factura p WHERE p.fecha =:datoFecha",FacturaDto.class);
		query.setParameter("datoFecha", fecha);
		return query.getResultList();
	}

}
