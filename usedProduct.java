package Entities;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class usedProduct extends Product {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Date manufactureDate;
	
	
	
	public usedProduct() {
		
	}

	public usedProduct(String nameProduct, double priceProduct, Date manufactureDate) {
		super(nameProduct, priceProduct);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	
	@Override
	public String priceTag() {
		return "Product: " + super.getNameProduct() + "\nPrice: " + super.getPriceProduct() + "\nManufacture Date: " + getManufactureDate();
	}
	
}
