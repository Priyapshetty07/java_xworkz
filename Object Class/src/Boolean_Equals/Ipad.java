package Boolean_Equals;

import java.util.Objects;

public class Ipad {
      String name;
      String ram;
      double price;
      
      Ipad(String name, String ram, double price)
      {
    	  this.name=name;
    	  this.ram=ram;
    	  this.price=price;
    	  }

 /*@Override
	public int hashCode() {
		return Objects.hash(name, price, ram);
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ipad other = (Ipad) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(ram, other.ram);
	}
      }

