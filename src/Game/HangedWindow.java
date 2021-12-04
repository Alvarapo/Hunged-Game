package Game;

import Data.HangedDesign;
import Data.Player;
import Data.Word;
import Exception.NoLetterException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ÁLVARO ROFA ARANDA
 */
public class HangedWindow extends javax.swing.JFrame {
    private Word word;
    private Player player;
    private final HangedDesign hangedDesign;
    
    
    public HangedWindow() throws IOException {
        initComponents();
        this.hangedDesign = new HangedDesign();
        
        this.jtfWord.setEchoChar('*');
        this.jlbHideWord.setVisible(false);
        this.jlbLetraProhibida.setVisible(false);
        this.jlbLetrasProhibidasList.setVisible(false);
        this.jlbLetraAcertada.setVisible(false);
        this.jlbLetrasProhibidasList.setVisible(false);
        this.jlbLetrasAcertadasList.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jjlbWordText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtfWord = new javax.swing.JPasswordField();
        jlbHideWord = new javax.swing.JLabel();
        jlbLetraProhibida = new javax.swing.JLabel();
        jlbLetrasProhibidasList = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfNewLetter = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jjpPanel = new javax.swing.JPanel();
        jlbLetraAcertada = new javax.swing.JLabel();
        jlbLetrasAcertadasList = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hanged Game");
        setResizable(false);

        jLabel1.setText("Player Name: ");

        jjlbWordText.setText("Word: ");

        jButton1.setText("Play");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlbHideWord.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jlbHideWord.setText("PLABRA OCULTA");

        jlbLetraProhibida.setText("Letra Prohibida: ");

        jLabel2.setText("Nueva Letra: ");

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jjpPanelLayout = new javax.swing.GroupLayout(jjpPanel);
        jjpPanel.setLayout(jjpPanelLayout);
        jjpPanelLayout.setHorizontalGroup(
            jjpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );
        jjpPanelLayout.setVerticalGroup(
            jjpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        jlbLetraAcertada.setText("Aciertos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfNewLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbLetraAcertada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbLetrasAcertadasList, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbLetraProhibida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbLetrasProhibidasList, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jjlbWordText)
                    .addComponent(jLabel1))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfWord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jjpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jlbHideWord)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jjlbWordText)
                    .addComponent(jButton1)
                    .addComponent(jtfWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbHideWord))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jjpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNewLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbLetraProhibida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbLetrasProhibidasList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbLetraAcertada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbLetrasAcertadasList, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!this.jtfName.getText().equals("") && !this.jtfWord.getText().equals("")) {
            try {
                this.play();
            } catch (IOException ex) {
                Logger.getLogger(HangedWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this,"Name y Word no pueden estar vacíos" , "Error: ",0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            /**
             * Si se adivina, no pasa nada y se muestran las nuevas variaciones
             */            
            if(this.word.guessALetter(this.jtfNewLetter.getText().toUpperCase().charAt(0))){
                showWord();
                player.addGuessed(this.jtfNewLetter.getText().toUpperCase().charAt(0));                
                this.jlbLetrasAcertadasList.setText(String.valueOf(player.getGuessedLetters()).toUpperCase());
                if(this.isCorrect()){
                    JOptionPane.showMessageDialog(this, "HAS ADIVINADO LA PALABRA OCULTA");
                    this.restartGame();
                }
            }
        } catch (NoLetterException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() , "FALLO: ",1);
            this.jjpPanel.add(hangedDesign);     
            this.jjpPanel.repaint();  
            player.addFailed(this.jtfNewLetter.getText().charAt(0));
            this.jlbLetrasProhibidasList.setText(String.valueOf(player.getFailedLetters()).toUpperCase());
            if(player.isDead()){
                JOptionPane.showMessageDialog(this, "HAS PERDIDO");
                this.jlbHideWord.setText(this.word.getWord());
                try {
                    this.restartGame();
                } catch (IOException ex1) {
                    Logger.getLogger(HangedWindow.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() , "ERROR INESPERADO: ", 0);
        }finally{            
            this.jtfNewLetter.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public boolean isCorrect(){
        for (int i = 0; i < this.word.getGuessedWord().length; i++) {
            if(this.word.getGuessedWord()[i] == false){
                return false;
            }
        }
        return true;
    }
    
    public void restartGame() throws IOException{
        new HangedWindow().setVisible(true);
    }
    
    public void showWord(){
        String show = "";
        for (int i = 0; i < word.getWord().length(); i++) {
            /**
             * Si la letra está desbloqueada, la muestro, sino, muestro asterisco
             */
            if(word.getGuessedWord()[i] == true){
                show += word.getLetters()[i];
            }else{
                show += "*";
            }
        }
        
        this.jlbHideWord.setText(show);
    }
    
    public void play() throws IOException{
        this.player = new Player(this.jtfName.getText());
        this.jtfName.setEditable(false);
        this.setWord(this.jtfWord.getText());
        this.jtfWord.setVisible(false);
        this.jButton1.setVisible(false);
        this.jjlbWordText.setVisible(false);
        this.jlbLetraProhibida.setVisible(true);
        this.jlbLetrasProhibidasList.setVisible(true);
        this.jlbLetrasAcertadasList.setVisible(true);
        this.jlbHideWord.setVisible(true);
        this.jlbLetraAcertada.setVisible(true);
        this.showWord();
        this.jjpPanel.add(hangedDesign);
        this.jjpPanel.repaint();
    }
    
     public void setWord(String word){
        this.word = new Word(word);
    }

    public static void main(String[] args) throws NoLetterException, IOException {
        new HangedWindow().setVisible(true);
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jjlbWordText;
    private javax.swing.JPanel jjpPanel;
    private javax.swing.JLabel jlbHideWord;
    private javax.swing.JLabel jlbLetraAcertada;
    private javax.swing.JLabel jlbLetraProhibida;
    private javax.swing.JLabel jlbLetrasAcertadasList;
    private javax.swing.JLabel jlbLetrasProhibidasList;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfNewLetter;
    private javax.swing.JPasswordField jtfWord;
    // End of variables declaration//GEN-END:variables
}
