public class Main {
    public static void main(String[] args) {

        try {
            // 1 -  acá creo los objetos o instancias, y agrego 2 lenguajes distintos e hice las pruebas con los 2 tipo de tester
            Trabajador dev = new Desarrollador("Juan", 1, 100000.00, "Java");
            Trabajador tester = new Tester("Ana", 2, 90000.00, "Manual");
            Trabajador tester2 = new Tester("Juana", 3, 90000.00, "Automatizado");
            Trabajador gerente = new Gerente("Luis", 4, 150000.00, 5);
            Trabajador dev2 = new Desarrollador("Pedro", 5, 100000.00, "C#");

            // 2 Array de tipo Trabajador (polimorfismo)
            Trabajador[] empleados = {dev, tester, tester2, gerente, dev2};

            // 3. Recorrer e invocar métodos
            for (Trabajador t : empleados) {       //sé que se usa la i por lo general, le metí T por trabajador, era para dejarlo como consulta
                System.out.println(t.trabajar());
                System.out.println("Salario: " + t.calcularSalario());

                // 4 Myestro información

                Empleado e = (Empleado) t;
                e.mostrarInformacion();

                System.out.println("-------------------"); // dejo una barra para separar a los tipos de trabajdres
                //me falta el punto 4 que no vimos aún
            }

        } catch (SalarioInvalidoException e) {
            System.out.println("Error: " + e.getMessage());

    }
}
}
