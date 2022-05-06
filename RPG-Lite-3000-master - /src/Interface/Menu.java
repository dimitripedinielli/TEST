package Interface;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Menu extends JFrame implements ActionListener 
{  
   private ButtonGroup group;
   private ButtonGroup group1;
   private static JButton btnE;

   private static void init() 
   {
      //créer un frame
      JFrame frame = new Menu();
 
      //Affichez le frame.
      frame.pack();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Scene j = new Scene();
      JFrame jf =new JFrame();
      JFrame v =new JFrame();
      Victory vv = new Victory();
      JButton jButton1 = new JButton("Continuer");
      jButton1.setBounds(200,280, 50, 30);
        
      jf.setContentPane(j);
      jf.add(jButton1);
      v.setContentPane(vv);

        frame.setBounds(600, 600, 750, 450);
        frame.setTitle("mini-RPG-lite-3000");
        
        v.setBounds(600, 600, 750, 450);
        v.setTitle("|| - WIN - ||");
        

        jf.setBounds(600, 600, 750, 450);
        jf.setTitle("mini-RPG-lite-3000");

        btnE.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                jf.setVisible(true);
            }
        });
        jButton1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jf.setVisible(false);
                v.setVisible(true);
            }
        });
        
        

        
   }


   
 
   /*public static void main(String[] args) {
      //créer et afficher l'interface graphique
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            init();
         }
      });
   }
   */
   public Menu() 
   {
      // définir la disposition du flux pour le frame
      this.getContentPane().setLayout(new FlowLayout());
 
      JRadioButton btn1 = new JRadioButton("1");
      btn1.setActionCommand("1");
 
      JRadioButton btn2 = new JRadioButton("2");
      btn2.setActionCommand("2");
 
      JRadioButton btn3 = new JRadioButton("3");
      btn3.setActionCommand("3");
    
      btn1.setSelected(true);
    
      
      group = new ButtonGroup();
 
      //ajouter des boutons radio
      group.add(btn1);
      group.add(btn2);
      group.add(btn3);
 
      add(btn1);
      add(btn2);
      add(btn3);
      
       
 
        JRadioButton btnA = new JRadioButton("Hunter");
        btnA.setActionCommand("Hunter");
   
        JRadioButton btnB = new JRadioButton("Mage");
        btnB.setActionCommand("Mage");
   
        JRadioButton btnC = new JRadioButton("Healer");
        btnC.setActionCommand("Healer");

        JRadioButton btnD = new JRadioButton("Warrior");
        btnD.setActionCommand("Warrior");
      
        btnA.setSelected(true);
      
        
        group1 = new ButtonGroup();
   
        //ajouter des boutons radio
        group1.add(btnA);
        group1.add(btnB);
        group1.add(btnC);
        group1.add(btnD);
   
        add(btnA);
        add(btnB);
        add(btnC);
        add(btnD);

        btnE = new JButton("Valider");
        add(btnE);
        btnE.addActionListener(this);
        
   }
   public String[] choix(String nbheros, String classheros) {
    System.out.println(nbheros +" / "+ classheros);
    String [] res = {nbheros,classheros};
    
    return res;
   }
 
 
   @Override
public void actionPerformed(ActionEvent e) {
   String nbheros;
   String classheros;
   if (e.getActionCommand().equals("Valider")) {
     if(group.getSelection().getActionCommand().equals("1")){
         

         
         if(group1.getSelection().getActionCommand().equals("Hunter")){

             System.out.println(group.getSelection().getActionCommand()+ " / " + group1.getSelection().getActionCommand());

             classheros = group1.getSelection().getActionCommand();
             nbheros = group.getSelection().getActionCommand();

         }
         else if(group1.getSelection().getActionCommand().equals("Mage")){
             
             System.out.println(group.getSelection().getActionCommand()+ " / " + group1.getSelection().getActionCommand());

             classheros = group1.getSelection().getActionCommand();
             nbheros = group.getSelection().getActionCommand();
             choix(nbheros, classheros);
             
         }

         else if(group1.getSelection().getActionCommand().equals("Healer")){

             System.out.println(group.getSelection().getActionCommand()+ " / " + group1.getSelection().getActionCommand());

             classheros = group1.getSelection().getActionCommand();
             nbheros = group.getSelection().getActionCommand();

            choix(nbheros, classheros);
         }
         else if(group1.getSelection().getActionCommand().equals("Warrior")){
             
             System.out.println(group.getSelection().getActionCommand()+ " / " + group1.getSelection().getActionCommand());

             classheros = group1.getSelection().getActionCommand();
             nbheros = group.getSelection().getActionCommand();

            choix(nbheros, classheros);
         }
     }
     else if(group.getSelection().getActionCommand().equals("2")){
         // nb héros 2
         
         
         if(group1.getSelection().getActionCommand().equals("Hunter")){
             
             System.out.println(group.getSelection().getActionCommand()+ " / " + group1.getSelection().getActionCommand());

             classheros = group1.getSelection().getActionCommand();
             nbheros = group.getSelection().getActionCommand();

            choix(nbheros, classheros);
         }
         else if(group1.getSelection().getActionCommand().equals("Mage")){
             
             System.out.println(group.getSelection().getActionCommand()+ " / " + group1.getSelection().getActionCommand());

             classheros = group1.getSelection().getActionCommand();
             nbheros = group.getSelection().getActionCommand();

            choix(nbheros, classheros);
         }

         else if(group1.getSelection().getActionCommand().equals("Healer")){
             
             System.out.println(group.getSelection().getActionCommand()+ " / " + group1.getSelection().getActionCommand());

             classheros = group1.getSelection().getActionCommand();
             nbheros = group.getSelection().getActionCommand();

            choix(nbheros, classheros);
         }
         else if(group1.getSelection().getActionCommand().equals("Warrior")){
             
             System.out.println(group.getSelection().getActionCommand()+ " / " + group1.getSelection().getActionCommand());

             classheros = group1.getSelection().getActionCommand();
             nbheros = group.getSelection().getActionCommand();

            choix(nbheros, classheros);
         }
     }
     else if(group.getSelection().getActionCommand().equals("3")){
         
         // nb héros 3
         

         if(group1.getSelection().getActionCommand().equals("Hunter")){
             
             System.out.println(group.getSelection().getActionCommand()+ " / " + group1.getSelection().getActionCommand());

             classheros = group1.getSelection().getActionCommand();
             nbheros = group.getSelection().getActionCommand();

            choix(nbheros, classheros);
         }
         else if(group1.getSelection().getActionCommand().equals("Mage")){
             
             System.out.println(group.getSelection().getActionCommand()+ " / " + group1.getSelection().getActionCommand());

             classheros = group1.getSelection().getActionCommand();
             nbheros = group.getSelection().getActionCommand();

            choix(nbheros, classheros);
         }

         else if(group1.getSelection().getActionCommand().equals("Healer")){
             
             System.out.println(group.getSelection().getActionCommand()+ " / " + group1.getSelection().getActionCommand());

             classheros = group1.getSelection().getActionCommand();
             nbheros = group.getSelection().getActionCommand();

             choix(nbheros, classheros);
         }
         else if(group1.getSelection().getActionCommand().equals("Warrior")){
             
             System.out.println(group.getSelection().getActionCommand()+ " / " + group1.getSelection().getActionCommand());

             classheros = group1.getSelection().getActionCommand();
             nbheros = group.getSelection().getActionCommand();

            choix(nbheros, classheros);
         }
     }
   }
   
}

}