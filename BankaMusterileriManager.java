
public class BankaMusterileriManager {
        
		public void maasCekme(BankaMusterileri bankaMusterileri) {
        	   System.out.println("contructor1 �a��r�ld�!");
        	   System.out.println(bankaMusterileri.salary+" TL Maa� "+bankaMusterileri.name+" taraf�ndan �ekildi!");
        	   
        	   
           }
		public void paraCekme(BankaMusterileri bankaMusterileri) {
			System.out.println("constructor2�a��r�ld�!");
			System.out.println(bankaMusterileri.name2+" ki�isi "+bankaMusterileri.paraCekme+ " TL para �ekti.");
		}
           
}
