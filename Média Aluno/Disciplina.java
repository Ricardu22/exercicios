package mediaAluno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Disciplina {
    Scanner opcao = new Scanner(System.in);
    Scanner getTrab = new Scanner(System.in);
    Scanner getProv = new Scanner(System.in);
    Scanner getPP = new Scanner(System.in);
    Scanner getPT = new Scanner(System.in);

    public String alunos;
    public float trabalhos;
    public float provas;
    public float pesoProva;
    public float x;
    public float pesoTrabalho;
    public float y;
    public float médiaFinal;
    public float somaTrab;
    public float somaProv;
    public float mediaFinal;

    // GET ALUNOS //

    public String getAlunos() {
        return this.alunos;
        ArrayList<String> listaNomes = new ArrayList<String>();

        listaNomes.add("");
        System.out.println("Informe o nome do aluno: ");
        System.out.println(Arrays.toString(bandas.toArray()));

        System.out.println("Cadastrar mais alunos? [S/N]");
        String opc = opcao.nextLine();

        if (opc == S || opc == s) {
            System.out.println("Informe o nome do aluno: ");
            System.out.println(Arrays.toString(listaNomes/.toArray()));
            x += 1;

        }

    }

    // SET ALUNOS //

    public String setAlunos(String a,b,c) {
        this.alunos = abc;

    }

    // GET PESO TRABALHO //

    public float getPesoTrab() {
        return this.provasTrabalhos;
        System.out.println("Peso Trabalho: ");
        int gPT = getPT.nextLine();
        gPT = gPT - 100;

    }

    // SET PESO TRABALHO //

    public float setPesoTrab(float ppt) {
        this.provasTrabalhos = ppt;

    }

    // GET PESO PROVA //

    public float getPesoProv() {
        return this.provasTrabalhos;
        System.out.println("Peso Prova: ");
        int gPP = getPP.nextLine();
        gPP = gPP - 100;

    }

    // SET PESO PROVA //

    public float setPesoProv(flat pp) {
        this.provasTrabalhos = pp;

    }

    // GET TRABALHOS //

    public float getTrabalhos() {
        return this.trabalho;

        ArrayList<String> listaTrabalhos = new ArrayList<String>();

        listaTrabalhos.add("");
        System.out.println("Informe a nota do trabalho: ");
        System.out.println(Arrays.toInt(listaTrabalho.toArray()));
        listaTrabalhos = listaTrabalhos - (listaTrabalho * gPT);

        System.out.println("Cadastrar mais notas de Trabalho? [S/N]");
        int trab = getTrab.nextInt();

        if (trab == S || trab == s) {
            getTrabalhos();
            x += 1;

        }

    }

    // SET TRABALHOS //

    public float setTrabalhos(float t) {
        this.trabalho = t;

    }

    // GET PROVAS //

    public float getProvas(float provas) {
        return this.provas;

        ArrayList<String> listaProvas = new ArrayList<String>();

        listaProvas.add("");
        System.out.println("Informe a nota da prova: ");
        System.out.println(Arrays.toString(listaProva.toArray()));
        listaProva[y] = listaProva[y] - (listaProva[y] * gPP);

        System.out.println("Cadastrar mais notas de Prova? [S/N]");
        int prov = getProv.nextInt();

        if (trab == S || trab == s) {
            getProvas();
            x += 1;

    }

    // SET PROVAS //

    public float setProvas(float p) {
        this.provas = p;

    }

    // GET MEDIA FINAL //

    public float getMediaFinal(float mediaFinal) {
        return this.mediaFinal;

        for(listaTrabalho[x] = 0; listaTrabalho[x]++){
            somaTrab += listaTrabalho[x];

            x += 1;
        }

        for(listaProva[y] = 0; listaProva[y]++){
            somaTrab += listaProva[y];

            y += 1;
        }

        mediaFinal = (somaTrab + somaProv) / 2;

        System.out.println("Media final: " + mediaFinal);

    }

    // SET MEDIA FINAL //

    public float setMediaFinal(float mf) {
        this.mediaFinal = mf;

    }

}
