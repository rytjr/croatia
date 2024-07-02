package coratia;

import java.util.*;

public class coratia {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int sum = 0;
		
		String[] alp = {"c=" , "c-", "d-", "lj", "nj", "s=", "z=", "dz="};
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < alp.length; j++) {
                int sd = alp[j].length()-1;
                if(i+sd < str.length()) {
                	if(alp[j].charAt(0) == str.charAt(i)) {
                		if(alp[j].length()==3) {
                			if(alp[j].charAt(1) == str.charAt(i+1)) {
                				if(alp[j].charAt(0+sd) == str.charAt(i+sd)) {
                        			i = i+sd;
                        		}
                			}
                		}
                		else {
                			if(alp[j].charAt(0+sd) == str.charAt(i+sd)) {
                    			i = i+sd;
                    		}
                		}
                		
                	}
                }
			}
			++sum;
		}
		System.out.print(sum);
			
	}
}