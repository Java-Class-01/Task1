package org.example;

import javax.swing.*;
import java.awt.*;

public class MusicLayout {
    public MusicLayout() {
        JFrame MusicLayoutFrame=new JFrame("Music PlayList");
        JFrame.setDefaultLookAndFeelDecorated(true);

        MusicLayoutFrame.setLayout(new BorderLayout());

//        JLabel northLabel=new JLabel("My Music Genre");

        JButton northButton=new JButton("My Music Genre");
        JButton southButton=new JButton("Rap Music");




        MusicLayoutFrame.add(northButton,BorderLayout.NORTH);
        MusicLayoutFrame.add(southButton,BorderLayout.SOUTH);



        MusicLayoutFrame.setSize(750,800);


        MusicLayoutFrame.setVisible(true);

    }
}
