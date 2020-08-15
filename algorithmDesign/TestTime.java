package algorithmDesign;
import java.util.Random;

public class TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len =10,d;
		
		Random r =new Random();
		String str1,str2;
		
		long start,end,totalTime=0;
		
		while(len<=100) {
			if((len==10)||(len==20)||(len==50)||len==100) {
				for(int i = 0; i<1000;i++) {
					str1 = "";
					str2 = "";
					for(int j=0;j<len;j++) {
						str1 += (char)('a'+r.nextInt(26));
						str2 += (char)('a'+r.nextInt(26));
					}
					
					start = System.nanoTime();
					d = Sequences.editDistance(str1, str2);
					end = System.nanoTime();
					
					//System.out.println("Distance between strings "+str1+" and "+str2+" : "+d);
					
					totalTime += (end-start);			
				}
				
				System.out.println("\n\nAverage time taken for len = "+len + ": "+ totalTime/1000);

			}
			len +=10;
		}
	}

}
