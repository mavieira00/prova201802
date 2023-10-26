package prova201802;

import java.util.List;

public class Utils {
	public static boolean existe(List<Object> x, Biscoito y) {
		if(x.contains(y)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
