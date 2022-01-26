import java.util.ArrayList;
import java.util.Iterator;

public class Army {
	ArrayList<Regiment> army;
	
	Army(){
		army = new ArrayList<Regiment>(20);
	}
	
	public void addRegiment(Regiment r){
		army.add(r);
	}
	
	public void updateList(int index, int men){
		Regiment temp = army.get(index);
		temp.addStrength(men);
	}
	
	public void printReport(int week){
		int biggest = findBiggest();
		Iterator<Regiment> iterator = army.listIterator();
		System.out.printf("Week Number %d\n%-7s%-20s%-15s\n", week,"Reg #", "Name", "Strength");
		while(iterator.hasNext()){
			Regiment temp = iterator.next();
			System.out.printf("%-7d%-20s%-15d", temp.getRegnum(), temp.getName(), temp.getStrength());
			if(biggest == temp.getRegnum()-1){
				temp.deploy();
				System.out.println("\tDeployed this week");
			} else {
				System.out.print("\n");
			}
		}
		System.out.println();
	}
	
	public int findBiggest(){
		int num = 0;
		int biggest = 0;
		for(int i = 0; i < army.size(); i++){
			if(army.get(i).getStrength() > num){
				num = army.get(i).getStrength();
				biggest = i;
			}
		}
		return biggest;
	}
	
	public void addStrength(){
		for(Regiment r : army){
			if(r.getRegnum() == 5){
				r.addStrength(30);
			} else {
				r.addStrength(100);
			}
		}
	}
}