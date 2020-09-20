

public class BusinessTest {
	public static void main(String[] args) {
		Address a1 = new Address(14, "14th ST", "San Jose", "56456", "California");
		Address a2 = new Address(15, "15th ST", "Mountain View", "66456", "California");
		Address a3 = new Address(16, "16th ST", "Fremont", "76456", "California");
		Address a4 = new Address(17, "17th ST", "San Francisco", "86456", "California");
		Address a5 = new Address(18, "18th ST", "San Ramen", "96456", "California");
		Address a6 = new Address(19, "19th ST", "San Carlos", "16456", "California");
		Address a7 = new Address(20, "20th ST", "San Luios", "26456", "California");
		Address a8 = new Address(21, "21th ST", "Santa Clara", "36456", "California");
		Address a9 = new Address(22, "22th ST", "San Mateo", "46456", "California");
		Address a10 = new Address(23, "23th ST", "Milpitas", "63456", "California");
		Address a11 = new Address(24, "24th ST", "Oakland", "44456", "California");
		Address a12 = new Address(25, "25th ST", "San Jose", "33356", "California");
		
		Executive ex1 = new Executive("Sara", "Williams", a1, 1, 12356.0, 2000.0 );
		ex1.setSSN("45652");
		ex1.introduce(true);
		Double pay = ex1.computePay();
		System.out.println("pay is " + pay);
		System.out.println();
		
		
		Executive ex2 = new Executive("Kara", "Williams", a2, 2, 12056.0, 2200.0 );
		ex2.setSSN("45653");
		ex2.introduce(true);
		Double pay1 = ex2.computePay();
		System.out.println("pay is " + pay1);
		System.out.println();
		
		FullTimeSalaried ex3 = new FullTimeSalaried("Lara", "Williams", a3, 20000.0 );
		ex3.setSSN("45654");
		ex3.introduce(true);
		Double pay2 = ex3.computePay(23);
		System.out.println("pay is " + pay2);
		System.out.println();
		
		FullTimeSalaried ex4 = new FullTimeSalaried("Mara", "Williams", a4, 30000.0 );
		ex4.setSSN("45655");
		ex4.introduce(true);
		Double pay3 = ex4.computePay(23);
		System.out.println("pay is " + pay3);
		System.out.println();
		
		FullTimeHourly ex5 = new FullTimeHourly("Para", "Williams", a5,3 , 60000.0, 3000.0 );
		ex5.setSSN("45657");
		ex5.introduce(true);
		Double pay4 = ex5.computePay(23);
		System.out.println("pay is " + pay4);
		System.out.println();
		
		FullTimeHourly ex6 = new FullTimeHourly("Aara", "Williams", a6,4 , 60000.0, 3000.0 );
		ex6.setSSN("45658");
		ex6.introduce(true);
		Double pay5 = ex6.computePay(23);
		System.out.println("pay is " + pay5);
		System.out.println();
		
		Customer ex7 = new Customer("Aranara", "Williams", a7,5);
		ex7.setSSN("45659");
		ex7.setPaymentPreference("online");
		ex7.introduce();
		ex7.makePayment();
		System.out.println();
		
		Customer ex8 = new Customer("Kiranara", "Williams", a8,6);
		ex8.setSSN("45752");
		ex8.setPaymentPreference("in store");
		ex8.introduce();
		ex8.makePayment();
		System.out.println();
		
		Contractor ex9 = new Contractor("Nilu", "Williams", a9, 700.0, 7, "784565");
		ex9.setSSN("35652");
		ex9.introduce(true);
		Double pay6 = ex9.computePay(23);
		System.out.println("pay is " + pay6);
		System.out.println();
		
		Contractor ex10 = new Contractor("Nilima", "Williams", a10, 600.0, 8, "4565456");
		ex10.setSSN("75652");
		ex10.introduce(true);
		Double pay7 = ex10.computePay(23);
		System.out.println("pay is " + pay7);
		System.out.println();
		
		PartTimeHourly ex11 = new PartTimeHourly("Sirish", "Williams", a11,44.0);
		ex11.setSSN("758992");
		ex11.introduce(true);
		Double pay8 = ex11.computePay(23);
		System.out.println("pay is " + pay8);
		System.out.println();
		
		PartTimeHourly ex12 = new PartTimeHourly("Arun", "Williams", a12,32.0 );
		ex12.setSSN("7565223");
		ex12.introduce(false);
		Double pay9 = ex12.computePay(23);
		System.out.println("pay is " + pay9);
		System.out.println();
		
	}
}
