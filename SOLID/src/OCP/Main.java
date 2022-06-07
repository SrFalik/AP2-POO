    package OCP;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b;
        label:
        do {
            System.out.println("DIGITE DOIS NÚMEROS:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println("ESCOLHA UMA OPERAÇÃO");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("DIGITE QUALQUER OUTRO NÚMERO PARA FINALIZAR O PROGRAMA");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    Soma soma = new Soma(a, b);
                    System.out.println(soma.Somar());
                    break;
                case 2:
                    Subtracao sub = new Subtracao(a, b);
                    System.out.println(sub.Subtrair());
                    break;
                case 3:
                    Multiplicacao mult = new Multiplicacao(a, b);
                    System.out.println(mult.Multiplicar());
                    break;
                case 4:
                    Divisao div = new Divisao(a, b);
                    System.out.println(div.Dividir());
                    break;
                default:
                    break label;
            }
        } while (true);
    }
}
