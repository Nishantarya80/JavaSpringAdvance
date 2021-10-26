package com.nishant.spring.springcoreadvance.standalone.colections;

import java.util.List;

public class productslist {
	private List<String> productname;

	@Override
	public String toString() {
		return "productslist [productname=" + productname + "]";
	}

	public List<String> getProductname() {
		return productname;
	}

	public void setProductname(List<String> productname) {
		this.productname = productname;
	}


}
