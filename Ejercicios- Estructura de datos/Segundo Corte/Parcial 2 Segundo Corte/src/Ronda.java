public class Ronda {
    Guardia cabeza;
    Guardia cola;
    Guardia actual;

    public Ronda(){
        this.cabeza = null;
        this.cola = null;
        this.actual = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarGuardia(String Nombre, String Sector) {
        Guardia nuevo = new Guardia(Nombre, Sector);

        if (cabeza == null) {
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
            cabeza = nuevo;
            cola = nuevo;
            actual = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cola = nuevo;
        }
    }

    public void siguiente() {
        if (actual != null) {
            actual = actual.siguiente;
        }
    }

    public void anterior() {
        if (actual != null) {
            actual = actual.anterior;
        }
    }

    public void mostrarRondaCompleta() {
        if (estaVacia()) {
            System.out.println("No hay Guardias en la Ronda.");
            return;
        }

        Guardia temp = cabeza;
        int i = 1;

        do {
            String marcaActual = (temp == actual) ? "[▶] " : "    ";

            System.out.println(i + ". " + marcaActual + temp.Nombre +
            temp.Sector);

            temp = temp.siguiente;
            i++;
        } while (temp != cabeza);
    }
}
