package Aula14_13112024;

public class Principal {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz Maranauá" , 36.98 , 200);
        Produto feijao = new Produto("Feijão Maranauá" , 28.99 , 100);
        Produto oleo = new Produto("Oléo Maranauá" , 8.90 , 300);

        arroz.exibirProduto();
        feijao.exibirProduto();
        oleo.exibirProduto();
    }
    
}
