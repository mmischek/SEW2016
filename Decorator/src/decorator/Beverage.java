package decorator;

public abstract class Beverage {
	String description ="balbalaba";
	
	
	public String getDescription(){
		return description;
		
	}
	
	public abstract double cost();
	
}
