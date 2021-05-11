package Lista4;

public class Menor {
	
	public static Integer Min3(Integer x, Integer y, Integer z) {
		
		if (x<y) {
			if (x<z)
				return x;
			else 
				return z;
		} else
			if (y<z)
				return y;
			else 
				return z;
		
	}
	
public static Double Min3(Double x, Double y, Double z) {
		
		if (x<y) {
			if (x<z)
				return x;
			else 
				return z;
		} else
			if (y<z)
				return y;
			else 
				return z;
		
	}

}

