package Entity;

import Entity.Partes;
import Entity.Vehiculos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-03T09:23:18")
@StaticMetamodel(Reparaciones.class)
public class Reparaciones_ { 

    public static volatile SingularAttribute<Reparaciones, String> descripcion;
    public static volatile SingularAttribute<Reparaciones, String> fechaIngreso;
    public static volatile SingularAttribute<Reparaciones, Vehiculos> idVehiculo;
    public static volatile SingularAttribute<Reparaciones, Integer> idReparacion;
    public static volatile SingularAttribute<Reparaciones, Partes> idParte;

}