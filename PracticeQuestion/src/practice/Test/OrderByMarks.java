package practice.Test;
import java.util.Comparator;

public class OrderByMarks implements Comparator<MarkSheet>{

	public int compare(MarkSheet o1, MarkSheet o2) {
		return o1.marks - o2.marks;
	}
}
