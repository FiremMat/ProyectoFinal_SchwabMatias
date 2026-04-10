public class Gerente  extends  Empleado{
    private int empleadosACargo;

    public Gerente(String nombre, int legajo, double salarioBase, int empleadosACargo) {
        super(nombre, legajo, salarioBase);
        this.empleadosACargo = empleadosACargo;
    }

    public int getEmpleadosACargo() {
        return empleadosACargo;
    }

    public void setEmpleadosACargo(int empleadosACargo) {
        this.empleadosACargo = empleadosACargo;
    }

    @Override
    public String trabajar() {
        return "Gestionando equipo de " + empleadosACargo + " empleados";
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (5000 * empleadosACargo);
    }
}
