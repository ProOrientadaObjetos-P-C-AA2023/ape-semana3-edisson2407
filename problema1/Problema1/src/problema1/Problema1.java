package problema1;
class Terreno{
    private double costoTerreno;
    private double anchoTerreno;
    private double largoTerreno;
    private double areaTerreno;
    private double valorMetroCuadrado;    
    public Terreno(){}
    public Terreno(double anchoTerreno, double largoTerreno, double valorMetroCuadrado){
    this.anchoTerreno = anchoTerreno;
    this.largoTerreno = largoTerreno;
    this.valorMetroCuadrado = valorMetroCuadrado;
    }    
    public void establecerAnchoTerreno(double c){
        anchoTerreno = c;
    }    
    public void establecerLargoTerreno(double c){
        largoTerreno = c;
    }    
    public void establecerValorMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }    
    public double obtenerCostoTerreno(){
        return this.costoTerreno;
    }    
    public double obtenerAnchoTerreno(){
        return this.anchoTerreno;
    }    
    public double obtenerLargoTerreno(){
        return this.largoTerreno;
    }    
    public double obtenerAreaTerreno(){
        return this.areaTerreno;
    }    
    public double obtenerValorMetroCuadrado(){
        return this.valorMetroCuadrado;
    }    
    public void calcularAreaTerreno() {
    this.areaTerreno = anchoTerreno * largoTerreno;
    }    
    public void calcularCostoTerreno() {
    this.costoTerreno = areaTerreno * valorMetroCuadrado;
    } 
    public String toString(){
        return String.format("SU TERRENO CON LOS SIGUIENTES PARAMETROS:"
                +"\nAncho del terreno:%.2f"
                +"\nLargo del terreno:%.2f"
                +"\nValor por metro cuadrado:%.2f"
                +"\nArea del terreno:%.2f"
                +"\nCosto del terreno:%.2f"
                ,obtenerAnchoTerreno()
                ,obtenerLargoTerreno()
                ,obtenerValorMetroCuadrado()
                ,obtenerAreaTerreno()
                ,obtenerCostoTerreno());
    }
}
public class Problema1 {
    public static void main(String[] args) {        
        Terreno terreno1 = new Terreno(20.0,40.0,50.0);
        //
        terreno1.calcularAreaTerreno();
        terreno1.calcularCostoTerreno();
        System.out.println(terreno1);
        //
        Terreno terreno2 = new Terreno(53.2, 76.3, 200.5);        
        double anchoterreno = 32.5;
        double largoterreno = 40.0;
        double valormetrocuadrado = 100.2; 
        //enviar valores a terreno 1 con la variable "c" del set
        terreno1.establecerAnchoTerreno(anchoterreno);
        terreno1.establecerLargoTerreno(largoterreno);
        terreno1.establecerValorMetroCuadrado(valormetrocuadrado);        
        //calculos terreno 1 enviando valores variable c
        terreno1.calcularAreaTerreno();
        terreno1.calcularCostoTerreno(); 
        //calculos terreno2
        terreno2.calcularAreaTerreno();
        terreno2.calcularCostoTerreno();        
        System.out.printf("\nTerreno1\n"+"Ancho de terreno: %.2f "
                +"\nLargo del terreno:%.2f "
                +"\nValor por metro cuadrado:%.2f "
                +"\nArea del terreno:%.2f "
                +"\nCosto del terreno:%.2f\n "
                , terreno1.obtenerAnchoTerreno()
                ,terreno1.obtenerLargoTerreno()
                ,terreno1.obtenerValorMetroCuadrado()
                ,terreno1.obtenerAreaTerreno()
                ,terreno1.obtenerCostoTerreno());                
        System.out.printf("\nTerreno2\n"+"Ancho de terreno: %.2f "
                +"\nLargo del terreno:%.2f "
                +"\nValor por metro cuadrado:%.2f "
                +"\nArea del terreno:%.2f "
                +"\nCosto del terreno:%.2f "
                , terreno2.obtenerAnchoTerreno()
                ,terreno2.obtenerLargoTerreno()
                ,terreno2.obtenerValorMetroCuadrado()
                ,terreno2.obtenerAreaTerreno()
                ,terreno2.obtenerCostoTerreno());
    }
}
