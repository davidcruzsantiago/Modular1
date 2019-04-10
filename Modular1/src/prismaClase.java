public class prismaClase {
    /**
     * INICIALIZACION DE LAS VARIABLES
     */
    int baseTriangulo;
    int alturaPrisma;

    /**
     *CONSTRUCTOR
     */
    prismaClase(int baseTriangulo, int alturaPrisma){
        this.baseTriangulo=baseTriangulo;
        this.alturaPrisma=alturaPrisma;
    }

    /**
     *METODOS
     */
        public double areaTotal(int alturaPrisma,int baseTriangulo) {
        double areabase=areaBase(baseTriangulo),arealateral=areaLateral(baseTriangulo,alturaPrisma);
        double Areatotal=2* areabase + arealateral;
        return Areatotal;
    }

    public static double areaLateral(int basetriangulo, int alturaprisma) {
        double perim = perimetro(basetriangulo);
        double Arealateral= perim*alturaprisma;

        return Arealateral;
    }

    public static double perimetro(int basetriangulo) {
        double perim=3*basetriangulo;

        return perim;
    }

    public static double areaBase(int basetriangulo) {
        double htrin = alturaTriangulo(basetriangulo);
        double Areabase=basetriangulo*htrin/2;

        return Areabase;
    }

    public static double alturaTriangulo(int basetriangulo) {
        double htrin=Math.sqrt(3)*basetriangulo/2;

        return htrin;
    }

    public static void ImrpimirValor(double basetriangulo, String s) {
        System.out.println(s + basetriangulo);
    }

    /**
     *GETTERS AND SETTERS
     */
    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public int getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }





}
