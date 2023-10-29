package Entities;

public class Product {
	
	private String nameProduct;
	protected double priceProduct;
	
	public Product() {
		
	}

	public Product(String nameProduct, double priceProduct) {
		super();
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}

	public String priceTag() {
		return "Product: " + getNameProduct()  +"\nPrice: " + getPriceProduct();
	}
	
	
	
}
