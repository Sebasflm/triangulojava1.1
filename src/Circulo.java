public class Circulo {
    public Triangulo triangulo;
    public double radio;
    public double area;

    public Circulo(Triangulo triangulo) {
        this.triangulo=triangulo;
    }

    public void calculoradio(){
    radio=Math.sqrt(Math.pow(triangulo.bx- triangulo.x1,2)+Math.pow(triangulo.by- triangulo.y1,2));
    System.out.println("el radio es "+radio);
}

 public void calculoArea(){
    area= Math.pow(Math.PI*radio,2);
     System.out.println("el area del circulo circunscrito es "+area);
 }
}