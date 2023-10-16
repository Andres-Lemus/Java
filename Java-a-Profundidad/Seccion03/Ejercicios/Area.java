class Area {
    public static void main(String args[]){
        double lado = 5.5;
        double cuadrado = lado*lado;
        double base = 4, altura = 2.5;
        System.out.println("Area del cuadrado: " + cuadrado);
        double triangulo = (base * altura) / 2;
        System.out.println("Area del triangulo: " + triangulo);
        double radio = 8;
        double circulo = Math.PI * Math.pow(radio, 2);
        System.out.println("Area del circulo: " + circulo);
    }
}
