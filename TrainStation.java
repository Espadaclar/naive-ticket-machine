
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrainStation
{
	private MaquinaParaBillete machine1;
	private MaquinaParaBillete machine2;
	private int totalMoney;

	public TrainStation()
	{
		machine1 = new MaquinaParaBillete(300);
		machine2 = new MaquinaParaBillete(200);
		totalMoney = 0;
       }
  
        public void printTotalMoney()
	{
		totalMoney = machine1.getTotal();
		totalMoney = totalMoney + machine2.getTotal();
                System.out.println(totalMoney);
	}
}