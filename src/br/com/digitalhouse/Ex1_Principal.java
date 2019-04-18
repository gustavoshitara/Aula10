package br.com.digitalhouse;

public class Ex1_Principal {
    public static void main(String[] args) {
        Ex1_Pessoa gustavo = new Ex1_Pessoa("Gustavo",123);
        Ex1_Pessoa yoko = new Ex1_Pessoa("Yoko",1234);

        System.out.println(gustavo.equals(yoko));
    }
}
