package Abstração;

public class Principal {

    public static void main(String[]args){

        //criar carros -> dinstanciar objetos
        //obs: todo carro começa com a velocidade 0

       Carro onix = new Carro("Chevrolet" ,"onix",2020,0);
       Carro hb20 = new Carro("Hyndai" ,"hb20",2022,0);
       Carro tiggo = new Carro("Caoa cherry" ,"tiggo",2024,0);
       Carro haval = new Carro("GWM" ,"haval",2023,0);

       //aumente a velocidade de todos os carros

       onix.aumentarVelocidade();
       hb20.aumentarVelocidade();
       tiggo.aumentarVelocidade();
       haval.aumentarVelocidade();

       //como acessar os atributos e métodos interno de um objeto?
       //R: Através do ponto após o nome objeto.EX: onix.<acessa o atributo ou método>
    }
    
}
