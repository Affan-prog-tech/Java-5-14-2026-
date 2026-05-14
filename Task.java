class Notification
{
    void sendMessage()
    {
        System.out.println("Hello World...");
    }

    void DisplayRecipant()
    {
        System.out.println("Affan Recieved the Message");
    }

    void show_NotificationType()
    {
        System.out.println("Just a Parent Notification Type..");
    }

    
}

class Email_Notification extends Notification
{
    void sendMessage()
    {
        System.out.println("Hello Professor...");
    }

    void DisplayRecipant()
    {
        System.out.println("Affan Recieved the Message");
    }

    void show_NotificationType()
    {
        System.out.println("Email Notification Type..");
    }

    void addAttachment()
    {
        System.out.println("Add any attachment wih your Email\n");
    }
}

class SMS_Notification extends Notification
{
    void sendMessage()
    {
        System.out.println("You are out of balance...");
    }

    void DisplayRecipant()
    {
        System.out.println("Aliya Recieved the Message");
    }

    void show_NotificationType()
    {
        System.out.println("SMS Notification Type..");
    }

    void checkMessageLength()
    {
        System.out.println("Your Message Length is 30\n");
    }
}

class App_Notification extends Notification
{
    void sendMessage()
    {
        System.out.println("You Recieved Whatsapp Message..");
    }

    void DisplayRecipant()
    {
        System.out.println("Areeba Recieved the Message");
    }

    void show_NotificationType()
    {
        System.out.println("App Notification Type..");
    }

    void enableVibration()
    {
        System.out.println("Your Phone is Vibrating\n");
    }
}

public class Task {
    public static void main(String[] args)
    {
        Notification N1=new Email_Notification();
        Notification N2=new SMS_Notification();
        Notification N3=new App_Notification();

        N1.show_NotificationType();
        Email_Notification EN=(Email_Notification)N1;
        EN.addAttachment();

        N2.show_NotificationType();
        SMS_Notification SN=(SMS_Notification)N2;
        SN.checkMessageLength();

        N3.show_NotificationType();
        App_Notification AN=(App_Notification)N3;
        AN.enableVibration();
        
    }
    
}
