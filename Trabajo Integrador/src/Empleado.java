/*

 */
public abstract class Empleado implements  Trabajador {
    private String nombre;
    private int legajo;
    private double salarioBase;

    private static final double SalarioMinimo = 0; //constante
    private static final double SalarioMaximo = 1000000; //constante
    public Empleado(String nombre, Integer legajo, Double salarioBase) {
        this.nombre = nombre; // nombre de nuestro empleado
        this.legajo = legajo; //legajo de nuestro empleados
        this.salarioBase = salarioBase; // salario de cada empleado
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public  void mostrarInformacion(){
        System.out.println("El nombre del empleado es " + getNombre());
        System.out.println("Su legajo es " + this.legajo);
        System.out.println("Su salario es: " + this.salarioBase);
    }

    //devuelve salario calculado segun tipo de empleado
    public abstract double calcularSalario();
}
