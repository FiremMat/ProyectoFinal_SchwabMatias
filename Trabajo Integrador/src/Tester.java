public class Tester extends Empleado{
    private  String tester; /* tester puede ser auto  o manual*/


    public Tester(String nombre, Integer legajo, double salarioBase, String tester) throws SalarioInvalidoException {
        super(nombre, legajo, salarioBase);
        this.tester = tester;
    }

    public String getTester() {
        return tester;
    }

    public void setTester(String tester) {
        this.tester = tester;
    }

    @Override
    public  String trabajar(){

        return "Realizando testing de tipo  " + tester; //al igual que el dev, acá puedo agregar los tipos de tester
 }
 @Override
    public  double calcularSalario(){
        if(tester.equalsIgnoreCase("Automatizado")){ //en
            return getSalarioBase() * 1.25;
        }
        else {
            return getSalarioBase() * 1.15;
        }
 }


}
