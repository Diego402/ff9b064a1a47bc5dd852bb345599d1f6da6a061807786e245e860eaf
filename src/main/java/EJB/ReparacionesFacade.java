package EJB;
import Entity.Reparaciones;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author azucena.rivasusam
 */
@Stateless
public class ReparacionesFacade extends AbstractFacade<Reparaciones> implements ReparacionesFacadeLocal {
    @PersistenceContext(unitName = "carros_PU")
    private EntityManager em;
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    public ReparacionesFacade() {
        super(Reparaciones.class);
    }
}