
/**
 * Tarea 2
 * 
 * @author (Uziel Ticona Ledezma 
 * @version 20-04-2021
 */
public class Matematico{
    String numeros(int a, int b, int c){
        int mayor=0;
        int medio=0;
        int menor=0;
        if(a>b&& c<b){
            mayor=a;
            medio=b;
            menor=c;
        }
        if(b>a&&c<a){
            mayor=b;
            medio=a;
            menor=c;
        }
        if(c>a&&a<b){
            mayor=c;
            medio=b;
            menor=a;
        }
        if(a>b&&b<c){
            mayor=a;
            medio=c;
            menor=b;
        }
        if(b>c&&a<c){
            mayor=b;
            medio=c;
            menor=a;
        }
        if(c>a&&b<a){
            mayor=c;
            medio=a;
            menor=b;
        }
        return "el mayor es "+mayor+", el del medio es "+medio+", el menor es "+menor; 
    }
    
    double areaDelCuadrado(double base, double altura){
        double area=0;
        if(base==altura){
            area= Math.pow(base,2);
        }else{
            System.out.println("erro!!............la base y la altura deben ser ser el mismo ");
        } 
        return area;
    }
    
    double distanciaPuntos(double x1, double y1, double x2, double y2){
        double distancia=0;
        distancia= Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        return distancia;
    }
    
    String cuadrante(double x, double y){
        String res= "";
        if(x>0&&y>0){
            res= "PRIMER CUADRANTE";
        }
        if(x<0&&y>0){
            res= "SEGUNDO CUADRANTE";
        }
        if(x<0&&y<0){
            res= "TERCER CUADRANTE";
        }
        if(x>0&&y<0){
            res= "CUARTO CUADRANTE";
        }
        return res;
    }
}
