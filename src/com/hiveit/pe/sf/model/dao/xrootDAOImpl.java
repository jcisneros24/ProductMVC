package com.hiveit.pe.sf.model.dao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.hiveit.pe.sf.model.ConnectionDB;
import com.hiveit.pe.sf.model.bean.ProductBean; 
public class xrootDAOImpl implements xrootDAO {
	ConnectionDB cn;
	public xrootDAOImpl() {
		cn = new ConnectionDB();
	}

	@Override
	public String updateProduct(ProductBean request) throws SQLException {
		String response = null;
		Connection accessDB = null;
		CallableStatement cs = null;
		try {
			accessDB = cn.getConnection();
			cs = accessDB.prepareCall("call SP_UPDATE_ARTICULOS(?,?)");
			cs.setString(1, request.getReferenceOld());
			cs.setString(2, request.getReferenceNew());
			int numFafectadas = cs.executeUpdate();
			if(numFafectadas==0){
				response = "Actualizacion del producto exitosa";
			}
		} catch (SQLException e) {
			response = e.getMessage();
		}
		return response;
	}

	@Override
	public String deleteProduct(ProductBean request) {
		String response = null;
		Connection accessDB = null;
		CallableStatement cs = null;
		try {
			accessDB = cn.getConnection();
			accessDB.prepareCall("");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return response;
	}

}
