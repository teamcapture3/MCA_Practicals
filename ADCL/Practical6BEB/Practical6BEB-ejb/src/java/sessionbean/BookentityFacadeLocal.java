/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean;

import entities.Bookentity;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ninad
 */
@Local
public interface BookentityFacadeLocal {

    void create(Bookentity bookentity);

    void edit(Bookentity bookentity);

    void remove(Bookentity bookentity);

    Bookentity find(Object id);

    List<Bookentity> findAll();

    List<Bookentity> findRange(int[] range);

    int count();

    public boolean insertBookentity(int id, String name, String subject, int price);
    
}
