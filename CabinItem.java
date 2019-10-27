import java.util.ArrayList;
import java.util.List;

public class CabinItem {
	
	public List<Item> items;

	
	public void add(Item i) {
	      items.add(i);
	   }
	
	public void remove(Item i) {
		   items.remove(i);
	   }
	
	public List<Item> getItems(){
	     return items;
	   }
	

}
