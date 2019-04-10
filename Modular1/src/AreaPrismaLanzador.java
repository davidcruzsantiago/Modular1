import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ESTO ES EL LANZADOR
 */

public class AreaPrismaLanzador {
    /**
     * LISTAS PARA ALMACENAR VARIABLES
     */
    static List<prismaClase> lista= new ArrayList<>();
static List<Double> listaarea = new ArrayList<>();
    public static void main(String[] args) {
        prismaClase objeto;
        System.out.println("Programa para calcular el area de un prisma triangular.\n");

        /**
         * LECTURA DE VALORES
         */
        for (int i =0;i<3;i++) {
            int basetriangulo =(int) (Math.random()*10+1);
            System.out.println("valor de un lado de la base del prisma "+(i+1)+" : " + basetriangulo);
            int alturaprisma = (int) (Math.random()*10+1);
            System.out.println("altura del prisma "+(i+1)+" : " + alturaprisma+"\n");
            objeto = new prismaClase(basetriangulo, alturaprisma);
            lista.add(objeto);
            listaarea.add(objeto.areaTotal(alturaprisma,basetriangulo));
        }
        /**
         * ORDENACION E IMPRESION DE LAS LISTAS
         */
        int z=0;
        for (prismaClase l: lista) {
            z++;
            System.out.println("Creado objeto prisma "+z+" con:\n -Base: "+l.getBaseTriangulo()+"\n -Altura: "+l.getAlturaPrisma()+"\n -Area Total: "+l.areaTotal(l.getAlturaPrisma(),l.getBaseTriangulo())+"\n");
        }
        listaarea.sort(null);
        Collections.reverse(listaarea);
        int x=0;
        System.out.println("El orden de mayor a menor segun las areas de los primas es: ");
        for (double s: listaarea) {
            x++;

            System.out.println("El "+x+"º es: "+s);
        }
    }

}


