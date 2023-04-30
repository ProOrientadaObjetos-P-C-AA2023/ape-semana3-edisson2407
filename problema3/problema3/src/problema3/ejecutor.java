package problema3;
public class ejecutor {
    public static void main(String[] args) {
        institucionesEducativas institucion1 = new institucionesEducativas();
        institucionesEducativas institucion2 = new institucionesEducativas("San Francisco", "Privada", 235, 39, 4, 19, 400.5);     
        String nombre_ = "Simon Bolivar";
        String tipo_ = "Publica";
        int numAlumnos = 500;
        int numDocentes = 300;
        int numSedes = 3;
        int numAulas = 40;
        double gastoEstudiante = 150.56;     
        institucion1.setNombre(nombre_);
        institucion1.setTipo(tipo_);
        institucion1.setNAlumnos(numAlumnos);
        institucion1.setNDocentes(numDocentes);
        institucion1.setNSedes(numSedes);
        institucion1.setNAulas(numAulas);
        institucion1.setGastosPorEstudiante(gastoEstudiante);
        //calculos ins 1
        institucion1.calcularPresupuesto();
        //fin calculo
        //calculo ins 2//
        institucion2.calcularPresupuesto();
        //fin calculo 
        //mostrar en pantalla//
        System.out.println(institucion1);
        System.out.println(institucion2);                
    }    
}
