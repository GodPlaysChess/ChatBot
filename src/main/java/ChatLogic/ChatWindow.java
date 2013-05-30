package ChatLogic;

import javax.swing.*;
import java.awt.*;

public class ChatWindow implements ChatListener {
    private JFrame frame;
    private Font font = new Font("Verdana", Font.BOLD, 12);
    private JPanel chatWindow;
    private JScrollPane scrollPane;
    private JTextArea messageBox;

    public ChatWindow() {

    }

    public void startChat() {
        frame = new JFrame("Chat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        messageBox = new JTextArea(10,30);
    //    messageBox.setPreferredSize(new Dimension(100,100));
        messageBox.setEditable(false);
        messageBox.setLineWrap(true);
        scrollPane = new JScrollPane(messageBox);
        scrollPane.setPreferredSize(new Dimension((int)messageBox.getPreferredSize().getWidth(),
                (int)messageBox.getPreferredSize().getHeight()));
     //   scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
     //   scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        chatWindow = new JPanel();

        scrollPane.add(messageBox);

        frame.getContentPane().add(chatWindow);
        chatWindow.add(scrollPane);
        //  frame.pack();
        //frame.add(scrollPane, BorderLayout.CENTER);
        chatWindow.add(messageBox);

        frame.setSize(screenSize.width / 2, screenSize.height / 4);
        frame.setLocation(screenSize.width / 4, screenSize.height / 4);
        frame.setVisible(true);
    }

    @Override
    public void onMessage(String from, String msg) {
        System.out.println("recieved the message " + msg);
        messageBox.setFont(font);
        messageBox.setForeground(new Color(63, 15, 255));
        messageBox.append(from + ": " + msg + "\n");
    }
}

