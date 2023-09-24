package compartor_caomparable;

import java.util.Comparator;

public class name_comprator implements Comparator<Stundent> {

	@Override
	public int compare(Stundent o1, Stundent o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
