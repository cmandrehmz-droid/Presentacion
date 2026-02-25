public class ejercicio_8 {

    public static void main(String[] args) {
        String UltimoMensaje = "Hola";
        String CopiaTexto = UltimoMensaje;
        CopiaTexto = "¿Como estas?";

        System.out.println(CopiaTexto);
        System.out.println(UltimoMensaje);
    }
    //Los Strings no cambian nunca.
    //Cada vez que intentas modificarlos, Java crea uno nuevo.
    //Por eso, aunque dos variables apunten al mismo String al inicio,cuando modificas una, 
    // esta pasa a apuntar a un nuevo objeto y la otra sigue igual.
}
