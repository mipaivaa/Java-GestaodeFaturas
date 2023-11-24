import java.util.Scanner;

public class Fatura {

	String Numeroproduto;
	String Descricao;
	double Precoproduto;
	int qtdcomprada;


//Construtor  - cria uma nova instância (objeto) da classe. 
public Fatura(String Numeroproduto, String Descricao, double Precoproduto, int qtdcomprada ) {
    this.Numeroproduto = Numeroproduto;
    this.Descricao = Descricao;
    this.Precoproduto = Precoproduto;
    this.qtdcomprada = qtdcomprada;
}

// Método para calcular valor total da fatura
public void multiplicacao() {
    System.out.println(qtdcomprada*Precoproduto);
}   

}


//Crie um classe Fatura para uma loja de suprimentos de informática. 
//deve conter 4 atributos - Numero do produto (String), Descrição (String),
//a quantidade comprada (int) e o preço do produto (double). 
//Além disso, forneça um método que nos retorne o valor total da fatura