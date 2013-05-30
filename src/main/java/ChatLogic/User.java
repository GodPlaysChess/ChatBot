package ChatLogic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User implements ChatListener {
    private JTextField userTextArea;
    private JButton sendButton;
    private JFrame userFrame;
    private JPanel userPanel;
    private Chat chat;
    private String name;

    public User(Chat chat, String nickname) {
        name = nickname;
        this.chat = chat;
        startClient();
    }

    public void startClient() {
        userPanel = new JPanel();
        userTextArea = new JTextField();
        sendButton = new JButton("SEND");
        userFrame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        userFrame.setSize(screenSize.width / 2, screenSize.height / 7);
        userFrame.setLocation(screenSize.width / 4, screenSize.height * 3 / 4);
        userTextArea.setPreferredSize(new Dimension(screenSize.width / 4,
                screenSize.height / 10));

        userFrame.getContentPane().add(userPanel);
        userPanel.add(sendButton);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chat.sendMessage(name, userTextArea.getText());
                userTextArea.setText("");
            }
        });
        userTextArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chat.sendMessage(name, userTextArea.getText());
                userTextArea.setText("");
            }
        });
        userPanel.add(userTextArea);
        userFrame.setVisible(true);
    }

    @Override
    public void onMessage(String from, String msg) {
        //todo: add to panel message FROM -> msg
    }
}
