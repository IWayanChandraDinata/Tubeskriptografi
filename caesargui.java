import com.placeholder.PlaceHolder;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Atish
 */
public class caesargui extends javax.swing.JFrame {
    //initialize real code
	private static final int MIN = 0, MAX = 127;
	private static HashMap<Character, Character> map;
	private static HashMap<Character, Character> inverseMap;
        private static int key=0;
	private static int key1 []=new int [5];
        private static int q;
        private static int mvisit []=new int [MAX];
        public static int rand;
        public static String input;
        public static String decryptinput;
        public static String pwd1;
        public static int ch=0;
    
        public static char a[][]=new char[5][5];
        public static char b[][]=new char[5][5];
        public static char c[][]=new char[5][5];
        public static char d[][]=new char[5][5];
        public static char ip[]=new char[25];
        public static int j,k,l;
    
	public static String cipher1 = "";
	public static String cipher2 = "";
	public static String decipher1 = "";
	public static String decipher2 = "";
	
    //--
    public caesargui() {
        initComponents();
        PlaceHolder holder1 = new PlaceHolder(Password1, "Panjang kunci harus 5");
        PlaceHolder holder2 = new PlaceHolder(Password2, "Panjang kunci harus 5");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Encryptiontitle = new javax.swing.JLabel();
        Decryptiontitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        encryptedstring = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        decryptedtext = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputtext = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        encryptedtext = new javax.swing.JTextArea();
        Password1 = new javax.swing.JTextField();
        Password2 = new javax.swing.JTextField();
        Encrypt = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        Decrypt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caesar Cipher Menggunakan Substitusi Acak  dengan Transposisi Ganda");
        setBackground(new java.awt.Color(51, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 153, 153));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setLabelFor(this);
        Title.setText("Caesar Cipher (Substitusi Acak dengan Transposisi Ganda)");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 11, 969, -1));

        Encryptiontitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Encryptiontitle.setText("Enkripsi");
        getContentPane().add(Encryptiontitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 71, -1, -1));

        Decryptiontitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Decryptiontitle.setText("Dekripsi");
        getContentPane().add(Decryptiontitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 71, -1, -1));

        jLabel3.setText("Plain Text:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 111, -1, -1));

        encryptedstring.setEditable(false);
        encryptedstring.setColumns(20);
        encryptedstring.setRows(5);
        jScrollPane1.setViewportView(encryptedstring);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 346, 331, 134));

        jLabel4.setText("Cipher Text:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 111, -1, -1));

        decryptedtext.setEditable(false);
        decryptedtext.setColumns(20);
        decryptedtext.setRows(5);
        jScrollPane2.setViewportView(decryptedtext);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 346, 331, 134));

        jLabel5.setText("Kunci:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 268, -1, -1));

        jLabel6.setText("Kunci:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 268, -1, -1));

        jLabel7.setText("Cipher Text:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 346, -1, -1));

        jLabel8.setText("Plain Text:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 346, -1, -1));

        inputtext.setColumns(20);
        inputtext.setRows(5);
        jScrollPane3.setViewportView(inputtext);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 111, 331, 130));

        encryptedtext.setColumns(20);
        encryptedtext.setRows(5);
        jScrollPane4.setViewportView(encryptedtext);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 111, 331, 130));

        Password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password1ActionPerformed(evt);
            }
        });
        getContentPane().add(Password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 265, 331, -1));

        Password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password2ActionPerformed(evt);
            }
        });
        getContentPane().add(Password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 265, 329, -1));

        Encrypt.setText("Enkrip");
        Encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptActionPerformed(evt);
            }
        });
        getContentPane().add(Encrypt, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 296, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1009, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 1009, 10));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 61, 12, 280));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 326, 12, 230));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        Decrypt.setText("Dekrip");
        Decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(774, Short.MAX_VALUE)
                .addComponent(Decrypt)
                .addGap(173, 173, 173))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(Decrypt)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1010, 500));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1010, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password1ActionPerformed

    }//GEN-LAST:event_Password1ActionPerformed

    private void Password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password2ActionPerformed

    private void EncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptActionPerformed

         JPanel pnl = null;
         pwd1=Password1.getText();
        if(pwd1.length()!=5)
        {
                            JOptionPane.showMessageDialog(pnl, "Panjang kunci harus 5","Error", JOptionPane.ERROR_MESSAGE);
        }
         else
        {    
            ch=1;
            cipher1 = "";
            cipher2 = "";
            encryptedstring.setText("");
            encryptedtext.setText("");
             try {
                 encryptinit();
             } catch (IOException ex) {
                 Logger.getLogger(caesargui.class.getName()).log(Level.SEVERE, null, ex);
             }
             String encryptedStr = encrypt(input);
             transposeencrypt(encryptedStr);
        }
    }//GEN-LAST:event_EncryptActionPerformed

    private void DecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptActionPerformed
         JPanel pnl = null;
         pwd1=Password2.getText();
        if(pwd1.length()!=5)
        {
                            JOptionPane.showMessageDialog(pnl, "Panjang kunci harus 5","Error", JOptionPane.ERROR_MESSAGE);
        }
          else
        {   
            ch=2;
            decipher1 = "";
            decipher2 = "";
             decryptedtext.setText("");
             try {
                 decryptinit();
             } catch (IOException ex) {
                 Logger.getLogger(caesargui.class.getName()).log(Level.SEVERE, null, ex);
             }
             transposedecrypt();
             String decryptedString = decrypt(decipher2);
             decryptedtext.append(decryptedString);
        }
    }//GEN-LAST:event_DecryptActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(caesargui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caesargui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caesargui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caesargui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caesargui().setVisible(true);
            }
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Decrypt;
    private javax.swing.JLabel Decryptiontitle;
    private javax.swing.JButton Encrypt;
    private javax.swing.JLabel Encryptiontitle;
    private javax.swing.JTextField Password1;
    private javax.swing.JTextField Password2;
    private javax.swing.JLabel Title;
    private javax.swing.JTextArea decryptedtext;
    private javax.swing.JTextArea encryptedstring;
    private javax.swing.JTextArea encryptedtext;
    private javax.swing.JTextArea inputtext;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables

    public  void encryptinit() throws IOException
    {
            initializekeyandip();
            loadMaps();
    }
    public  void decryptinit() throws IOException
    {
            initializekeyandip();
            loadMaps();
    }
    	public  void loadMaps() {
		map = new HashMap<Character, Character>();
		inverseMap = new HashMap<Character, Character>();
                q=0;
		        for(int i=0;i<32;i++)
                 mvisit[i]=1;
                 for(int i=32;i<MAX;i++)
                 mvisit[i]=0;
		for(int i = 0; i < 32; i++) {
			map.put((char) i, (char) i);
		}
		for(int i = 32; i < MAX; i++) {
			map.put((char) i, (char) getNextRandom());
		}
		for(int i = MAX; i < 255; i++) {
			map.put((char) i, (char) i);
		}
		
		if(map != null && inverseMap != null) {
			Set<Entry<Character, Character>> set = map.entrySet();
			for(Entry<Character, Character> entry : set) {
				inverseMap.put(entry.getValue(), entry.getKey());
			}
		}
	}

	private  int getNextRandom() {
		
		rand=q % MAX;
		q=rand+3*key;
		if(rand<0)
			rand=rand*-1;
		
		if(mvisit[rand]==0)
			mvisit[rand]=1;
		else{
			while(mvisit[rand]!=0)
				rand=(rand+1)%MAX;
			mvisit[rand]=1;
		}

			return rand; 
	}
