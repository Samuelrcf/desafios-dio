package application;

import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Curso de Java", "Aprenda Java do zero ao avançado", 80);
        Curso cursoJavaScript = new Curso("Curso de JavaScript", "Aprenda JavaScript e suas frameworks", 60);

        Mentoria mentoriaJava = new Mentoria("Mentoria de Java", "2024-08-10");
        Mentoria mentoriaJS = new Mentoria("Mentoria de JavaScript", "2024-08-12");

        Bootcamp bootcamp = new Bootcamp("Bootcamp Fullstack", "Desenvolvimento de Software Fullstack");
        bootcamp.addCurso(cursoJava);
        bootcamp.addCurso(cursoJavaScript);
        bootcamp.addMentoria(mentoriaJava);
        bootcamp.addMentoria(mentoriaJS);

        Dev dev1 = new Dev("Alice");
        dev1.inscreverCurso(cursoJava);
        dev1.inscreverMentoria(mentoriaJava);

        Dev dev2 = new Dev("Bob");
        dev2.inscreverCurso(cursoJavaScript);
        dev2.inscreverMentoria(mentoriaJS);

        System.out.println(bootcamp);
        System.out.println(dev1);
        System.out.println(dev2);
    }
}

