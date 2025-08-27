package com.mycompany;

public class Avaliacao {

    public static void main(String[] args) {
        int pai = 46;
        int mae = 45;
        int filho = 20;
        int filha = 9;

        int media = (pai + mae + filho + filha) / 4;
        System.out.println("A média de idade da família é: " + media + " anos.");

        // 02
        double area = 25.0;
        double pi = Math.PI;
        double raio = Math.sqrt(area / pi);
        System.out.println("O raio do círculo é: " + raio + " cm.");

        // 03
        double precoProduto = 1200.00;
        double percentualReajuste = 15.0;
        double reajuste = precoProduto * (percentualReajuste / 100);
        double precoFinal = precoProduto + reajuste;
        System.out.println("O preço do produto após o reajuste é: R$ " + precoFinal);

        // 04
        double precoProduto2 = 850.00;
        double percentualDesconto = 30.0;
        double desconto = precoProduto2 * (percentualDesconto / 100);
        double precoFinal2 = precoProduto - desconto;
        System.out.println("O preço do produto após o desconto é: R$ " + precoFinal2);
    }
}
