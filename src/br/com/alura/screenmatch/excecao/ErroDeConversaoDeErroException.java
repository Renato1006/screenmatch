package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeErroException extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeErroException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
