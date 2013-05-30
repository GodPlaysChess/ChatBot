package ChatLogic;

public class Bot implements ChatListener {

    private String userReply;
    private String botReply;
    private String unrepliedBuffer;
    private Chat chat;
    private String name;

    public Bot(Chat chat, String nickname) {
        this.chat = chat;
        name = nickname;


    }

    public String reply() {
        generateAnswer();
        return botReply;
    }

    private void generateAnswer() {
        botReply = userReply + " :D";
    }

    @Override
    public void onMessage(String from, String msg) {
        userReply = msg;
    }
}
