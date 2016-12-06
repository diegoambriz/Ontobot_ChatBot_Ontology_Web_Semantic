package lenguajenatural;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Interfaz Principal del Proyecto
 * @author basu
 */
public class Principal extends javax.swing.JFrame 
{
    private char gram = 'd';
  
    public Principal() 
    {
        initComponents(); 
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuAdmin = new javax.swing.JMenu();
        menuOntologia = new javax.swing.JMenu();
        cargaOntologia = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuDominio = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        cargarGramatica = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        cargaGramaticaitem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        editarGramatica = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 6, 102));

        jPanel1.setBackground(new java.awt.Color(0, 6, 102));

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Sistema Interactivo en Lenguaje Natural Basado en Ontologias");

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego\\Downloads\\OntoBot Logos\\OntoBot Logos\\logo-m-blanco-nombre.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(171, 171, 171))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(146, 146, 146)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        menuArchivo.setText("Archivo");

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuArchivo.add(jMenuItem2);

        menuPrincipal.add(menuArchivo);

        menuAdmin.setText("Administrador");

        menuOntologia.setText("Ontología");
        menuOntologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOntologiaActionPerformed(evt);
            }
        });

        cargaOntologia.setText("Cargar Ontología");
        cargaOntologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaOntologiaActionPerformed(evt);
            }
        });
        menuOntologia.add(cargaOntologia);

        menuAdmin.add(menuOntologia);
        menuAdmin.add(jSeparator2);

        menuDominio.setText("Dominio");
        menuDominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDominioActionPerformed(evt);
            }
        });
        menuAdmin.add(menuDominio);
        menuAdmin.add(jSeparator1);

        cargarGramatica.setText("Gramatica");

        jMenu1.setText("Cambiar Gramatica");

        jMenuItem1.setText("Default");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Calculadora");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        cargarGramatica.add(jMenu1);

        cargaGramaticaitem.setText("Cargar Gramatica");
        cargaGramaticaitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaGramaticaitemActionPerformed(evt);
            }
        });
        cargarGramatica.add(cargaGramaticaitem);
        cargarGramatica.add(jSeparator3);

        editarGramatica.setText("Editar Gramatica");
        editarGramatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarGramaticaActionPerformed(evt);
            }
        });
        cargarGramatica.add(editarGramatica);

        menuAdmin.add(cargarGramatica);

        menuPrincipal.add(menuAdmin);

        menuAbout.setText("Acerca de");
        menuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAboutMouseClicked(evt);
            }
        });
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuAbout);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        try {
            Chat c = new Chat();
            this.setVisible(false);
            c.setVisible(true);
            c.gramatica = gram;
        } catch (BadLocationException | InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cargaOntologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaOntologiaActionPerformed
        
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("./Ontologias"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Ontologias", "xml", "html", "owl");
        chooser.setFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(menuOntologia);
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            System.out.println("Ontologia Seleccionada: " +
            chooser.getSelectedFile().getName());
        }
    }//GEN-LAST:event_cargaOntologiaActionPerformed

    private void menuDominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDominioActionPerformed
        Dominio d = new Dominio();
        this.setVisible(false);
        d.setVisible(true);
    }//GEN-LAST:event_menuDominioActionPerformed

    private void menuOntologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOntologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuOntologiaActionPerformed

    private void cargaGramaticaitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaGramaticaitemActionPerformed
        
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("./Gramaticas"));
      
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Gramatica", "g","g4");
        chooser.setFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(menuOntologia);
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            System.out.println("Gramática Seleccionada: " +
            chooser.getSelectedFile().getName());
            
            System.out.println("Ruta Seleccionada: " +
            chooser.getSelectedFile().getAbsolutePath());
            
            //Copia el archivo de gramática (.g o .g4) a la carpeta de proyecto con el nombre MyGrammar.g
            FileCopy filecopy = new FileCopy(chooser.getSelectedFile().getAbsolutePath(), "src/lenguajenatural/"+chooser.getSelectedFile().getName());
            //filecopy = new FileCopy("src/lenguajenatural/"+chooser.getSelectedFile().getName(), "src/lenguajenatural/MyGrammar.g");
            /*
            try {
                generaAnalizadores();
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            */
        }
    }//GEN-LAST:event_cargaGramaticaitemActionPerformed

    private void editarGramaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarGramaticaActionPerformed
        
        edGramatica e = new edGramatica();
        this.setVisible(false);
        e.setVisible(true);
    }//GEN-LAST:event_editarGramaticaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        gram = 'd';
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        gram = 'c';
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuAboutActionPerformed

    private void menuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAboutMouseClicked
        // TODO add your handling code here:
        AcercaDe d = new AcercaDe();
        d.setVisible(true);
    }//GEN-LAST:event_menuAboutMouseClicked

    private void generaAnalizadores() throws InterruptedException {
        try {
            
          Process pro = Runtime.getRuntime().exec("java -jar antlr-4.5.3-complete.jar src/lenguajenatural/MyGrammar.g");
          pro.waitFor();
          
              FileCopy fileCopy;
        File borrar;
        fileCopy = new FileCopy("MyGrammar.tokens", "src/lenguajenatural/MyGrammar.tokens");
        borrar = new File("MyGrammar.tokens");
        borrar.delete();
        fileCopy = new FileCopy("MyGrammarBaseListener.java", "src/lenguajenatural/MyGrammarBaseListener.java");
        borrar = new File("MyGrammarBaseListener.java");
        borrar.delete();
        fileCopy = new FileCopy("MyGrammarLexer.java", "src/lenguajenatural/MyGrammarLexer.java");
        borrar = new File("MyGrammarLexer.java");
        borrar.delete();
        fileCopy = new FileCopy("MyGrammarLexer.tokens", "src/lenguajenatural/MyGrammarLexer.tokens");
        borrar = new File("MyGrammarLexer.tokens");
        borrar.delete();
        fileCopy = new FileCopy("MyGrammarListener.java", "src/lenguajenatural/MyGrammarListener.java");
        borrar = new File("MyGrammarListener.java");
        borrar.delete();
        fileCopy = new FileCopy("MyGrammarParser.java", "src/lenguajenatural/MyGrammarParser.java");
        borrar = new File("MyGrammarParser.java");
        borrar.delete();
          
        
        ANTLRInputStream input;
        // TODO code application logic here
        try {
    //MyErrorListener listener = new MyErrorListener();
    input = new ANTLRInputStream("5*8\n");
    MyGrammarLexer lexer = new MyGrammarLexer(input);
    //lexer.removeErrorListeners();
    //lexer.addErrorListener(listener);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    MyGrammarParser parser = new MyGrammarParser(tokens);
    //parser.removeErrorListeners();    
    //parser.addErrorListener(listener);
    parser.prog();
} catch (RecognitionException ex) {
    Logger.getLogger(LenguajeNatural.class.getName()).log(Level.SEVERE, null, ex);
}
        
        
        
        } catch (IOException ex) {
          System.out.println(ex);
      }
        
    }
    
    /**
     * @param args the command line arguments
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                //javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
                //javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JMenuItem cargaGramaticaitem;
    private javax.swing.JMenuItem cargaOntologia;
    private javax.swing.JMenu cargarGramatica;
    private javax.swing.JMenuItem editarGramatica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuDominio;
    private javax.swing.JMenu menuOntologia;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
