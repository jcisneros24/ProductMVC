package com.hiveit.pe.sf.app;

import com.hiveit.pe.sf.controller.ControllerProduct;
import com.hiveit.pe.sf.model.dao.xrootDAOImpl;
import com.hiveit.pe.sf.view.JFProductUpdate;

public class Run {

	public static void main(String[] args) {
		JFProductUpdate viewProduct = new JFProductUpdate();
		xrootDAOImpl modelProduct = new xrootDAOImpl();
		ControllerProduct controllerProduct = new ControllerProduct(viewProduct, modelProduct);
		viewProduct.setVisible(true);
		viewProduct.setLocationRelativeTo(null);

	}

}
