package compartor_caomparable;

import java.util.Comparator;

public class Age_comprator implements Comparator<Stundent> {

	@Override
	public int compare(Stundent o1, Stundent o2) {
		
		if(o1.age==o2.age) {
			return 0;
		}
		if(o1.age<o2.age) {
			return 1;
		}else {
			return -1;
		}

	}

}
