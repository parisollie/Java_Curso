public class Regiment {
	private int regnum; //Regiment Number
	private String name; 
	private int strength; //number of men
	
	Regiment(int r, String s, int str){
		regnum = r;
		name = s;
		strength = str;
	}
	
	void addStrength(int men){
		strength += men;
	}

	public int getRegnum() {
		return regnum;
	}

	public String getName() {
		return name;
	}

	public int getStrength() {
		return strength;
	}
	
	public void deploy(){
		strength = 0;
	}
}