package test;

import org.junit.jupiter.api.Test;
import recursos.TarjetaDebito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TarjetaDebitoTest {

    @Test
    public void tarjetaAutorizada(Double monto){
        TarjetaDebito tarjeta1=new TarjetaDebito(223344,699, LocalDate.of(2025,5,22),2000.0);
        if(tarjeta1.autorizacion(monto))
            System.out.println("Autorizacion valida");

        assertEquals(true,tarjeta1.autorizacion(monto));
        assertTrue(tarjeta1.autorizacion(monto));
    }

    @Test
    public void tarjetaRechazada(Double monto){
        TarjetaDebito tarjeta2=new TarjetaDebito(9988877,558,LocalDate.of(2026,6,29),1000.0);
        if(!tarjeta2.autorizacion(monto)){
            System.out.println("Tarjeta sin fondos suficientes.");
        }
        assertFalse(tarjeta2.autorizacion(monto));
    }

}