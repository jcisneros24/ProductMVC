package com.hiveit.pe.sf.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.hiveit.pe.sf.model.bean.ProductBean;
import com.hiveit.pe.sf.model.dao.xrootDAOImpl;
import com.hiveit.pe.sf.view.JFProductUpdate;

public class ControllerProduct implements ActionListener {
	JFProductUpdate viewProduct = new JFProductUpdate();
	xrootDAOImpl modelProduct = new xrootDAOImpl();
	ProductBean request = new ProductBean();
	
	public ControllerProduct(JFProductUpdate viewProduct, xrootDAOImpl modelProduct){
		this.viewProduct = viewProduct;
		this.modelProduct = modelProduct;
		this.viewProduct.btnUpdate.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String rptaUpdate = null;
		try {

			if(e.getSource() == viewProduct.btnUpdate){
				if(validarcampos()==true){
					request.setReferenceOld(viewProduct.txtReferenceOld.getText());
					request.setReferenceNew(viewProduct.txtReferenceNew.getText());
					rptaUpdate = modelProduct.updateProduct(request);
					
					if(rptaUpdate != null){
						JOptionPane.showMessageDialog(null, rptaUpdate);
					}else{
						JOptionPane.showMessageDialog(null, "No se pudo actualizar el producto");
					}	
				}
			}					
		} catch (SQLException sqle) {		
			JOptionPane.showMessageDialog(null, "Error BD: " + rptaUpdate);
		}
		limpiarCasillas();
	    viewProduct.txtReferenceOld.requestFocus();
	}
    private void limpiarCasillas(){
        viewProduct.txtReferenceOld.setText("");
        viewProduct.txtReferenceNew.setText("");
    }
    private boolean validarcampos(){
    	boolean flag=true;
    	if(viewProduct.txtReferenceOld.getText().equals("") || viewProduct.txtReferenceNew.getText().equals("")){
    		JOptionPane.showMessageDialog(null, "Error en el flujo: " + "Ingresar valor en los campos");
    		viewProduct.txtReferenceOld.requestFocus();
    		flag=false;
    	}
    	return flag;
    }
}
