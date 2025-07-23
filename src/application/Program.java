package application;

import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.90));

		double factor = 1.1;

		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		list.forEach(System.out::println);
	}
}