
package problema4;


public class ejecutor {

  
    public static void main(String[] args) {
     equipoCelulares celular1 = new equipoCelulares("Android", 6.9, 999.99, 12,"00:1e:c2:9e:28:6b.", 383827272 );
     celular1.calcularIvaCostoInicial();
     celular1.calcularIvaCostoFinal();
        System.out.print(celular1);
    }
    
}
