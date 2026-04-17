/*

 */
public abstract class Empleado implements  Trabajador {
    private String nombre;
    private int legajo;
    private double salarioBase;

    private static final double SALARIO_MINIMO = 0; //constante
    private static final double SALARIO_MAXIMO = 1000000; //constante
    public Empleado(String nombre, int legajo, double salarioBase) throws SalarioInvalidoException {
        this.nombre = nombre; // nombre de nuestro empleado
        this.legajo = legajo; //legajo de nuestro empleados
        setSalarioBase(salarioBase);
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

    public void setSalarioBase(double salarioBase) throws SalarioInvalidoException {

        if (salarioBase < SALARIO_MINIMO) {
            throw new SalarioInvalidoException("El salario no puede ser menor a 0");
        }

        if (salarioBase > SALARIO_MAXIMO) {
            throw new SalarioInvalidoException("El salario no puede superar 1.000.000");
        }

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
