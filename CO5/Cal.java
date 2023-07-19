import java.awt.*;
import java.awt.event.*;

class Cal extends Frame implements ActionListener{
    TextField inp;
    Panel p;
    String bs[] ={    "1","2","3","+",
                    "4","5","6","-",
                    "7","8","9","*",
                    "C","0","/","=",
    };
    Button b[] = new Button[16];
    int n1, n2, result;
    String opr;
    
    public Cal(){
        inp = new TextField(20);
        p = new Panel();
        add(inp, "North");
        add(p, "Center");
        p.setLayout(new GridLayout(4,4));
        for(int i=0; i<16;i++){
            b[i] = new Button(bs[i]);
            b[i].addActionListener(this);
            p.add(b[i]);
        }
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
        if(str.equals("+")){
            opr = "+";
            n1 = Integer.parseInt(inp.getText());
            inp.setText("");
        }
        else if(str.equals("-")){
            opr = "-";
            n1 = Integer.parseInt(inp.getText());
            inp.setText("");
        }
        else if(str.equals("*")){
            opr = "*";
            n1 = Integer.parseInt(inp.getText());
            inp.setText("");
        }
        else if(str.equals("/")){
            opr = "/";
            n1 = Integer.parseInt(inp.getText());
            inp.setText("");
        }
        else if(str.equals("=")){
            n2 = Integer.parseInt(inp.getText());
            switch(opr){
                case "+":
                    result = n1 + n2;
                    break;
                case "-":
                    result = n1 - n2;
                    break;
                case "*":
                    result = n1 * n2;
                    break;
                case "/":
                    result = n1 / n2;
                    break;
            }
            inp.setText(String.valueOf(result));
        }
        else if(str.equals("C")){
            inp.setText("");
            n1=n2=result=0;
        }
        else{
            inp.setText(inp.getText() + str);
        }
    }
    public static void main(String[] args) {
        Cal c = new Cal();
        c.setTitle("Calculator");
        c.setSize(500, 500);
        c.setVisible(true);
    }
}