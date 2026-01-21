import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;
public class Pruebas {
    // PRUEBA 1: Avanzar estación en FM
    @Test
    public void testAvanzarEstacionFM() {
        RadioReal radio = new RadioReal();

        radio.avanzarEstacion();

        assertEquals(88.1, radio.contFm, 0.001);
    }

    @Test
    public void testAvanzarEstacionAM() {
        RadioReal radio = new RadioReal();

        radio.cambiarAM(); 
        radio.avanzarEstacion();

        assertEquals(540, radio.contAm, 0.001);
    }

    // PRUEBA 3: Guardar y cargar estación
    @Test
    public void testGuardarYCargarEstacionFM() {
        RadioReal radio = new RadioReal();

        radio.avanzarEstacion();
        radio.guardarEstacion(0);

        radio.avanzarEstacion(); 

        radio.cargarEstacion(0);

        assertEquals(88.1, radio.contFm, 0.001);
        assertFalse(radio.frecuencia); 
    }
    
}
