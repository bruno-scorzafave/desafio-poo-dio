import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso kotlin");
        curso3.setDescricao("descrição curso kotlin");
        curso3.setCargaHoraria(10);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("mentoria de java");
        mentoriaJava.setDescricao("descrição mentoria java");
        mentoriaJava.setData(LocalDate.now());

        Mentoria mentoriaKotlin = new Mentoria();
        mentoriaKotlin.setTitulo("mentoria de kotlin");
        mentoriaKotlin.setDescricao("descrição mentoria kotlin");
        mentoriaKotlin.setData(LocalDate.of(2024, 8, 12));

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoriaJava);

        Bootcamp bootcampKotlin = new Bootcamp();
        bootcampKotlin.setNome("Bootcamp Kotlin Developer");
        bootcampKotlin.setDescricao("Descrição Bootcamp Kotlin Developer");
        bootcampKotlin.getConteudos().add(curso3);
        bootcampKotlin.getConteudos().add(mentoriaKotlin);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcampJava);
        devCamila.inscreverBootcamp(bootcampKotlin);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        // devCamila.progredir(bootcampJava);
        // devCamila.progredir(bootcampJava);
        devCamila.progredir(bootcampKotlin);
        devCamila.progredir(bootcampKotlin);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        // Dev devJoao = new Dev();
        // devJoao.setNome("Joao");
        // devJoao.inscreverBootcamp(bootcampJava);
        // System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        // devJoao.progredir(bootcampJava);
        // devJoao.progredir(bootcampJava);
        // devJoao.progredir(bootcampJava);
        // System.out.println("-");
        // System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        // System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        // System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
