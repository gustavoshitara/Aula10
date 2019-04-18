package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class ExemploPratico_Principal {

    public static void main(String[] args) {
        ExemploPratico_Curso android = new ExemploPratico_Curso("Mobile Android");
        ExemploPratico_Curso fullStack = new ExemploPratico_Curso("Full Stack");

        ExemploPratico_Aluno vini = new ExemploPratico_Aluno(123,"Vinicius","Oliveira",android);
        ExemploPratico_Aluno vinicius = new ExemploPratico_Aluno(123456,"Vinicius","Oliveira",android);
        ExemploPratico_Aluno jessica = new ExemploPratico_Aluno(321,"Jessica","Milena",fullStack);
        ExemploPratico_Aluno hendy = new ExemploPratico_Aluno(456,"Hendy","Almeida",fullStack);
        ExemploPratico_Aluno ana = new ExemploPratico_Aluno(654,"Ana","Pereira",android);

        List<ExemploPratico_Aluno> alunos = new ArrayList<>();
        alunos.add(vini);
        //alunos.add(vinicius);
        alunos.add(jessica);
        alunos.add(hendy);
        alunos.add(ana);

        System.out.println(
                //vini.equals(vinicius));

                //Verifica se o aluno vinicius está na lista de alunos
                //alunos.contains(vinicius));
                vinicius);

        System.out.println(alunos);
    }
}
