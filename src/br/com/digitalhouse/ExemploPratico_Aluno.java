package br.com.digitalhouse;

public class ExemploPratico_Aluno {
    private int ra;
    private String nome;
    private String sobrenome;
    private ExemploPratico_Curso curso;

    public ExemploPratico_Aluno() {
    }

    public ExemploPratico_Aluno(int ra, String nome, String sobrenome, ExemploPratico_Curso curso) {
        this.ra = ra;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.curso = curso;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public ExemploPratico_Curso getCurso() {
        return curso;
    }

    public void setCurso(ExemploPratico_Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object outroAluno) {

        /*Verifica se o objeto outroAluno é uma instância da classe Aluno. Se for da classe Animal, por exemplo, já retorna falso */
        if (!(outroAluno instanceof ExemploPratico_Aluno)) {
            return false;
        }

        /* Verifica se o RA e Nome do outroAluno é igual ao RA e Nome do aluno da classe*/
        /* Precisa fazer um cast para converter o outroAluno para o tipo Aluno para ter acesso ao getRA e getNome*/
        if (((ExemploPratico_Aluno) outroAluno).getRa() == this.getRa() &&
                ((ExemploPratico_Aluno) outroAluno).getNome().equals(this.getNome())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        //Pegando o ra + nome e retorna um número hashcode
        return ra + nome.hashCode();
    }

    @Override
    //toString é utilizado para retornar a String de um objeto
    public String toString() {
        return "ra: " + getRa() +
                "\nNome: " + getNome() +
                "\nSobrenome: " + getSobrenome() +
                "\nCurso: " + getCurso().getNome();
    }
}
