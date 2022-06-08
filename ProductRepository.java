package assignment_1;
import java.util.*;

public class ProductRepository {
	private List<Product> pro;
	ProductRepository(){
		pro = new ArrayList<Product>();
		Product pr1 = new Product(101,"Maggi",500.00,"grocery");
		Product pr2 = new Product(102,"Sugar",200.00,"grocery");
		Product pr3 = new Product(103,"Tennis-racket",700.00,"sports");
		Product pr4 = new Product(104,"reebok-bat",10000.00,"sports");
		Product pr5 = new Product(105,"eye-shade-105",1000.00,"wearables");
		Product pr6 = new Product(106,"Pasta",300.00,"grocery");
		pro.add(pr1);
		pro.add(pr2);
		pro.add(pr3);
		pro.add(pr4);
		pro.add(pr5);
		pro.add(pr6);
	}
	public List<Product> getList(){
		return pro;
	}

}
