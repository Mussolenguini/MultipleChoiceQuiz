/*
 * Evan Robertson
 * Octiber 12th 2018
 * quiz.java
 * Creates a gui program that tests the user on tehir computer knowledge
 */

/**
 *
 * @author evrob0095
 */
public class quiz extends javax.swing.JFrame {

    //Global Variables
    int pageNum = 0;
    int correctAnswers = 0;
    int incorrectAnswers = 0;
    final int QUESTION_COUNT = 5;
    double percCorrect;
    
    
    
    public quiz() {
        initComponents();
        
        //Setup Buttons for Quiz
        submitButton.setVisible(false);
        userInput.setVisible(false);
        nextQuestionButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        instructionLabel1 = new javax.swing.JLabel();
        instructionLabel2 = new javax.swing.JLabel();
        instructionLabel3 = new javax.swing.JLabel();
        instructionLabel4 = new javax.swing.JLabel();
        instructionLabel5 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        questions = new javax.swing.JPanel();
        answerDLabel = new javax.swing.JLabel();
        questionTitleLabel = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        answerALabel = new javax.swing.JLabel();
        answerBLabel = new javax.swing.JLabel();
        answerCLabel = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        nextQuestionButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        correctLabel = new javax.swing.JLabel();
        incorrectLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        Results = new javax.swing.JPanel();
        scoreLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setBackground(new java.awt.Color(102, 102, 255));
        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Vineta BT", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 153, 0));
        titleLabel.setText("Computer Programming Quiz");
        Home.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        instructionLabel1.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        instructionLabel1.setForeground(new java.awt.Color(255, 153, 0));
        instructionLabel1.setText("Answer each question by inputting the");
        Home.add(instructionLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        instructionLabel2.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        instructionLabel2.setForeground(new java.awt.Color(255, 153, 0));
        instructionLabel2.setText("To start the quiz, click the start button below.");
        Home.add(instructionLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        instructionLabel3.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        instructionLabel3.setForeground(new java.awt.Color(255, 153, 0));
        instructionLabel3.setText("to take you to the next question.");
        Home.add(instructionLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        instructionLabel4.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        instructionLabel4.setForeground(new java.awt.Color(255, 153, 0));
        instructionLabel4.setText(" letter into the text box below the question.");
        Home.add(instructionLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        instructionLabel5.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        instructionLabel5.setForeground(new java.awt.Color(255, 153, 0));
        instructionLabel5.setText("When an answer has been entered a button will appear");
        Home.add(instructionLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        startButton.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        startButton.setText("Start Quiz!");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        Home.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 579, 320));

        questions.setBackground(new java.awt.Color(102, 102, 255));
        questions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        answerDLabel.setBackground(new java.awt.Color(255, 255, 255));
        answerDLabel.setFont(new java.awt.Font("Vrinda", 0, 24)); // NOI18N
        answerDLabel.setForeground(new java.awt.Color(255, 153, 0));
        answerDLabel.setText("D. 0000001");
        questions.add(answerDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        questionTitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        questionTitleLabel.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 24)); // NOI18N
        questionTitleLabel.setForeground(new java.awt.Color(255, 153, 0));
        questionTitleLabel.setText("Question");
        questions.add(questionTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 20));

        questionLabel.setBackground(new java.awt.Color(255, 255, 255));
        questionLabel.setFont(new java.awt.Font("Vrinda", 0, 24)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(255, 153, 0));
        questionLabel.setText("What is 153 in binary?");
        questions.add(questionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, 30));

        answerALabel.setBackground(new java.awt.Color(255, 255, 255));
        answerALabel.setFont(new java.awt.Font("Vrinda", 0, 24)); // NOI18N
        answerALabel.setForeground(new java.awt.Color(255, 153, 0));
        answerALabel.setText("A. 01101011");
        questions.add(answerALabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        answerBLabel.setBackground(new java.awt.Color(255, 255, 255));
        answerBLabel.setFont(new java.awt.Font("Vrinda", 0, 24)); // NOI18N
        answerBLabel.setForeground(new java.awt.Color(255, 153, 0));
        answerBLabel.setText("B. 10011001");
        questions.add(answerBLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        answerCLabel.setBackground(new java.awt.Color(255, 255, 255));
        answerCLabel.setFont(new java.awt.Font("Vrinda", 0, 24)); // NOI18N
        answerCLabel.setForeground(new java.awt.Color(255, 153, 0));
        answerCLabel.setText("C. 01101101");
        questions.add(answerCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        userInput.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        userInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputActionPerformed(evt);
            }
        });
        questions.add(userInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 80, 30));

