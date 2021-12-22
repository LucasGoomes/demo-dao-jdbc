package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	//retorna um department
	Seller findById(Integer id);
	//retorna uma lista de department
	List<Seller> findAll();
}
