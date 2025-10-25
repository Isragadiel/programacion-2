// archivo: ejercicio1/Demo.java
package ejercicio1;
import java.time.LocalDate;
public class Demo {
    public static void main(String[] args) {
        Pasaporte p = new Pasaporte("A1234567", LocalDate.of(2023,1,10), "foto.jpg", "jpg");
        Titular t = new Titular("Ana Perez", "12345678");
        p.setTitular(t); // vincula ambos lados
        System.out.println(p);
        System.out.println("Titular's pasaporte: " + t.getPasaporte());
    }
}