package Java_Programs;

public class removeDuplicateCharsInString {

	public static void main(String args[]) {
		
		String s = "H@@E@@L@@L@@O@ N@@I@@C@@@K@@S";
		
		String spl[] = s.split("");
		
		for(int i=0; i<spl.length; i++) {
			for(int j=i+1; j<spl.length; j++) {
				if(spl[i].equals(spl[j])) {
					spl[j]="";
				}
			}
			if(spl[i]!="")
			System.out.print(spl[i]+" ");
		}		
	}
}
