package recursos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hoy es "+ LocalDate.now());
        System.out.println("Es la hora "+ LocalTime.now());

        TarjetaDebito deb=new TarjetaDebito(1212,455,LocalDate.of(2028,05,18),2000.0);
        System.out.println("-----------------------------------------------");
        System.out.println(deb.validacionDeFechaDeExpiracion());
        System.out.println(deb.getSaldoDisponible());
        System.out.println(deb.procesadorDebito(deb,1500.0));
        System.out.println(deb.getSaldoDisponible());

    }
}
