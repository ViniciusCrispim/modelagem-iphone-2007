package br.com.viniciuscrispim.classes;

import br.com.viniciuscrispim.interfaces.AparelhoTelefonico;
import br.com.viniciuscrispim.interfaces.NavegadorInternet;
import br.com.viniciuscrispim.interfaces.ReprodutorMusical;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo URL:" + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba criada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizanda");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Sua chamada está sendo encaminhada para a caixa de mensagem");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando a música selecionada: " + musica);
    }
}
