
public class BankaMusterileriManager {
        
		public void maasCekme(BankaMusterileri bankaMusterileri) {
        	   System.out.println("contructor1 çağırıldı!");
        	   System.out.println(bankaMusterileri.salary+" TL Maaş "+bankaMusterileri.name+" tarafından çekildi!");
        	   
        	   
           }
		public void paraCekme(BankaMusterileri bankaMusterileri) {
			System.out.println("constructor2çağırıldı!");
			System.out.println(bankaMusterileri.name2+" kişisi "+bankaMusterileri.paraCekme+ " TL para çekti.");
		}
           
}
