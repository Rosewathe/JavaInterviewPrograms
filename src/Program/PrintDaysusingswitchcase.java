package Program;

public class PrintDaysusingswitchcase {

	
		// TODO Auto-generated method stub
		public enum day { s , m , t , w , th, fr, sa };
		public static void main(String args[]){
		day[] c = day.values();
		 for(day today : c)
		{
		  switch (today){
		 case s :
		        System.out.println("Sunday");
		        break;
		case m:
		        System.out.println("Monday");
		        break;
		case t:
		        System.out.println("Tuesday");
		        break;
		case w:
		        System.out.println("Wednesday");
		        break;
		case th:
		        System.out.println("Thursday");
		        break;
		case fr:
		        System.out.println("Friday");
		        break;
		case sa:
		        System.out.println("Saturday");
		        break;
		     }
		  }
	
	}

}
