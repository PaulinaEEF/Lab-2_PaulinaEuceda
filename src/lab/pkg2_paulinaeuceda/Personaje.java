
package lab.pkg2_paulinaeuceda;


public class Personaje {
    private String clase;
    private String nombre;
    private String raza;
    private double estatura;
    private int peso;
    private int años;
    private String descripcion;
    private String nacionalidad;

    public Personaje() {
    }
    
    

    public Personaje(String clase, String nombre, String raza, double estatura, int peso, int años, String descripcion, String nacionalidad) {
        setClase(clase);
        this.nombre = nombre;
        setRaza(raza);
        this.estatura = estatura;
        this.peso = peso;
        this.años = años;
        this.descripcion = descripcion;
        setNacionalidad(nacionalidad);
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        if(clase.equals("clerigo") || clase.equals("barbaro") || clase.equals("mago") || clase.equals("picaro")){
            this.clase = clase;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if(raza.equals("mediano") || raza.equals("enano") || raza.equals("elfo") || raza.equals("humano")){
            this.raza = raza;
        }
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if(nacionalidad.equals("norfair") || nacionalidad.equals("brinstar") || nacionalidad.equals("maridia") || nacionalidad.equals("zebes") || nacionalidad.equals("crateria")){
            this.nacionalidad = nacionalidad;
            
        }
    }

    @Override
    public String toString() {
        return "" + "Clase = " + clase + ", Nombre = " + nombre + ", Raza = " + raza + ", Estatura = " + estatura + ", Peso = " + peso + ", A\u00f1os = " + años + ", Descripcion = " + descripcion + ", Nacionalidad = " + nacionalidad + '.';
    }
    
    
    
    
}