//ceaser	
	public  String encrypt(String input) {
		StringBuffer sb = new StringBuffer();
		//input = input.toUpperCase();
		
		char x = ' ';
		for(int i = 0; i < input.length(); i++) {
			x = input.charAt(i);
			sb.append(map.get(x));
		}
		
		return sb.toString();
	}
//ceaser	
	public  String decrypt(String input) {
		StringBuffer sb = new StringBuffer();
		
		char x = ' ';
		for(int i = 0; i < input.length(); i++) {
			x = input.charAt(i);
			sb.append(inverseMap.get(x));
		}
		
		return sb.toString();
	}
        
	public  void initializekeyandip() throws IOException{       
        if(ch==1)
            input=inputtext.getText();
        else if (ch==2)
            decryptinput=encryptedtext.getText();
            key=0;
            for(int i = 0 ; i < 5 ; i ++)
                    key1[i] = (int)pwd1.charAt(i);
            for(int i=0;i<5;i++){
                    key=key*10+key1[i];
            }
            for(int i=0;i<5;i++)
                    key1[i]=(key1[i]%5)+1;
            int kvisit []=new int [6];
            for(int i=0;i<6;i++)
                    kvisit[i]=0;
                for(int i=0;i<5;i++){
                    int rv=key1[i];
                    int kv1=1;
                    if(kvisit[rv]==0)
                        kvisit[rv]=1;
                    else{
                        while(kvisit[kv1]!=0 && kv1<6)
                                kv1++;
                        key1[i]=kv1;
                        kvisit[kv1]=1;
                    }
                }           
        }
