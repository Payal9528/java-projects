
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.ArrayDeque;

public class BubbleShooter extends JFrame {
    public BubbleShooter() {
        setTitle("Bubble Shooter (Java Swing)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        GamePanel panel = new GamePanel(640, 800);
        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BubbleShooter::new);
    }

    static class GamePanel extends JPanel implements MouseMotionListener, MouseListener, ActionListener {
        private final int W, H;
        private final int COLS = 12, ROWS = 16, CELL = 44, RADIUS = 20, TOP_OFFSET = 60;
        private final double SHOOT_SPEED = 8.0;
        private final Color[] PALETTE = {
            new Color(220,20,60), new Color(0,128,255),
            new Color(60,179,113), new Color(255,165,0),
            new Color(148,0,211)
        };

        private Bubble[][] grid = new Bubble[ROWS][COLS];
        private Bubble current, next;
        private Point mouse = new Point();
        private boolean isShooting = false;
        private javax.swing.Timer timer;
        private boolean gameOver = false;
        private int score = 0;

        public GamePanel(int w, int h) {
            this.W = w; this.H = h;
            setPreferredSize(new Dimension(W,H));
            setBackground(new Color(22,26,32));
            addMouseMotionListener(this);
            addMouseListener(this);
            timer = new javax.swing.Timer(16, this); // 60 FPS
            timer.start();
            initGrid();
            prepareBubbles();
        }

        // ... (rest of the code same as before, with flood-fill, snap, collision, etc.)
    }

    static class Bubble {
        int x,y,vx=0,vy=0,row,col; Color color; boolean inGrid;
        public Bubble(int x,int y,Color c,int r,int c2,boolean g){
            this.x=x;this.y=y;this.color=c;this.row=r;this.col=c2;this.inGrid=g;
        }
        public void draw(Graphics2D g2){
            g2.setColor(color);
            g2.fillOval(x-20,y-20,40,40);
            g2.setColor(new Color(255,255,255,160));
            g2.fillOval(x-12,y-16,16,10);
            g2.setColor(new Color(255,255,255,40));
            g2.setStroke(new BasicStroke(2f));
            g2.drawOval(x-20,y-20,40,40);
        }
    }
}
