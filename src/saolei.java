import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.EventListener;

public class saolei extends MouseAdapter {
    private JFrame mainFrame;
    private int[][] data;
    private JButton[][] buttons;
    private JButton startJB;
    private Label l;
    private int row;
    private  int col;
    private int mineNumber;
    private int mineCount;
    private boolean isOver;
    public saolei(){
        row=15;
        col=15;
        mainFrame =new JFrame("扫雷v1.0");
        data=new int [row][col];
        buttons=new JButton[row][col];
        startJB=new JButton("start");
        l=new Label("welcome tp saolei");
        mineNumber=row*col/7;
    }
    public void init(){
        JPanel north=new JPanel();
        JPanel center=new JPanel();
        JPanel south=new JPanel();
        north.setLayout(new FlowLayout());
        center.setLayout(new FlowLayout());
        south.setLayout(new GridLayout(row,col,4,4));
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(north,BorderLayout.NORTH);
        mainFrame.add(center,BorderLayout.CENTER);
        mainFrame.add(south,BorderLayout.SOUTH);
        north.add(l);
        startJB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        buttons[i][j].setText(" ");
                        buttons[i][j].setBackground(Color.WHITE);
                        data[i][j]=0;
                        isOver=false;
                    }
                }
                hashMine();
                mineCount=0;
                l.setText("let's go!");
            }
        });
        center.add(startJB);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                buttons[i][j]=new JButton(" ");
                buttons[i][j].setName((i+":"+j));
                buttons[i][j].setBackground(Color.WHITE);
                buttons[i][j].addMouseListener(this);
                south.add(buttons[i][j]);
            }
        }
        hashMine();
    }
    public void start(){
        mainFrame.setSize(800,600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
    public void hashMine(){
        for(int i=0;i<mineNumber;i++){
            data[(int)(Math.random()*row)][(int)(Math.random()*col)]=-1;
        }
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (data[i][j]==-1)
                    continue;
                int sum=0;
                for (int m=-1;m<=1;m++){
                    for(int n=-1;n<=1;n++){
                        if(i+m>=0&&j+n>=0&&i+m<row&&j+n<col){
                            if(data[i+m][j+n]==-1)
                                sum++;
                        }
                    }
                }
                data[i][j]=sum;
            }
        }
    }
    private void gameOver(boolean over) {
        if (over == true) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (data[i][j] == -1) {
                        buttons[i][j].setText("M");
                        buttons[i][j].setBackground(Color.RED);
                    }
                }
            }
            l.setText("-_-");
            isOver = true;
            return;
        }
        int sumPress = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!buttons[i][j].getText().equals(" ")) {
                    sumPress++;
                }
            }
        }
        if (sumPress == row * col) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (data[i][j] == -1 && buttons[i][j].getText().equals("M")) {
                        sum++;
                    }
                }
            }
            if (sum >= mineNumber) {
                System.out.println(mineNumber);
                l.setText("^-^");
            }
        }
    }
    public void mousePressed(MouseEvent e) {
        try {
            if (isOver)
                return;
            if (e.getButton() == MouseEvent.BUTTON3) {
                JButton jb = (JButton) e.getSource();
                if (jb.getText().equals("M")) {
                    jb.setText(" ");
                    mineCount--;
                    jb.setBackground(Color.WHITE);
                } else {
                    if (mineCount < mineNumber) {
                        jb.setText("M");
                        jb.setBackground(Color.BLUE);
                        mineCount++;
                    } else {
                        l.setText("the mine flag is over");
                    }
                }
            } else {
                JButton jb = (JButton) e.getSource();
                mousePressed(jb);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        gameOver(false);
    }
    public void mousePressed(JButton jb){
        String str[]=jb.getName().split(":");
        int i= Integer.parseInt(str[0]);
        int j= Integer.parseInt(str[1]);
        if (data[i][j]==-1){
            gameOver(true);
            return;
        }else {
            jb.setText(data[i][j]+"");
            jb.setBackground(Color.yellow);
            if(data[i][j]==0){
                for(int m=-1;m<=1;m++){
                    for (int n=-1;n<=1;n++){
                        if(i+m>=0&&j+n>=0&&i+m<row&&j+n<col)
                        {
                            if(buttons[i+m][j+n].getText().equals(""))
                                mousePressed(buttons[i+m][j+n]);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        saolei mine=new saolei();
        mine.init();
        mine.start();
    }
}
