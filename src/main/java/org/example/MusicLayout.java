package org.example;

import javax.swing.*;
import java.awt.*;

public class MusicLayout {
    public MusicLayout() {
        JFrame MusicLayoutFrame=new JFrame("Music PlayList");
        JFrame.setDefaultLookAndFeelDecorated(true);

        MusicLayoutFrame.setLayout(new BorderLayout());

//        JLabel northLabel=new JLabel("My Music Genre");

<<<<<<< HEAD
//        JButton northButton=new JButton("My Music Genre");
//        JButton southButton=new JButton("Rap Music");
        JButton westButton=new JButton("Gospel Music");
        JButton eastButton=new JButton("Ballads Music");

//        MusicLayoutFrame.add(northButton,BorderLayout.NORTH);
//        MusicLayoutFrame.add(southButton,BorderLayout.SOUTH);
        MusicLayoutFrame.add(westButton,BorderLayout.WEST);
        MusicLayoutFrame.add(eastButton,BorderLayout.EAST);
=======
        JButton northButton=new JButton("My Music Genre");
        JButton southButton=new JButton("Rap Music");




        MusicLayoutFrame.add(northButton,BorderLayout.NORTH);
        MusicLayoutFrame.add(southButton,BorderLayout.SOUTH);


>>>>>>> ba4e7dca50f571c75f75b987d0622036647bba60

        MusicLayoutFrame.setSize(750,800);


        MusicLayoutFrame.setVisible(true);

    }
}
