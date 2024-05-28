import java.lang.Math;

class Figura {
    String color;
    
    public Figura(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public double perimetro() {
        return 0.0;
    }
    
    public double area() {
        return 0.0;
    }
}

class Triangulo extends Figura {
    double lado1, lado2, lado3;
    
    public Triangulo(String color, double lado1, double lado2, double lado3) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }
    
    @Override
    public double area() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}

class Circulo extends Figura {
    double radio;
    
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    double altura, base;
    
    public Rectangulo(String color, double altura, double base) {
        super(color);
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public double perimetro() {
        return 2 * (altura + base);
    }
    
    @Override
    public double area() {
        return altura * base;
    }
}

class Hexagono extends Figura {
    double lado;
    
    public Hexagono(String color, double lado) {
        super(color);
        this.lado = lado;
    }
    
    @Override
    public double perimetro() {
        return 6 * lado;
    }
    
    @Override
    public double area() {
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Figura tri = new Triangulo("rojo", 3, 4, 5);
        Figura cir = new Circulo("azul", 7);
        Figura rec = new Rectangulo("verde", 6, 8);
        Figura hex = new Hexagono("amarillo", 5);
        
        Figura[] figuras = {tri, cir, rec, hex};
        
        for (Figura fig : figuras) {
            System.out.println("Color: " + fig.getColor());
            System.out.println("Perímetro: " + fig.perimetro());
            System.out.println("Área: " + fig.area());
            System.out.println();
        }
    }
}

