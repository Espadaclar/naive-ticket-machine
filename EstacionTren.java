
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstacionTren
{
	private MaquinaParaBillete maquina1;
	private MaquinaParaBillete maquina2;
	private int totalDinero;
	private int totalDosMaquinas; //almacena el total de las dos máquinas.

	public EstacionTren()
	{
		maquina1 = new MaquinaParaBillete(300);
		maquina2 = new MaquinaParaBillete(200);
		totalDinero = 0;
		totalDosMaquinas = 0;
       }
  
        public void imprimeTotalDinero()
	{
		totalDinero = maquina1.getTotal();
		totalDinero = totalDinero+ maquina2.getTotal();
                System.out.println(totalDinero);
	}
	
	 /**
     * retorna el total de las dos Máquinas.
     */
    public int obtenerTotal(){
        totalDosMaquinas = maquina1.getTotal() +maquina2.getTotal();
        return totalDosMaquinas;
    }
	
	/**
	 * mt que muestra la venta de dos billetes
	 */
	public void vendeADosMaquinas()
    {
       maquina1.introduzcaDinero(300); 
       maquina2.introduzcaDinero(200);
        maquina1.imprimirBillete();
        maquina2.imprimirBillete();
       
    }
}
















