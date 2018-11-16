package myMath;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

import myMath.Monom;
/**
 * This class represents a Polynom with add, multiply functionality, it also should support the following:
 * 1. Riemann's Integral: https://en.wikipedia.org/wiki/Riemann_integral
 * 2. Finding a numerical value between two values (currently support root only f(x)=0).
 * 3. Derivative
 * 
 * @author Boaz
 *
 */
public class Polynom implements Polynom_able{
    List<Monom> lmonoms = new ArrayList<>();
    Iterator<Monom> mIter;
    
    /**
    *  Adds two polynomials
    *  The method does not change the original polynomial.
    */
    @Override
    public void add(Polynom_able p1) { 
        Polynom_able pa = p1.copy();
        mIter=iteretor();
        while (this.mIter.hasNext()) {
            pa.add(this.mIter.next()); 
        }
    }

    /**
    *  Adds a new term into the polynomial, assuming that the polynomial
    *  is sorted in order from smallest to largest exponent.
    */
    @Override
    public void add(Monom m1) {
        lmonoms.add(m1);
        Comparator<Monom> powerComp = new Monom_Comperator();
        lmonoms.sort(powerComp);
    }

    @Override
    public void substract(Polynom_able p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
   *  Multiplies by a number
   *  The method does not change the original polynomial.
   */
    @Override
    public void multiply(Polynom_able p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Polynom_able p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isZero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double root(double x0, double x1, double eps) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Polynom_able copy() {
        Polynom_able pa = null;
        mIter=iteretor();
        while (this.mIter.hasNext()) {
            pa.add(this.mIter.next()); 
        }
        return pa;
    }

    /**
   *  Returns a new polynomial that is the derivative of this polynomial.
   */
    @Override
    public Polynom_able derivative() {
        Polynom_able pa = null;
        mIter=iteretor();
        while (this.mIter.hasNext()) {
            if(this.mIter.next().get_power()!= 0)
             try {
                 pa.add(new Monom( this.mIter.next().get_coefficient() * this.mIter.next().get_power(), this.mIter.next().get_power() - 1));
            } catch (Exception ex) {
                Logger.getLogger(Polynom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      return pa;
    }

    @Override
    public double area(double x0, double x1, double eps) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<Monom> iteretor() {
        mIter = lmonoms.iterator();
        return mIter;
    }

    @Override
    public double f(double x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	// ********** add your code below ***********
	
}
