
public class homework {

	public static void main(String[] args) {
		BankaMusterileri bankaMusterileri=new BankaMusterileri("Ali",70,5000,"09/08/2021");
		BankaMusterileri bankaMusterileri2=new BankaMusterileri("Ela",75,6000,"12/08/2021");
		BankaMusterileri bankaMusterileriIslem=new BankaMusterileri("Ahmet",4000);
		
		BankaMusterileri[] BankaMusterileri= {bankaMusterileri,bankaMusterileri2};
		for (BankaMusterileri bankaMusterileri3 : BankaMusterileri) {
			System.out.println(bankaMusterileri3.name);
			System.out.println(bankaMusterileri3.age);
			System.out.println(bankaMusterileri3.salary);
			System.out.println(bankaMusterileri3.date);
			System.out.println("///////////////////////////////////");
			
		}
		BankaMusterileriManager bankaMusterileriManager=new BankaMusterileriManager();
		bankaMusterileriManager.maasCekme(bankaMusterileri);
		bankaMusterileriManager.maasCekme(bankaMusterileri2);
        bankaMusterileriManager.paraCekme(bankaMusterileriIslem);
		
		ParaYat�rma paraYat�rma=new ParaYat�rma();
		paraYat�rma.name="Engin";
		paraYat�rma.TLYat�r=9800;
		System.out.println(paraYat�rma.name+" "+paraYat�rma.TLYat�r+" TL para yat�rd�.");
		
		
	}

}
