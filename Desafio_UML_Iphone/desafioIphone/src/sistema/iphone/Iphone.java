package sistema.iphone;

import sistema.iphone.aparelho.AparelhoTelefonico;
import sistema.iphone.navegador.NavegadorInternet;
import sistema.iphone.reprodutor.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void tocar() {
        System.out.println("Reproduzindo m�sica");
    }

    public void pausar() {
        System.out.println("M�sica pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a m�sica: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz");
    }  

    public void exibirPagina(String url) {
        System.out.println("Exibindo a p�gina: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a p�gina");
    }
}
