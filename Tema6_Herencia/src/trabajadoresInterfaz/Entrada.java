package trabajadoresInterfaz;

public class Entrada {
    public static void main(String[] args) {

        Asalariado asalariado = new Asalariado("Iker", "Elorduy", "12345678p",1000, Departamento.Ventas, 14);
        Autonomo autonomo = new Autonomo("Miryam", "Fernandez", "98765432q", 5000, Departamento.Comercial, 250);
        Jefe jefe = new Jefe("Belen", "Manzano", "19283746t", 2500, Departamento.IT, 10);
        Directivo directivo = new Directivo("Andrea", "Perez", "91827364b", 10000);
        Accionista accionista = new Accionista("Igor", "Sanchez", "56473829z", 5);

        Empresa empresa = new Empresa("Gayca", 50000);
        empresa.addPersona(asalariado);
        empresa.addPersona(autonomo);
        empresa.addPersona(jefe);
        empresa.addPersona(directivo);
        empresa.addPersona(accionista);
        empresa.addPersona(new Asalariado("Miguel", "Alonso", "21324354j", 1000, Departamento.IT, 14));

        empresa.listarPersonas();
        empresa.registrarVotacion((Comision) empresa.getListaPersona().get(2));
        System.out.println("Los votos registrados son: " + empresa.getVotos());

        empresa.repartirBeneficios();



    }//fin de main
}//fin de clase
