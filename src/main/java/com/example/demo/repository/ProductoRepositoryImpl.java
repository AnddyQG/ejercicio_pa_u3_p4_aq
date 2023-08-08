package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Transactional
@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	
	public Producto encontrarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		TypedQuery<Producto> query=this.entityManager.createQuery("SELECT e FROM Producto e WHERE e.codigoDeBarras = :datoCodigo",Producto.class);
		
		query.setParameter("datoCodigo", codigo);
		
		return query.getSingleResult();
	}

	@Override
	public int actualizarPorCodigoB(String codigoB, Integer stock) {
	
		Query query=this.entityManager.createQuery("UPDATE Producto e SET e.stock = :datoStock WHERE e.codigoDeBarras = :datoCodigoB");
		query.setParameter("datoStock", stock);
query.setParameter("datoCodigoB", codigoB);
return query.executeUpdate();
	}



}
