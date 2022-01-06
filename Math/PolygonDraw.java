package SimpleCalc.Math;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PolygonDraw {

    private JFrame mainMap;
    private Polygon poly;

    public PolygonDraw() {

        System.out.println("INICIANDO UM NOVO TESTE");
        initComponents();

    }

    private void initComponents() {

        mainMap = new JFrame();
        mainMap.setResizable(false);
        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int xCentro = 200;
        int yCentro = 200;
        int[] pos = new int[8];
        int posAct = 360/pos.length;
        for(int i=0; i < pos.length; i++){
            pos[i] = posAct*i;
        }
        int[] valor = new int[8];
        valor[0] = 100;
        valor[1] = 100;
        valor[2] = 100;
        valor[3] = 100;
        valor[4] = 100;
        valor[5] = 100;
        valor[6] = 100;
        valor[7] = 100;
        
        int[] xPoly = new int[8];
        int[] yPoly = new int[8];
        for(int i=0; i<xPoly.length;i++){
            System.out.println("pos:"+pos[i]);
            if(pos[i]>270 || pos[i]<90){
                System.out.println("teste-1");
                yPoly[i] = yCentro - (int)Math.round((Math.cos(pos[i]) * valor[i]));
            }else if(pos[i]!=270 && pos[i]!=90){
                System.out.println("teste-2");
                yPoly[i] = yCentro - (int)Math.round((Math.cos(pos[i]) * valor[i]));
            }else{
                System.out.println("teste-3");
                yPoly[i] = yCentro;
            }
            if(pos[i]>0 || pos[i]<180){
                xPoly[i] = xCentro + ((int)Math.round(Math.sin(pos[i])) * valor[i]);
            }else if(pos[i]<360 || pos[i]>180){
                xPoly[i] = xCentro - ((int)Math.round(Math.sin(pos[i])) * valor[i]);
            }else{
                xPoly[i] = xCentro ;
            }
            System.out.println("Y:"+yPoly[i]+"\n");
        }

        poly = new Polygon(xPoly, yPoly, xPoly.length);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.drawPolygon(poly);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(800, 600);
            }
        };
        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PolygonDraw();
            }
        });
    }
}