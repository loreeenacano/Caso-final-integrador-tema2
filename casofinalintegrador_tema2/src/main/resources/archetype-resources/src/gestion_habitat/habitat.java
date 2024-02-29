package archetype-resources.src.gestion_habitat;
//añadir paquete que hemos creado
public class habitat {
    float temperatura;
    float humedad;
    boolean limpieza;

    public habitats (float temperatura, float humedad, boolean limpieza)
    {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }


@Override
public String toString(){
    return "habitat []";
}
}
