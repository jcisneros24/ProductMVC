package com.hiveit.pe.sf.model.dao;

import java.sql.SQLException;

import com.hiveit.pe.sf.model.bean.ProductBean;

public interface xrootDAO {
	String updateProduct(ProductBean request) throws SQLException;
	String deleteProduct(ProductBean request) throws SQLException;
}
