package support_classes;


import java.util.Arrays;
import java.util.List;


public class TraderTransactTestData {
	 
        static Trader raoul = new Trader("Raoul", "Berkeley");
        static Trader mario = new Trader("Mario","Milan");
        static Trader alan = new Trader("Alan","Cambridge");
        static Trader brian = new Trader("Brian","Norwalk");
		
		static List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300), 
	            new Transaction(raoul, 2013, 1000),
	            new Transaction(raoul, 2011, 400),
	            new Transaction(mario, 2013, 710),	
	            new Transaction(mario, 2012, 700),
	            new Transaction(alan, 2013, 950),
	            new Transaction(mario, 2013, 1010),	
	            new Transaction(mario, 2012, 700),
	            new Transaction(alan, 2013, 650)
        );	
		
		public static List<Transaction> getTransactions() {
			return transactions;
		}
        
        
        
}
