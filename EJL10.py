import math

class Figura:
    def __init__(self, color):
        self.color = color
    
    def getColor(self):
        return self.color
    
    def perimetro(self):
        pass
    
    def area(self):
        pass

class Triangulo(Figura):
    def __init__(self, color, lado1, lado2, lado3):
        super().__init__(color)
        self.lado1 = lado1
        self.lado2 = lado2
        self.lado3 = lado3
    
    def perimetro(self):
        return self.lado1 + self.lado2 + self.lado3
    
    def area(self):
        s = (self.lado1 + self.lado2 + self.lado3) / 2
        return math.sqrt(s * (s - self.lado1) * (s - self.lado2) * (s - self.lado3))

class Circulo(Figura):
    def __init__(self, color, radio):
        super().__init__(color)
        self.radio = radio
    
    def perimetro(self):
        return 2 * math.pi * self.radio
    
    def area(self):
        return math.pi * self.radio ** 2

class Rectangulo(Figura):
    def __init__(self, color, altura, base):
        super().__init__(color)
        self.altura = altura
        self.base = base
    
    def perimetro(self):
        return 2 * (self.altura + self.base)
    
    def area(self):
        return self.altura * self.base

class Hexagono(Figura):
    def __init__(self, color, lado):
        super().__init__(color)
        self.lado = lado
    
    def perimetro(self):
        return 6 * self.lado
    
    def area(self):
        return (3 * math.sqrt(3) * self.lado ** 2) / 2


tri = Triangulo("rojo", 3, 4, 5)
cir = Circulo("azul", 7)
rec = Rectangulo("verde", 6, 8)
hex = Hexagono("amarillo", 5)

figures = [tri, cir, rec, hex]

for fig in figures:
    print(f"Color: {fig.getColor()}")
    print(f"Perímetro: {fig.perimetro()}")
    print(f"Área: {fig.area()}")
    print()


