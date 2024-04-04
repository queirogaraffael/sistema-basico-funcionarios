package com.gerenciadorDeFuncionarios.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.gerenciadorDeFuncionarios.entities.Employee;

public class Program {

	public static void main(String[] args) {

		List<Employee> funcionarios = new ArrayList<>();

		// 1 - criando objetos Employees e adicionando-os na lista de funcionarios
		funcionarios.add(new Employee("Raffael Queiroga", 2000.00, 100.0));
		funcionarios.add(new Employee("Matheus", 3000.00, 200.0));
		funcionarios.add(new Employee("Victor", 5000.00, 400.0));

		// 2 - exibição dos detalhes dos funcionarios
		funcionarios.forEach(System.out::println);

		// 3 - aplicação de aumento salarial em um funcionario aleatório
		Random random = new Random();
		int indiceFuncionarioAleatorio = random.nextInt((funcionarios.size()));
		funcionarios.get(indiceFuncionarioAleatorio).aumentoSalario(10.0);

		// 4 - exibição dos detalhes
		System.out.println("\nDetalhe dos funcionários após aumento salarial de 10% para o funcionário "
				+ (indiceFuncionarioAleatorio + 1) + ":");
		funcionarios.forEach(System.out::println);

		// 5 - exibição dos salarios liquidos dos funcionarios
		System.out.println("\nSalário líquido dos funcionários: ");
		for (Employee func : funcionarios) {
			System.out.println(
					"Funcionário " + func.getNome() + " : " + String.format("%.2f", func.obterSalarioLiquido()));
		}

	}

}
