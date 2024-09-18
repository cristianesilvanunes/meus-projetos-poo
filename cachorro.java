import java.util.Scanner;
public class cachorro {
  public static Scanner scanner = new Scanner(System.in);
    
  public static void main (String[] args){
    String nome,raça,cor;
    int idade , opcao = 10;
    float peso;

    System.out.println("Cachorro virtual");
    System.out.println("Cadastre o seu cachorro");

    System.out.print("NOME:");
    nome = scanner.nextLine();

    System.out.print("RAÇA");
    raca = scanner.nextLine();

    System.out.print("IDADE");
    idade = scanner.nextInt();

    System.out.print("PESO");
    peso = scanner.nextFloat();

    System.out.print("COR");
    cor= scanner.next();

    System.out.println("\n\n#### cachorro salvo com sucesso #### \n\n");
    while (opcao!= 0){
    System.out.println("MENU DE AÇÕES DO CACHORRO");
    System.out.println("O que você quer que o cachorro faça");
    System.out.println("1 -Latir");
    System.out.println("2-Comer ");
    System.out.println("3- Buscar Obejeto");
    System.out.println("4- Brincar");
    System.out.println("5- Dormir");
    System.out.println("0- Sair");
    System.out.println("Opção Selecionada:");
    opcao = scanner.nextInt();
    
    switch (opcao) {
      case 1: latir(nome);
         break;
    
      case 2: comer(nome);
         break;  
         
      case 3: buscarObjeto(nome);
         break;  

      case 4: brincar(nome);
         break;  
         
      case 5: dormir(nome);
         break;  
         
      case 6: System.out.println("\n\n#####SAINDO DO SISTEMA EM 3...2...1...");
         break;

      default:System.out.println("Opção digitada está incorretra");
         break;

      }   

   }   
}
public static void latir(String nome) {
   System.out.println("\n\n" + nome + " está latindo!!!\n\n");

}
public static void comer(String nome) {  
   String comida;
   System.out.println(">>>>> O que o cachorro irá comer?RESPOSTA:");
   comida = scanner.next();
   System.out.println(nome + " está comendo " + comida);
}
public static void buscarObjeto(String nome) { 
   String objeto;
   System.out.println(">>>> 0 que o cachorro irá buscar?RESPOSTA:");
   objeto = scanner.next();
   System.out.println(nome + " está buscando o(a)" + objeto);

}
public static void brincar(String nome) { 
   System.out.println(nome + " está brincando!!!");

}
 public static void dormir(String nome) {
   System.out.println(nome + " está descansando!!!");  

 }   
}
