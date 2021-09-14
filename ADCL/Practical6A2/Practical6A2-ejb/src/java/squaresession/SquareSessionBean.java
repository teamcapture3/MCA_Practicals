/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package squaresession;

import javax.ejb.Stateful;

/**
 *
 * @author ninad
 */
@Stateful
public class SquareSessionBean implements SquareSessionBeanLocal {

    @Override
    public Double getSquare(double num) {
        return (num*num);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
