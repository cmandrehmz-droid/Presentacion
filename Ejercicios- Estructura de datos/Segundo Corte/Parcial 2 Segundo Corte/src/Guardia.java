public class Guardia {
    String Nombre;
    String Sector;
    Guardia siguiente;
    Guardia anterior;

    public Guardia(String Nombre, String Sector){
        this.Nombre = Nombre;
        this.Sector = Sector;
        this.siguiente = null;
        this.anterior = null;
    }
}
