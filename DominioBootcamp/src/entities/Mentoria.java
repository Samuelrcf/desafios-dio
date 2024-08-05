package entities;

public class Mentoria {
    private String tema;
    private String data;

    public Mentoria(String tema, String data) {
        this.tema = tema;
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "tema='" + tema + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}

