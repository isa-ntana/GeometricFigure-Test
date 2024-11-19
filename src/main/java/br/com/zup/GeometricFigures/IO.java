package br.com.zup.GeometricFigures;

import java.util.Scanner;

public class IO {
    public static void menu(){
        GeometricFigure figura = null;
        boolean execute = true;

        while (execute) {
            System.out.println("\n Primeiro digite os valores que utilizaremos! \n ");
            double base = scanner("Digite o valor da base: ").nextDouble();
            double altura = scanner("Digite o valor da altura: ").nextDouble();
            double raio = scanner("Digite o valor do raio: ").nextDouble();

            int opcao = scanner("Agora escolha a área de qual figura deseja calcular com esses valores: " +
                    "\n 1 - Triangulo" +
                    "\n 2 - Quadrado" +
                    "\n 3 - Retângulo" +
                    "\n 4 - Hexágono" +
                    "\n 5 - Círculo" +
                    "\n 0 - Sair").nextInt();
            if (opcao == 1) {
                figura = new Triangle();
            } else if (opcao == 2) {
                figura = new Square();
            } else if (opcao == 3) {
                figura = new Rectangle();
            } else if (opcao == 4) {
                figura = new Hexagon();
            } else if (opcao == 5) {
                figura = new Circle();
            } else if (opcao == 0) {
                execute = false;
            } else {
                throw new RuntimeException("Opção inválida, tente novamente.");
            }

            if (figura == null) throw new NullPointerException("Você não selecionou nenhuma figura.");
            calculateArea(base, altura, raio, figura);
        }
    }

    public static void calculateArea(double area, double altura, double raio, GeometricFigure figura){
        double resultado = figura.calcularArea(area, altura, raio);
        System.out.println("Resultado: " + resultado);
    }

    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
