/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author ninad
 */
@Stateless
public class calcbean {
    private double a;
    private double b;
    private double s;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    
    public void setB(double b) {
        this.b = b;
    }
    
    public double getS() {
        return s;
    }
    
    public void setS(double s) {
        this.s = s;
    }
    
    public void addition() {
        s = a + b;
    }
    
    public void subtraction() {
        s = a - b;
    }

    public void multiplication() {
        s = a * b;
    }

    public void division() {
        s = a / b;
    }
    
    public void modulo() {
        s = a % b;
    }
}
