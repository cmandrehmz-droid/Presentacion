public class Navegador {
    Pestaña cabeza;
    Pestaña cola;

    public Navegador(){
        this.cabeza = null;
        this.cola = null;
    }

     public void abrirPestaña(Pestaña nueva) {

        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
    }

    
    public void mostrarPestañas() {

        Pestaña aux = cabeza;

        if (aux == null) {
            System.out.println("No hay pestañas abiertas.");
            return;
        }

        while (aux != null) {
            System.out.println(aux.tituloPagina + " | " + aux.url);
            aux = aux.siguiente;
        }
    }

    
    public void cerrarPestañaActual(String url) {

        Pestaña aux = cabeza;

        while (aux != null) {

            if (aux.url.equals(url)) {

                
                if (cabeza == cola) {
                    cabeza = null;
                    cola = null;
                }

                
                else if (aux == cabeza) {
                    cabeza = cabeza.siguiente;
                    cabeza.anterior = null;
                }

               
                else if (aux == cola) {
                    cola = cola.anterior;
                    cola.siguiente = null;
                }

                
                else {
                    aux.anterior.siguiente = aux.siguiente;
                    aux.siguiente.anterior = aux.anterior;
                }

                System.out.println("Pestaña cerrada: " + aux.tituloPagina);
                return;
            }

            aux = aux.siguiente;
        }

        System.out.println("No se encontró la URL.");
    }
}
