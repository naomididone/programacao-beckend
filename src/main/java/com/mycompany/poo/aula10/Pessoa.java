package com.mycompany.poo.aula10;

public class Pessoa {
    /*
     * Modificadores de Acesso
     *
     * Quando trabalhamos com o conceito de POO, utilizamos modificadores de acesso,
     * para dar segurança para nossas classes.
     * 
     * Utilizamos elas como prefixo para:
     * -Classes
     * -Interfaces
     * -Atributos
     * -Métodos
     */
    public String nome; // Público, é visível em qualquer classe.
    protected int idade; // Protegido, é visível somente em classes filhas (herença).
    private double salario; // Privado, visível somente dentro da própria classe.
    double altura; // (friendly) Default, mesmo se não estiver explícito, ele também é visível

    public void exibirDados() {
        System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura (m): " + altura);
    }

    /**
     * Nomenclatura de métodos
     *
     * Métodos/Funções indicam ações, e por padrão utilizamos verbos.
     *
     * Ex.: correr, andar, caminha...
     */
    public void atribuirSalario(double valor) {
        this.salario = valor;

        System.out.println("O novo salário de " + this.nome + " é: " + this.salario);
    }
    
    public void atribuirSalario(double valor, double bonus) {
    this.salario = valor + bonus;
    System.out.println("O novo salário de " + this.nome + " é: " + this.salario + " mais um bônus de " + bonus);
}


}