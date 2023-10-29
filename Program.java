package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.usedProduct;

public class Program {
	
public static void main(String[] args) throws ParseException{
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("How many Products will receive a price tag? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Product Name: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			System.out.println("1 - Local new Product");
			System.out.println("2 - Imported Product");
			System.out.println("3 - Local used Product");
			System.out.print("Choose the type of the pruduct " + i+1 + " by the correspondent number: ");
			int productType = sc.nextInt();
			if(productType == 1){
				Product prod = new Product(nameProduct, priceProduct);
				list.add(prod);
			}
			else if(productType == 2){
				System.out.print("Customs fee: ");
				double customsfee = sc.nextDouble();
				Product prod = new ImportedProduct(nameProduct, priceProduct, customsfee);
				list.add(prod);
			}
			else if(productType == 3){
				System.out.print("Manufacture date: ");
				Date manufactureDate = sdf.parse(sc.next());
				Product prod = new usedProduct(nameProduct, priceProduct, manufactureDate);
				list.add(prod);
			}
			else {
				System.out.println("Invalid option insert the product data again and choose the option 1, 2 or 3");
				i--;
			}	
			
		}
		System.out.println();
		System.out.println("PRODUCTS: ");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
			System.out.println();
		}
		sc.close();


}

}
