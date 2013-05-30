package ChatLogic;

import java.util.ArrayList;

public class Chat {
    private ArrayList <ChatListener> listeners = new ArrayList<ChatListener>();

    public void sendMessage(String from, String msg){
        for (ChatListener chatListener : listeners){
            chatListener.onMessage(from, msg); //Sending messages to listeners
        }
    }

    public void addListener(ChatListener listener){
        listeners.add(listener);
    }
}
