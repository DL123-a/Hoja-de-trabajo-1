public class Main {

    public static void main(String[] args) {

    
        Radio radio = new RadioReal();

        
        radio.prenderRadio();

        radio.cambiarFM();
        radio.avanzarEstacion();
        radio.avanzarEstacion();
        radio.guardarEstacion(0);

        radio.cambiarAM();
        radio.avanzarEstacion();
        radio.guardarEstacion(1);

        radio.cargarEstacion(0);
        radio.cargarEstacion(1);

        radio.apagarRadio();
    }
}
