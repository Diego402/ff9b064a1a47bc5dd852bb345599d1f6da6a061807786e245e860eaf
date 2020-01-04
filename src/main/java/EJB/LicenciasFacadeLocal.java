package EJB;
import Entity.Licencias;
import java.util.List;
import javax.ejb.Local;
/**
 *
 * @author azucena.rivasusam
 */
@Local
public interface LicenciasFacadeLocal {
    void create(Licencias licencias);
    void edit(Licencias licencias);
    void remove(Licencias licencias);
    Licencias find(Object id);
    List<Licencias> findAll();
    List<Licencias> findRange(int[] range);
    int count();
}