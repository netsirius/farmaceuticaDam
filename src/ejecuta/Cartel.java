/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;


import java.awt.*;

import java.awt.event.*;
import java.awt.geom.*;
import java.util.logging.*;
import javax.swing.*;


public class Cartel extends javax.swing.JPanel {

    private int grados = 0;
    private int xOrigen = 145-85;
    private int x2 = 155-65;
    private int yOrigen = 225-85;
    private int y2 = 155-65;
    static boolean salir=false;
    public Cartel(){
        
        addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
			public void keyReleased(KeyEvent e) {

                        }
                        public void keyPressed(KeyEvent e) {
                        if (e.getKeyCode() == KeyEvent.VK_ENTER){
                            salir=true;
                        }
                        
			
                }
		});
		setFocusable(true);
    }
    
    public void paint(Graphics g) {
        try {
            Thread.sleep(120);
            x2+=10;
            if(x2>400)x2=-200;
        
        super.paint(g); //se borra el contenido anterior
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);
        
//        g2d.setColor(Color.BLACK);
        
        g2d.setFont(new Font("Verdana", Font.BOLD, 55));
        g2d.setColor(Color.white);
        g2d.fillOval(x2, y2+20, 13, 13);
        g2d.fillOval(x2+20, y2+20, 13, 13);
        g2d.fillOval(x2+40, y2+20, 13, 13);
        g2d.fillOval(x2+60, y2+20, 13, 13);
        g2d.fillOval(x2+80, y2+20, 13, 13);
        g2d.fillOval(x2+100, y2+20, 13, 13);
        g2d.fillOval(x2+120, y2+20, 13, 13);
        g2d.fillOval(x2+140, y2+20, 13, 13);
        g2d.fillOval(x2+160, y2+20, 13, 13);
        g2d.fillOval(x2+180, y2+20, 13, 13);
        g2d.fillOval(x2+200, y2+20, 13, 13);
      
        
        g2d.drawString("BAYER",x2, y2);
        g2d.setFont(new Font("Verdana", Font.PLAIN, 15));
        g2d.setColor(Color.white);
        g2d.drawString("PULSE ENTER PARA EMPEZAR", 215-125, 200-55);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cartel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void dibujar(){
       Cartel juego=new Cartel();
       Color darkgreen=new Color(0,100,0);
       JFrame frame=new JFrame("FARMACIA");
       juego.setBackground(Color.red);
       frame.add(juego);
       frame.setSize(430,200);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       while(salir==false){
           juego.repaint();
       }
       frame.dispose();
    }
}

