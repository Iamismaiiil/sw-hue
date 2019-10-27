import java.util.ArrayList;
import java.util.List;

public class CabinLayout{
	
	public String name;
	public List<Equipment> equipments;
	public CabinItem CabinItem;
	
	
	public CabinLayout(String name, List<Equipment> equipments) {
		this.name = name;
		this.equipments = new ArrayList <Equipment>();
	}
	
	
	
}
