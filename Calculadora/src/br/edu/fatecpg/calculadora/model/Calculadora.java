package br.edu.fatecpg.calculadora.model;

import java.util.Scanner;

public class Calculadora implements OperacaoMatematica{


	@Override
	public double soma(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double subtracao(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double divisao(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double multiplicacao(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	public void exibirOp() {
		System.out.println("1-Soma  2-Subtração 3-Multiplicação 4-Divisão");
	}
	public void calcular() {
		Calculadora calc = new Calculadora();
		Scanner scan = new Scanner(System.in);
		int op,x,y;
		System.out.println("Digite dois valores para a operação: ");
		x = scan.nextInt();
		y = scan.nextInt();
		calc.exibirOp();
		System.out.println("Digite a operação desejada: ");
		op = scan.nextInt();
		switch(op) {
		case 1:
			System.out.println(calc.soma(x, y));
			break;
		case 2:
			System.out.println(calc.subtracao(x, y));
			break;
		case 3:
			System.out.println(calc.multiplicacao(x, y));
			break;
		case 4:
			System.out.println(calc.divisao(x, y));
			break;
			
		default:
			System.out.println("Opção inválida");
			calc.calcular();
		}
	}

}
