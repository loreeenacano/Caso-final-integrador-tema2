package archetype-resources.src.gestion_habitat;

public class acuaticos extends habitat {
    boolean puede_nadar;

    public acuaticos(float temperatura,float humedad,boolean limpieza,boolean puede_nadar) {
        super(temperatura, humedad, limpieza);
        this.puede_nadar = puede_nadar;
    }


    @Override //se coloca delante de un metodo heredado para modificar su comportamiento original
        public String toString() {
        return "acuaticos []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }


    public boolean isPuede_nadar() {
        return puede_nadar;
    }


    public void setPuede_nadar(boolean puede_nadar) {
        this.puede_nadar = puede_nadar;
    }    
}
    

