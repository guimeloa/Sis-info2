import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String _name;
    private Vector _rentals = new Vector();
    
    public Customer (String name) {
        _name = name;
    }
    
    public void addRental( Rental arg) {
        _rentals.addElement(arg);
    }
    public Vector getRental(){
        return  _rentals;
    }
    public String getName (){
        return _name;
    }
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0; 
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements() ) {
            Rental aRental = (Rental) rentals.nextElement();
            //determine amounts for aRental line
            //totalAmount = amountFor(aRental);
            // add freqñññ
            //infornsticsinformática 

            frequentRenterPoints += aRental.getFrequentRenterPoints();            
            //show figures for this rental
            result += "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getCharge()) + "\n";
            totalAmount += aRental.getCharge();
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) +"\n";
        
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        System.out.println(result);
        return result;
    }
}