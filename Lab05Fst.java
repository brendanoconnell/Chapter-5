// Lab05Fst.java
// This is the student, starting version of Lab 05F which is divided into 8 cells.
// The first cell -- "Draw Red Horizontal Lines" -- is provided as an example.
// Students need to complete the other 7 cells on their own.

import java.awt.*;
import java.applet.*;

public class Lab05Fst extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        Expo.drawLine(g,250,0,250,650);
        Expo.drawLine(g,500,0,500,650);
        Expo.drawLine(g,750,0,750,650);
        Expo.drawLine(g,0,325,1000,325);

        int x1, y1, x2, y2, x, y, r;

        // Draw Red Horizontal Lines
        Expo.setColor(g,Expo.red);
        x1 = 0;
        y1 = 5;
        x2 = 250;
        y2 = 5;
        for (int j = 1; j <= 32; j++)
        {
            Expo.drawLine(g,x1,y1,x2,y2);
            y1 += 10;
            y2 += 10;
        }


        // Draw Blue Vertical Lines
        Expo.setColor(g,Expo.blue);
        int a1 = 255;
        int b1 = 0;
        int a2 = 255;
        int b2 = 325;
        
        for (int temp1 = 1; temp1 <= 25; temp1++) {
            Expo.drawLine(g,a1,b1,a2,b2);
            a1 += 10;
            a2 += 10;
            
        }

        // Draw Gray Diagonal Dots
            Expo.setColor(g,Expo.grey);
            int c = 505;
            int d = 260;
            
            for (int temp3 = 1; temp3 <= 24; temp3++){
                Expo.drawPoint(g,c,d);
                
                c += 10;
                d -= 10;
            }
        // Draw Green Concentric Circles
            Expo.setColor(g,Expo.green);
            int e = 875;
            int f = 163;
            int rad1 = 10;
            
            for (int temp3 = 1; temp3 <= 12; temp3++){
                Expo.drawCircle(g,e,f,rad1);
                
                rad1 += 10;
            }


        // Draw Purple Concentric Ovals
            Expo.setColor(g,Expo.purple);
           int h = 125;
           int i = 480;
           int j = 5;
           int k = 10;
           
           for (int temp4 = 1; temp4 <= 20; temp4++){
               Expo.drawOval(g, h, i, j, k);
               
               j += 6;
               k += 7;
            }
        // Draw Pink Concentric Arcs
            Expo.setColor(g, Expo.pink);
          int l = 255;
          int m = 645;
          int n = 10;
          int o = 20;
            
            
            for (int temp5 = 1; temp5 <= 19; temp5++){
                Expo.drawArc(g, l, m, n, o, 0, 90);
                
                n += 12;
                o += 15;
            }

        // Draw Brown Concentric Rectangles
           // int p =




        // Draw Gold Sphere





    }
}




