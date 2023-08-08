package br.edu.umfg.tecnologia;

public class Aluno {
    String nomeAcademico;
    String registroAcademico;
    double prova1;
    double prova2;
    double trabalho;
    double  media;


    public String getNomeAcademico() {
        return nomeAcademico;
    }

    public void setNomeAcademico(String nomeAcademico) {
        this.nomeAcademico = nomeAcademico;
    }

    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    public double getMedia() {
        return ((prova1 * 3.5) + (prova2 * 3.5) + (trabalho * 3)) /
                (3.5 + 3.5 + 3);
    }


    public String situacao() {
        double mediaFinal = getMedia();
        if (mediaFinal >= 7.0) {
            return "APROVADO";
        } else {
            return "EXAME";
        }
    }


    @Override
    public String toString() {
        return "R.A.:" + this.registroAcademico + "|" + "Nome:" + this.nomeAcademico;
    }

}
