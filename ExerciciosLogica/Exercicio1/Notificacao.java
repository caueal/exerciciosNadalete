package Exercicio1;

public class Notificacao {

    public void enviar() {
        System.out.println("Enviando notificação");
    }

    public static void main(String[] args) {

    Notificacao[] notificacoes = new Notificacao[3]; 

    notificacoes[0] =  new NotificacaoEmail();
    notificacoes[1] =  new NotificacaoSMS();
    notificacoes[2] =  new NotificacaoPush();

    for (int i = 0; i < notificacoes.length; i++) {
        notificacoes[i].enviar();       
    };

   }
}



