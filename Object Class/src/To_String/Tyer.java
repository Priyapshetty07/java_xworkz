package To_String;

public class Tyer {
	String brand;
	String type;
	int size;
	double price;
	
	Tyer(String brand,String type, int size, double price)
	{
		this.brand=brand;
		this.type=type;
		this.size=size;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Tyer [brand=" + brand + ", type=" + type + ", size=" + size + ", price=" + price + "]";
	}
	

}
