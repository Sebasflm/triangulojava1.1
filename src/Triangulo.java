import java.util.Scanner;

public class Triangulo{
    public double x1;
    public double x2;
    public double x3;
    public double y1;
    public double y2;
    public double y3;
    public double bx;
    public double by;
    public double d1;
    public double d2;
    public double d3;
    public Triangulo (){

    }
    public Triangulo(int x1,int x2, int x3, int y1, int y2, int y3, double bx, double by, int d1, int d2, int d3){
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.y1=y1;
        this.y2=y2;
        this.y3=y3;
        this.bx=bx;
        this.by=by;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;

    }

public void ingresarCoordenadas(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la primera coordenada en (x)");
    this.x1 = sc.nextDouble();
    System.out.println("Ingrese la primera coordenada en (y)");
    this.y1 = sc.nextDouble();
    System.out.println("Ingrese la segunda coordenada en (x)");
    this.x2 = sc.nextDouble();
    System.out.println("Ingrese la segunda coordenada en (y)");
    this.y2 = sc.nextDouble();
    System.out.println("Ingrese la tercera coordenada en (x)");
    this.x3 = sc.nextDouble();
    System.out.println("Ingrese la tercera coordenada en (y)");
    this.y3 = sc.nextDouble();
    }
    public void calcularBaricentro(){
    bx=(x1+x2+x3)/3;
    by=(y1+y2+y3)/3;
    System.out.println("El baricentro del triangulo es: "+bx+","+by);
    }
    public void calcularDistancias(){
        d1= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        d2= Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        d3= Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        System.out.println("La primera distancia es: "+d1);
        System.out.println("La segunda distancia es: "+d2);
        System.out.println("La tercera distancia es: "+d3);
    }
}
