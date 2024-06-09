package Week06_FinalProject;

public class Card { //Card class
	
	//Fields
	private int value;
	private String name;
	
	//Create constructor
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	//Getter and Setters for Value
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	//Getter and Setter for Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Describe method
	public void describe() {
		System.out.println(name + " (" + value + ")") ;
	}
	
}
