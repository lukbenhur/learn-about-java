package javaJiraia.collections;

public class Smartphone {
	private String serialNumber;
	private String model;

	public Smartphone(String serialNumber, String model) {
		this.serialNumber = serialNumber;
		this.model = model;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if (obj instanceof Smartphone) {
			Smartphone v = (Smartphone) obj;
			return this.serialNumber != null && this.serialNumber.equals(v.serialNumber) 
					&& this.model != null && this.model.equalsIgnoreCase(v.model); 
		}else return false;

	}

}
