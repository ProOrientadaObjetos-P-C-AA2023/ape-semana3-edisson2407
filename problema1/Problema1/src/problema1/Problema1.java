
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
    
}

public class Problema1 {

    public static void main(String[] args) {
        
        Terreno t1 = new Terreno();
        Terreno t2 = new Terreno(53.2, 76.3, 200.5);
        
        double anchoterreno = 32.5;
        double largoterreno = 40.0;
        double valormetrocuadrado = 100.2;
        
        t1.establecerAnchoTerreno(anchoterreno);
        t1.establecerLargoTerreno(largoterreno);
        t1.establecerValorMetroCuadrado(valormetrocuadrado);
        
        //calculos
        t1.calcularAreaTerreno();
        t1.calcularCostoTerreno();
        
        t2.calcularAreaTerreno();
        t2.calcularCostoTerreno();
        
        System.out.printf("\nTerreno1\n"+"Ancho de terreno: %.2f "
                +"\nLargo del terreno:%.2f "
                +"\nValor por metro cuadrado:%.2f "
                +"\nArea del terreno:%.2f "
                +"\nCosto del terreno:%.2f\n "
                , t1.obtenerAnchoTerreno()
                ,t1.obtenerLargoTerreno()
                ,t1.obtenerValorMetroCuadrado()
                ,t1.obtenerAreaTerreno()
                ,t1.obtenerCostoTerreno());
        
        
        System.out.printf("\nTerreno2\n"+"Ancho de terreno: %.2f "
                +"\nLargo del terreno:%.2f "
                +"\nValor por metro cuadrado:%.2f "
                +"\nArea del terreno:%.2f "
                +"\nCosto del terreno:%.2f "
                , t2.obtenerAnchoTerreno()
                ,t2.obtenerLargoTerreno()
                ,t2.obtenerValorMetroCuadrado()
                ,t2.obtenerAreaTerreno()
                ,t2.obtenerCostoTerreno());
        
        // TODO code application logic here
    }
    
}
