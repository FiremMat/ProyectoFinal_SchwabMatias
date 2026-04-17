public class Desarrollador extends Empleado {
    private  String lenguajePrincipal;

    public Desarrollador(String nombre, int legajo, double salarioBase, String lenguajePrincipal) throws  SalarioInvalidoException {
        super(nombre, legajo, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal; //al ser un string, luego en main puedo agregar distintos lenguajes como lo hice en el ej
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }
@Override
    public String trabajar(){
        return "Desarrollando software en " + lenguajePrincipal;
}
@Override
    public double calcularSalario(){
        return getSalarioBase() * 1.30; // acá calculo el porcentaje que le corresponde al dev según la consigna
}

}
