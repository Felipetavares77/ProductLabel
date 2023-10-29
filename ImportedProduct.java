package Entities;

public class ImportedProduct extends Product {
	
	private double customsFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String nameProduct, double priceProduct, double taxProduct) {
		super(nameProduct, priceProduct);
		this.customsFee = taxProduct;
	}

	public double getTaxProduct() {
		return customsFee;
	}

	public void setTaxProduct(double taxProduct) {
		this.customsFee = taxProduct;
	}
	
	public double totalPrice() {
		return customsFee + priceProduct;
	}

	@Override
	public String priceTag() {
		return "Product: " + super.getNameProduct() + "\nPrice: " + totalPrice();
	}
	
	
}
