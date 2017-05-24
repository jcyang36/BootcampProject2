import java.time.LocalDateTime;
public class bday{
	public static void main(String[] args){
		int bday=0;
		int bMonth=0;
		int bYear=0;
		LocalDateTime now=LocalDateTime.now();
		int currentDay=now.getDayOfMonth();
		int currentMonth=now.getMonthValue();
		int currentYear=now.getYear();
		int age=0;
		int ageTurning=0;
		char repeat='N';
		boolean flag=false;
		do{ 

			do{
				if (bYear!=(int)bYear){
					flag=true;
				}

				 do{ 
					if(bYear>currentYear){
						flag=true;
					}
					if (flag=true){
						System.out.println("Flag is true.");
					}
					else {System.out.println("Flag is false.");
					}
				}while(bYear>currentYear);
			}while(bYear!=(int)bYear  );
		}while(repeat=='Y');
	}
}
