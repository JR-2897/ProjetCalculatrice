import javax.swing.*;
import java.awt.*;
//import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class MyFrame extends JFrame implements ActionListener{
	double nombre;
	String affich;
	static JFrame frame = new JFrame("JFrame Example");
	static JPanel panel = new JPanel();
	static JPanel numb = new JPanel();
	static JPanel op = new JPanel();
	static JPanel spe = new JPanel();
    static Dimension dim = new Dimension(40, 30);
	static JLabel ecran = new JLabel("0");
	
    JButton button = new JButton("Entrer"); 
    
    public MyFrame(){
    	init();
    }
    
	public void init(){
        //button.setText("Press me");
	    panel.setLayout(new FlowLayout());
	    
        //Tableau stockant les éléments à afficher dans la calculatrice
        String[] tab_string = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "=", "C", "+", "-", "*", "/"};
        String[] tab_spe = {"Moyenne", "Mediane", "Salaire Net -> Brut", "Salaire Brut -> Net", "Age", ";", "%"};
        //Un bouton par élément à afficher
        JButton[] tab_button = new JButton[tab_string.length];
        JButton[] button_spe = new JButton[tab_spe.length];
        

        ecran.setHorizontalAlignment(JLabel.RIGHT);
        ecran.setPreferredSize(new Dimension(290, 20));
        numb.setPreferredSize(new Dimension(150, 150));
        op.setPreferredSize(new Dimension(100,150));
        
        spe.setPreferredSize(new Dimension(300, 100));
        
        for(int i = 0; i < tab_button.length; ++i){
        	tab_button[i] = new JButton(tab_string[i]);
        	//tab_button[i].setPreferredSize(dim);
        	switch(i){
    			case 11:
    	        	//tab_button[i].setPreferredSize(dim);
    				numb.add(tab_button[i]);
    				tab_button[i].addActionListener(this);
    				break;
    			case 12:
    	        	//tab_button[i].setPreferredSize(dim);
    				op.add(tab_button[i]);
    				tab_button[i].addActionListener(this);
    				break;
    			case 13:
    	        	//tab_button[i].setPreferredSize(dim);
    				op.add(tab_button[i]);
    				tab_button[i].addActionListener(this);
    				break;
    			case 14:
    	        	//tab_button[i].setPreferredSize(dim);
    				op.add(tab_button[i]);
    				tab_button[i].addActionListener(this);
    				break;
    			case 15:
    	        	//tab_button[i].setPreferredSize(dim);
    				op.add(tab_button[i]);
    				tab_button[i].addActionListener(this);
    				break;
    			case 16:
    	        	//tab_button[i].setPreferredSize(dim);
    				op.add(tab_button[i]);
    				tab_button[i].addActionListener(this);
    				break;
    			default:
    				numb.add(tab_button[i]);
    				tab_button[i].addActionListener(this);
    				break;
        	}
        }
        
        for(int i = 0; i < button_spe.length; ++i){
        	button_spe[i] = new JButton(tab_spe[i]);
        	//tab_button[i].setPreferredSize(dim);
        	switch(i){
        	case 0:
        		spe.add(button_spe[i]);
				button_spe[i].addActionListener(this);
        		//Moy
        		break;
        	case 1:
        		spe.add(button_spe[i]);
				button_spe[i].addActionListener(this);
        		//Med
        		break;
        	case 2:
        		spe.add(button_spe[i]);
				button_spe[i].addActionListener(this);
        		//Salaire net/brut
        		break;
        	case 3:
        		spe.add(button_spe[i]);
				button_spe[i].addActionListener(this);
        		//Salaire brut/net
        		break;
        	case 4:
        		spe.add(button_spe[i]);
				button_spe[i].addActionListener(this);
        		break;
        		//Age
        	case 5:
        		spe.add(button_spe[i]);
				button_spe[i].addActionListener(this);
				//;
        	default:
        		op.add(button_spe[i]);
        		//%
        		break;
        	}
        }
        
        panel.add(ecran);
        panel.add(numb);
        panel.add(op);
        panel.add(button);
        panel.add(spe);
        
        frame.add(panel);
        frame.setSize(320, 350);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

	}


	//event section
	// /!\ code deguelasse /!\
	String nb_str;
	int nb1;
	String ope = "";
	double res;
	int[] nb_list = {};
	int base;
	String my_res;
	
	public void actionPerformed(ActionEvent arg0) {
		DecimalFormat f = new DecimalFormat();
		f.setMaximumFractionDigits(2);
		switch(((JButton)arg0.getSource()).getText()){
			case "+":
				ope = "+";
				nb1 = Integer.parseInt(ecran.getText());
				ecran.setText("0");
				break;
			case "-":
				ope = "-";
				nb1 = Integer.parseInt(ecran.getText());
				ecran.setText("0");
				break;
			case "*":
				ope = "*";
				nb1 = Integer.parseInt(ecran.getText());
				ecran.setText("0");
				break;
			case "/":
				ope = "/";
				nb1 = Integer.parseInt(ecran.getText());
				ecran.setText("0");
				break;
			case "=":
				if(ope != ""){
					switch(ope){
						case "+":
							res = Opérateur.addition(nb1, Integer.parseInt(ecran.getText()));
							f.format(res);
							ecran.setText(Double.toString(res));
							break;
						case "-":
							res = Opérateur.soustraction(nb1, Integer.parseInt(ecran.getText()));
							ecran.setText(Double.toString(res));
							break;
						case "*":
							res = Opérateur.multiplication(nb1, Integer.parseInt(ecran.getText()));
							ecran.setText(Double.toString(res));
							break;
						case "/":
							res = Opérateur.division(nb1, Integer.parseInt(ecran.getText()));
							ecran.setText(Double.toString(res));
							break;
					}
				}
				break;
			case ";":
				nb_list = MedMoy.Liste(nb_list, Integer.parseInt(ecran.getText()));
				ecran.setText("0");
				break;
			case "Moyenne":
				res = MedMoy.Moy(nb_list);
				ecran.setText(Double.toString(res));
				break;
			case "Mediane":
				res = MedMoy.Median(nb_list);
				ecran.setText(Double.toString(res));
				break;
			case "Salaire Brut -> Net":
				base = Integer.parseInt(ecran.getText());
				res = SalaireBrutNet.Annee(base);
				my_res = f.format(res);
				ecran.setText(my_res + "/ ");
				res = SalaireBrutNet.Mois(base);
				my_res = f.format(res);
				ecran.setText(ecran.getText() + my_res + "/ ");
				res = SalaireBrutNet.Journee(base);
				my_res = f.format(res);
				ecran.setText(ecran.getText() + my_res + "/ ");
				res = SalaireBrutNet.Heure(base);
				my_res = f.format(res);
				ecran.setText(ecran.getText() + my_res);
				break;
			case "Salaire Net -> Brut":
				base = Integer.parseInt(ecran.getText());
				res = SalaireNetBrut.Annee(base);
				my_res = f.format(res);
				ecran.setText(ecran.getText() + my_res + "/");
				res = SalaireNetBrut.Mois(base);
				my_res = f.format(res);
				ecran.setText(ecran.getText() + my_res + "/");
				res = SalaireNetBrut.Journee(base);
				my_res = f.format(res);
				ecran.setText(ecran.getText() + my_res + "/");
				res = SalaireNetBrut.Heure(base);
				my_res = f.format(res);
				ecran.setText(ecran.getText() + my_res);
				break;
			case "Age":
				break;
			default:
			    //Lorsque l'on clique sur le bouton, on met à jour le JLabel
				/*if(ecran.getText() == "0"){
					nb_str = "";
					ecran.setText(nb_str);
				}*/
				if(ecran.getText() == "0"){ecran.setText("");}
			    nb_str = ecran.getText()+((JButton)arg0.getSource()).getText();
			    //nb1 = Integer.parseInt(nb_str);
				ecran.setText(nb_str);
				break;
		}
	 }
	
}
