package ChatLogic;

import javax.swing.*;
import java.awt.*;

public class ChatPanel implements ChatListener {
    public JFrame frame;
    public Font font = new Font("Verdana", Font.BOLD, 12);
    public JPanel chatWindow;
    private JScrollPane messageContainer;
    private JTextArea messageBox;
    private JTextArea textArea2;

    public ChatPanel() {

    }

    public void startChat() {
        frame = new JFrame("ChatPanel");                 //!
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setContentPane(new ChatPanel().chatWindow);    //!
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //!
        frame.pack();                                                       //!
        frame.setSize(screenSize.width / 2, screenSize.height / 4);
        frame.setLocation(screenSize.width / 4, screenSize.height / 4);
        frame.setVisible(true);                                                    //!
       // chatWindow.add(messageContainer);
       // messageContainer.add(messageBox);
        System.out.println("Finishing the method");
    }

    public void update(){
        System.out.println("updating");
        messageBox.setFont(font);
        messageBox.setForeground(Color.BLUE);
        messageBox.setText("\n" + "hui");
        textArea2.setText("\n" + "hui");
    }


    @Override
    public void onMessage(String from, String msg) {
        System.out.println("recieved the message " + msg);
        messageBox.setText(msg);
        /*messageBox.setFont(font);
        messageBox.setForeground(Color.BLUE);
        messageBox.append("\n" + from + ": " + msg);*/
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
