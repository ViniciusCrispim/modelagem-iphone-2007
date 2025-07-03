package br.com.viniciuscrispim;

import br.com.viniciuscrispim.classes.Iphone;

public class Main {
    public static void main(String[] args) {

        var iphone = new Iphone();
        iphone.exibirPagina("https://www.iphone.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.ligar("11 2 3333 - 4444");
        iphone.atender();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Don't stop me now - Queen");
    }
}