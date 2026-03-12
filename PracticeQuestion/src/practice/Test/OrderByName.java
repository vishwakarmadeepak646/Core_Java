package practice.Test;
import java.util.Comparator;

public class OrderByName implements Comparator<MarkSheet> {
	
	public int compare(MarkSheet o1, MarkSheet o2) {
		return o1.name.compareTo(o2.name);
	}

}
