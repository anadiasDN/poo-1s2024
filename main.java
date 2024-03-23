package atividade1;

public class main {

    public static void main(String[] args) {
        
        calculadora calc = new calculadora();
        calc.numA = 2;
        calc.numB = 3;
        System.out.println("soma:" + calc.somar());
        System.out.println("subtração:" + calc.subtrair());
        System.out.println("multiplicação:" + calc.multiplicar());
        System.out.println("divisão:" + calc.dividir());
        System.out.println("0:" + calc.verificarNumeroPrimo(0));
        System.out.println("1:" + calc.verificarNumeroPrimo(1));
        System.out.println("2:" + calc.verificarNumeroPrimo(2));
        System.out.println("3:" + calc.verificarNumeroPrimo(3));
        System.out.println("7:" + calc.verificarNumeroPrimo(7));
        System.out.println("83:" + calc.verificarNumeroPrimo(83));
        System.out.println("100:" + calc.verificarNumeroPrimo(100));
        System.out.println("991:" + calc.verificarNumeroPrimo(991));
        System.out.println("104729:" + calc.verificarNumeroPrimo(104729));
        System.out.println("14348907:" + calc.verificarNumeroPrimo(14348907));
    }
    
}
