package compartor_caomparable;

import java.util.Comparator;

public class role_comparter implements Comparator<Stundent>{
	@Override
	public int compare(Stundent o1, Stundent o2) {
		
		return o1.role.compareTo(o2.role);
	}

}
