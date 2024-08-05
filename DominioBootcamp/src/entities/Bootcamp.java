package entities;

import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Set<Curso> cursos = new HashSet<>();
    private Set<Mentoria> mentorias = new HashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    public Set<Mentoria> getMentorias() {
        return mentorias;
    }

    public void addMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cursos=" + cursos +
                ", mentorias=" + mentorias +
                '}';
    }
}

