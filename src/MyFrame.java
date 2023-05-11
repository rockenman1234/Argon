/*
 *   _______  _____     ________ ________ __    _ 
 *  |   _   ||    _ |  |       ||       ||  |  | |
 *  |  |_|  ||   | ||  |    ___||   _   ||   |_| |
 *  |       ||   |_||_ |   | __ |  | |  ||       |
 *  |       ||    __  ||   ||  ||  |_|  ||  _    |
 *  |   _   ||   |  | ||   |_| ||       || | |   |
 *  |__| |__||___|  |_||_______||_______||_|  |__| 
 *
 * Build: 0.0.1
 *
 * Developer: 	Kenneth (Alex) Jenkins - Computer Engineering Student @ Georgia Tech (Go Jackets!)
 *
 */



import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;


public class MyFrame extends JFrame {

   private JButton button1;
   private JButton button2;
   private JButton button3;
   private JButton button4;
   private JButton button5;
   private JButton button6;
   private JButton button7;
   private JButton button8;
   
   
   private JLabel welcomeMessage;
   private JLabel subHeading;
   

   public MyFrame() {
      setTitle("ARGON Version: 0.0.1 (ALPHA)");
      setSize(450, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      welcomeMessage = new JLabel("Welcome to ARGON");
      welcomeMessage.setFont(new Font("SF Mono", Font.BOLD, 20));
      welcomeMessage.setHorizontalAlignment(SwingConstants.CENTER);
      add(welcomeMessage, BorderLayout.PAGE_START);
   
      subHeading = new JLabel("<html>Please follow the order listed in the buttons.<br>For more information on what each button does,<br>please hover your mouse over the button in question.<br><br>GitHub: rockenman1234<br>Build: 0.0.1 (ALPHA)<br></html>");
      subHeading.setFont(new Font("SF Pro", Font.ITALIC, 16));
      subHeading.setHorizontalAlignment(SwingConstants.CENTER);
      add(subHeading, BorderLayout.PAGE_END); 
   
      button1 = new JButton("1). Install HomeBrew");
      button1.setToolTipText("Installs the HomeBrew Package manager for MacOS, You may skip this step if you already have Brew installed.");
      
      button2 = new JButton("2). Install Needed Developer Tools");
      button2.setToolTipText("Installs Xcode-CLI, wget, gnu-coreutils, and curl - using Brew");
      
      
      button3 = new JButton("3). Install High-Level Programming Languages");
      button3.setToolTipText("Install Python, Ruby, and PHP support - using Brew");
      
      
      button4 = new JButton("4). Install Lower-Level Programming Languages");
      button4.setToolTipText("Installs Rust, Go, and DOTNET (C#) support - using Brew");
      
      
      button5 = new JButton("5). Install Ease-Of-Life Software (for Power Users)");
      button5.setToolTipText("Installs OnyX, Shottr, Alt-Tab, Rectangle, and Bitwarden - using Brew Casks");
      
      button6 = new JButton("6). Install Web Browsers");
      button6.setToolTipText("Installs Chrome, and Firefox - using Brew Casks");
      
      button7 = new JButton("7). Install Multimedia Software");
      button7.setToolTipText("Installs VLC, Audacity, and Handbrake - using Brew Casks");
      
      button8 = new JButton("8). Restart MacOS");
      button8.setToolTipText("Restarts MacOS to finish install process");
      
   
      // Installs Homebrew
      button1.addActionListener(
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                  Runtime.getRuntime().exec(new String[]{"osascript", "-e", "tell app \"Terminal\" to do script \"$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)\""});
                  JOptionPane.showMessageDialog(MyFrame.this, "Follow instructions on Terminal window. \n When done, return here \n and press OK to continue.", "Terminal Output", JOptionPane.PLAIN_MESSAGE);
               } catch (Exception ex) {
                  ex.printStackTrace();
               }
            }
         });
   
      // Installs needed developer tools and wget
      button2.addActionListener(
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                  Runtime.getRuntime().exec(new String[]{"osascript", "-e", "tell app \"Terminal\" to do script \"xcode-select --install && brew install wget coreutils curl\""});
                  JOptionPane.showMessageDialog(MyFrame.this, "Follow instructions on Terminal window. \n When done, return here \n and press OK to continue.", "Terminal Output", JOptionPane.PLAIN_MESSAGE);
               } catch (Exception ex) {
                  ex.printStackTrace();
               }
            }
         });
   
      // Install Higher-level programming languages
      button3.addActionListener(
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                  Runtime.getRuntime().exec(new String[]{"osascript", "-e", "tell app \"Terminal\" to do script \"brew install python ruby php\""});
                  JOptionPane.showMessageDialog(MyFrame.this, "Follow instructions on Terminal window. \n When done, return here \n and press OK to continue.", "Terminal Output", JOptionPane.PLAIN_MESSAGE);
               } catch (Exception ex) {
                  ex.printStackTrace();
               }
            }
         });
   
      // Install Lower-level programiing languages
      button4.addActionListener( 
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                  Runtime.getRuntime().exec(new String[]{"osascript", "-e", "tell app \"Terminal\" to do script \"brew install rust go dotnet\""});
                  JOptionPane.showMessageDialog(MyFrame.this, "Follow instructions on Terminal window. \n When done, return here \n and press OK to continue.", "Terminal Output", JOptionPane.PLAIN_MESSAGE);
               } catch (Exception ex) {
                  ex.printStackTrace();
               }
            }
         });
         
      // Install Ease-Of-Use software - Shottr, VSCode, Alt-Tab, Rectangle, Bitwarden
      button5.addActionListener( 
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                  Runtime.getRuntime().exec(new String[]{"osascript", "-e", "tell app \"Terminal\" to do script \"brew install --cask shottr --cask visual-studio-code --cask onyx --cask alt-tab --cask rectangle --cask bitwarden\""});
                  JOptionPane.showMessageDialog(MyFrame.this, "Follow instructions on Terminal window. \n When done, return here \n and press OK to continue.", "Terminal Output", JOptionPane.PLAIN_MESSAGE);
               } catch (Exception ex) {
                  ex.printStackTrace();
               }
            }
         });  
         
      // Install Web Browsers - Firefox and Chrome
      button6.addActionListener( 
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                  Runtime.getRuntime().exec(new String[]{"osascript", "-e", "tell app \"Terminal\" to do script \"brew install --cask firefox --cask google-chrome\""});
                  JOptionPane.showMessageDialog(MyFrame.this, "Follow instructions on Terminal window. \n When done, return here \n and press OK to continue.", "Terminal Output", JOptionPane.PLAIN_MESSAGE);
               } catch (Exception ex) {
                  ex.printStackTrace();
               }
            }
         });     
         
      // Install Multimedia Software - VLC, audacity, handbrake
      button7.addActionListener( 
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                  Runtime.getRuntime().exec(new String[]{"osascript", "-e", "tell app \"Terminal\" to do script \"brew install --cask vlc --cask audacity --cask handbrake\""});
                  JOptionPane.showMessageDialog(MyFrame.this, "Follow instructions on Terminal window. \n When done, return here \n and press OK to continue.", "Terminal Output", JOptionPane.PLAIN_MESSAGE);
               } catch (Exception ex) {
                  ex.printStackTrace();
               }
            }
         });    
         
         
      // Restart MacOS
      button8.addActionListener( 
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                  Runtime.getRuntime().exec(new String[]{"osascript", "-e", "tell app \"Terminal\" to do script \"sudo shutdown -r now\""});
                  JOptionPane.showMessageDialog(MyFrame.this, "Once Restarted, feel free to delete this app and share!", "Terminal Output", JOptionPane.PLAIN_MESSAGE);
               } catch (Exception ex) {
                  ex.printStackTrace();
               }
            }
         });   
   
      JPanel panel = new JPanel();
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);
      panel.add(button5);
      panel.add(button6);
      panel.add(button7);
      panel.add(button8);
      
   
      add(panel);
   
      setVisible(true);
   }

}
