package innerclasses;


 abstract class Car {
	   private String manufacturer;
	   public  abstract void start();
	   
	   
	   public abstract int getBattery();
	   public String getManufacturer() {
		return manufacturer;
	   }

	   public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	   }


	   
	   // Accessing he inner class from the method within



	   public static void main(String args[]) {
	      // Instantiating the outer class 
		   Car hybrid = new Car() {
			int batteryPower = 3000;
			@Override
			public void start() {
				this.batteryPower -= 100;
			
			}
			   
			@Override
			public int getBattery() {
				return this.batteryPower;
			}
		   };
		   hybrid.start();
		   System.out.println(hybrid.getBattery());
	   }
	}