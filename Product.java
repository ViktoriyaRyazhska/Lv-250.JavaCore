import javax.imageio.ImageTypeSpecifier;

import org.junit.experimental.theories.Theories;

public class Product {
	String name;
	int price;
	int quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void changeName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
