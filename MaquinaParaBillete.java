/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
  public class MaquinaParaBillete
{
    // The price of a ticket from this machine.
    private int precio;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
    
     * 0345 Modifica el constructor de la clase TicketMachine para que no reciba par�metros sino que el precio de los billetes sea siempre de 800.
     */
    public MaquinaParaBillete()
    {
        precio = 800;
        balance = 0;
        total = 0;
    }
    
    /**
     * 0345 nuevo constructor  que recibe un par�metro para fijar el precio.
     */
    public MaquinaParaBillete(int coste)
    {
        precio = coste;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int obtenerPrecio()
    {
          return precio;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int obtenerBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void introduzcaDinero(int cantidad)
    {
        balance = balance + cantidad;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void imprimirBillete()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + precio + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
    
    /**
     * retorna el total.
     */
    public int getTotal(){
        return total;
    }
    
    /**
     * mt para fijar un nuevo precio que se reciba por par�metro, (es un m�todo modificador).
     */
    public void ponerNuevoPrecio(int nuevoPrecio){
        precio = nuevoPrecio;
    }
    
    /**
     *0998 A�ade un m�todo llamado prompt a la clase TicketMachine que no devuelva nada y que no tenga par�metros. El m�todo debe imprimir por 
     *pantalla lo siguiente: Please, insert the correct amount of money.
     */
    public void rapido(){
        System.out.println("Porfavor, inserte la cantidad de dinero correcta.");
    }
    
    /**
     * 0998 A�ade un m�todo llamado showPrice a la clase TicketMachine que no devuelva nada y que no tenga par�metros. El m�todo debe imprimir por 
     * pantalla: The price of a ticket is XXX euros (teniendo en cuenta que en lugar de XXXdebe aparecer el precio de billete).
     */
    public void mostrarBillete(){
        System.out.println("El precio del billete es de " +precio+ " �.");
    }
}















