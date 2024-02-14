package app23_app24;

abstract class Poligono {
    double base;
    double altura;

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract double area();
}

class Triangulo extends Poligono {
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }
}

class Rectangulo extends Poligono {
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return base * altura;
    }
}
