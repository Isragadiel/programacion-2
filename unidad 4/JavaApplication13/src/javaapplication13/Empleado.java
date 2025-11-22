package javaapplication13;

public class Empleado {

    // =========================
    // Atributos (encapsulados)
    // =========================
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;

    // =========================
    // Constructores
    // =========================

    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor que recibe solo nombre y puesto
    // id automático y salario por defecto (ej: 100000)
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1;   // id autoincremental
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100000; // salario por defecto

        totalEmpleados++;
    }

    // =========================
    // Métodos sobrecargados actualizarSalario
    // =========================

    // Aumento por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // Aumento fijo
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    // =========================
    // Getters y Setters
    // =========================

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }
    // =========================
    // Método estático
    // =========================
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    // =========================
    // Método toString()
    // =========================
    @Override
    public String toString() {
        return "Empleado {" +
                "ID=" + id +
                ", Nombre='" + nombre + '\'' +
                ", Puesto='" + puesto + '\'' +
                ", Salario=" + salario +
                '}';
    }
}
