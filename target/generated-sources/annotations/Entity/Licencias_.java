package Entity;

import Entity.Clientes;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-03T09:23:18")
@StaticMetamodel(Licencias.class)
public class Licencias_ { 

    public static volatile SingularAttribute<Licencias, Integer> idLicencia;
    public static volatile ListAttribute<Licencias, Clientes> clientesList;
    public static volatile SingularAttribute<Licencias, String> nombre;

}