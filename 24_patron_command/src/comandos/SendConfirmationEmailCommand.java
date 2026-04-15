package comandos;

public class SendConfirmationEmailCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Email de confirmación enviado.");
       /* :
        EmailSender.send(…);*/
    }
} 

