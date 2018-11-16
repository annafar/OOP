
package myMath;
/**
 * This class represents a simple "Monom" of shape a*x^b, where a is a real number and a is an integer (summed a none negative), 
 * see: https://en.wikipedia.org/wiki/Monomial 
 * The class implements function and support simple operations as: construction, value at x, derivative, add and multiply. 
 * @author Boaz
 *
 */
public class Monom implements function{
	//****************** Constructions *****************
	public Monom(double a, int b) throws Exception{
		this.set_coefficient(a);
		this.set_power(b);
	}
	public Monom(Monom ot) throws Exception {
		this(ot.get_coefficient(), ot.get_power());
	}
	// ***************** add your code below **********************

        /**
	 * Method used to get the power.
	 * @return power
	 */
	public int get_power() {
		return this._power;
	}
        /**
         * _Method used to get the coefficient.
         * @return coefficient
         */
        public double get_coefficient() {
		return this._coefficient;
	}
        /**
         * This method represents a simple, shape function of "Monom" as a*x^b
         * @param x a real number
         * @return a simple function of type y=a*x^b
         */
        @Override
        public double f(double x) {
                return this._coefficient*Math.pow(x, this._power);

        }

	//****************** Private Methods and Data *****************
	/**
         * Method used to set the coefficient.
         * @param a - the coefficient
         */
	private void set_coefficient(double a){
		this._coefficient = a;
	}
        /**
         * Method used to set the power.
         * @param p - the power
         */
	private void set_power(int p) throws Exception {
            if(p<0)
                throw new Exception("Power have to be positive.");
            this._power = p;
	}
	
        
	private double _coefficient; //Coefficient field 
	private int _power;  //Power number field
}
   
