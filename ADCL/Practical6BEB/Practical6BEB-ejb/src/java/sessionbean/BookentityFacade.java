/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean;

import entities.Bookentity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ninad
 */
@Stateless
public class BookentityFacade extends AbstractFacade<Bookentity> implements BookentityFacadeLocal {
    @PersistenceContext(unitName = "Practical6BEB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookentityFacade() {
        super(Bookentity.class);
    }

    @Override
        public boolean insertBookentity(int id, String name, String subject, int price) {
        try {
            Bookentity b = new Bookentity();
            b.setId(id);
            b.setName(name);
            b.setSubject(subject);
            b.setPrice(price);
            em.persist(b);
            return true;
        }
        catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }
}
