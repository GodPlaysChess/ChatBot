package ChatLogic;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();
       // ChatPanel chatWindow = new ChatPanel();
        ChatWindow chatWindow = new ChatWindow();
        chat.addListener(chatWindow);
        chatWindow.startChat();
        User client = new User(chat, "Gleb");
       // chat.addListener(client);
    }
}
