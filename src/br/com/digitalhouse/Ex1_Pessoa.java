package br.com.digitalhouse;

public class Ex1_Pessoa {
    private String nome;
    private Integer rg;

    public Ex1_Pessoa() {
    }

    public Ex1_Pessoa(String nome, Integer rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    @Override
    public boolean equals(Object novaPessoa) {
        if (!(novaPessoa instanceof Ex1_Pessoa)){
            return false;
        }

        if(((Ex1_Pessoa) novaPessoa).getRg() == this.getRg()){
            return true;
        } else{
            return false;
        }
    }
}