        nextQuestionButton.setText("Next Question");
        nextQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionButtonActionPerformed(evt);
            }
        });
        questions.add(nextQuestionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        questions.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 100, -1));

        correctLabel.setBackground(new java.awt.Color(255, 255, 255));
        correctLabel.setFont(new java.awt.Font("Vrinda", 0, 24)); // NOI18N
        correctLabel.setForeground(new java.awt.Color(255, 153, 0));
        correctLabel.setText("Correct Answers: 0");
        questions.add(correctLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        incorrectLabel.setBackground(new java.awt.Color(255, 255, 255));
        incorrectLabel.setFont(new java.awt.Font("Vrinda", 0, 24)); // NOI18N
        incorrectLabel.setForeground(new java.awt.Color(255, 153, 0));
        incorrectLabel.setText("Incorrect Answers: 0");
        questions.add(incorrectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        errorLabel.setBackground(new java.awt.Color(255, 255, 255));
        errorLabel.setFont(new java.awt.Font("Vrinda", 0, 24)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 153, 0));
        errorLabel.setText("Enter A,B,C Or D");
        questions.add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        getContentPane().add(questions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 320));

        Results.setBackground(new java.awt.Color(102, 102, 255));
        Results.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scoreLabel.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 24)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 153, 0));
        scoreLabel.setText("You Got a Score of:");
        Results.add(scoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        resultLabel.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 24)); // NOI18N
        resultLabel.setForeground(new java.awt.Color(255, 153, 0));
        resultLabel.setText("Results");
        Results.add(resultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        messageLabel.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 18)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(255, 153, 0));
        messageLabel.setText("text text text text text");
        Results.add(messageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        getContentPane().add(Results, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        
        //Happens when start button is clicked
        Home.setVisible(false);
        pageNum = pageNum + 1;
        submitButton.setVisible(true);
        userInput.setVisible(true);
        nextQuestionButton.setVisible(true);
        nextQuestionButton.setEnabled(false);
        errorLabel.setVisible(false);
        
        
    }//GEN-LAST:event_startButtonActionPerformed

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputActionPerformed

    private void nextQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestionButtonActionPerformed
        
        //Random Number Variables
        int randomNumber1 = (int)Math.round(Math.random()*200+1);
        int randomNumber2 = (int)Math.round(Math.random()*200+1);
        int randomNumber3 = (int)Math.round(Math.random()*200+1);
        
        
        //Increase Page number and hide potental error from last question
        pageNum = pageNum + 1;
        errorLabel.setVisible(false);
        
        //Reset User input aera and renable submit button
        userInput.setText("");
        userInput.setEnabled(true);
        submitButton.setEnabled(true);
        nextQuestionButton.setEnabled(false);
        
        
        //Check what question user is on
        if (pageNum == 2) {
            questionLabel.setText("What is 83 in Octal?");
            answerALabel.setText("A. " + randomNumber1);
            answerBLabel.setText("B. " + randomNumber2);
            answerCLabel.setText("C. 123");
            answerDLabel.setText("D. " + randomNumber3);
        }
        
        if (pageNum == 3) {
            questionLabel.setText("What company created Java?");
            answerALabel.setText("A. Mojang");
            answerBLabel.setText("B. Microsoft");
            answerCLabel.setText("C. Java Applications");
            answerDLabel.setText("D. Sun Micosystems");
        }
        
        if (pageNum == 4) {
            questionLabel.setText("Java refers to a buttton as a:"); 
            answerALabel.setText("A. JButton");
            answerBLabel.setText("B. JLabel");
            answerCLabel.setText("C. JPanel");
            answerDLabel.setText("D. JStonePressurePlate");
        }
        
        if (pageNum == 5) {
            questionLabel.setText("What do you first"); 
            answerALabel.setText("A. Submit the project");
            answerBLabel.setText("B. Code");
            answerCLabel.setText("C. Eat a bagel");
            answerDLabel.setText("D. Plan");
            nextQuestionButton.setText("      Results      ");
        }
        
        //This page is the results page and it calculates score
        if (pageNum == 6) {
            questions.setVisible(false);
            submitButton.setVisible(false);
            userInput.setVisible(false);
            nextQuestionButton.setVisible(false);
            percCorrect = ((double)correctAnswers/(double)QUESTION_COUNT)*100;
            scoreLabel.setText("You got a score of: " + percCorrect + "%");
            
            //Check if user failed the test
            if (percCorrect < 50) {
                messageLabel.setText("Unfortunatley you failed the quiz");
            }
            else {
                messageLabel.setText("Congrats you passed!");
            }
        }
        
    }//GEN-LAST:event_nextQuestionButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        //Get user's answer
        String guess = userInput.getText();
        
        //disable input and submit and enable next question
        userInput.setEnabled(false);
        submitButton.setEnabled(false);
        nextQuestionButton.setEnabled(true);

        
        //Check if user is using A B C or D and if not tell them to use it next time (Question counts as incorrect)
        if (guess.equalsIgnoreCase("A") || guess.equalsIgnoreCase("B") || guess.equalsIgnoreCase("C") || guess.equalsIgnoreCase("D")) {
            errorLabel.setVisible(false);
        
        }
        else {
            errorLabel.setVisible(true);
        
        }
        
        
        //Check if user got the correct answer if so increase correctAnswers by 1 if not increase incorrectAnswers by 1
        if (pageNum == 1) {
            if (guess.equals("B") || guess.equals("b")) {
                correctAnswers = correctAnswers + 1;
                correctLabel.setText("Correct Answers: " + correctAnswers);
            }
            else {
                incorrectAnswers = incorrectAnswers + 1;
                incorrectLabel.setText("Incorrect Answers: " + incorrectAnswers);
            }
        }
        
        if (pageNum == 2) {
            if (guess.equals("C") || guess.equals("c")) {
                correctAnswers = correctAnswers + 1;
                correctLabel.setText("Correct Answers: " + correctAnswers);
            
            }
            else {
                incorrectAnswers = incorrectAnswers + 1;
                incorrectLabel.setText("Incorrect Answers: " + incorrectAnswers);
            }
        }
        
        if (pageNum == 3) {
            if (guess.equals("D") || guess.equals("d")) {
                correctAnswers = correctAnswers + 1;
                correctLabel.setText("Correct Answers: " + correctAnswers);
            
            }
            else {
                incorrectAnswers = incorrectAnswers + 1;
                incorrectLabel.setText("Incorrect Answers: " + incorrectAnswers);
            }
        }
        
        if (pageNum == 4) {
            if (guess.equals("A") || guess.equals("a")) {
                correctAnswers = correctAnswers + 1;
                correctLabel.setText("Correct Answers: " + correctAnswers);
            
            }
            else {
                incorrectAnswers = incorrectAnswers + 1;
                incorrectLabel.setText("Incorrect Answers: " + incorrectAnswers);
            }
            
        }
        
        if (pageNum == 5) {
            if (guess.equals("D") || guess.equals("d")) {
                correctAnswers = correctAnswers + 1;
                correctLabel.setText("Correct Answers: " + correctAnswers);
            
            }
            else {
                incorrectAnswers = incorrectAnswers + 1;
                incorrectLabel.setText("Incorrect Answers: " + incorrectAnswers);
            }
        }
        
        
    }//GEN-LAST:event_submitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Results;
    private javax.swing.JLabel answerALabel;
    private javax.swing.JLabel answerBLabel;
    private javax.swing.JLabel answerCLabel;
    private javax.swing.JLabel answerDLabel;
    private javax.swing.JLabel correctLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel incorrectLabel;
    private javax.swing.JLabel instructionLabel1;
    private javax.swing.JLabel instructionLabel2;
    private javax.swing.JLabel instructionLabel3;
    private javax.swing.JLabel instructionLabel4;
    private javax.swing.JLabel instructionLabel5;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton nextQuestionButton;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel questionTitleLabel;
    private javax.swing.JPanel questions;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField userInput;
    // End of variables declaration//GEN-END:variables
}