public void transposeencrypt(String encryptedString){   
	int len=encryptedString.length();
	int i=0,len1=0,w=1;
	while(w==1){
            for(i=0;i<25 && len1<len;i++,len1++){
                ip[i]=encryptedString.charAt(len1);     
            }

            if(len==len1){
                for(i=i;i<25;i++)
                ip[i]=' ';
                w=0;
            }

            for(j=0,l=0;j<5;j++){
                for(k=0;k<5;k++,l++){
                    a[j][k]=ip[l];
                    System.out.print(a[j][k]+" ");
                }
                System.out.println();
            }
            for(j=0,l=0;j<5;j++){
                l=key1[j]-1;
                for(k=0;k<5;k++){
                  b[k][j]=a[k][l];
                  System.out.print(b[k][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Tencrypt1 is :");
            for(j=0;j<5;j++){
                for(k=0;k<5;k++)
                        cipher1 += b[k][j];         
            } 
            System.out.println(cipher1);
            System.out.println();
            for(j=0;j<5;j++){
                 for(k=0;k<5;k++)
                    c[j][k]=b[k][j];
            }
            for(j=0,l=0;j<5;j++){
               l=key1[j]-1;
               for(k=0;k<5;k++){
                 d[k][j]=c[k][l];  
               }
            }
            for(j=0;j<5;j++){
                for(k=0;k<5;k++)
                        cipher2 += d[k][j];     
            } 
	} 
encryptedstring.append(cipher2);
encryptedtext.append(cipher2);
}

public  void transposedecrypt(){
	int len=decryptinput.length();
	int i=0,len1=0,w=1;
	while(w==1){
            for(i=0;i<25 && len1<len;i++,len1++){
                ip[i]=decryptinput.charAt(len1);     
            }
            if(len==len1){
                 for(i=i;i<25;i++)
                   ip[i]=' ';
                w=0;
            }
	for(j=0,l=0;j<5;j++){
            for(k=0;k<5;k++,l++){
                d[j][k]=ip[l];
            }
        }
        for(j=0,l=0;j<5;j++){
           l=key1[j]-1;
           for(k=0;k<5;k++){
             c[k][l]=d[j][k];  
           }
        }
        for(j=0;j<5;j++){
           for(k=0;k<5;k++)
             b[j][k]=c[k][j];
        }
    
        for(j=0;j<5;j++){
            for(k=0;k<5;k++)
                    decipher1 += b[k][j];
        }
    
        for(j=0,l=0;j<5;j++){
            l=key1[j]-1;
            for(k=0;k<5;k++){
              a[k][l]=b[k][j];  
            }
        }
    
        for(j=0;j<5;j++){
            for(k=0;k<5;k++)
                    decipher2 +=a[j][k];
        }  
    
        }
    decipher2 = decipher2.replace("   ","");    
}

}
