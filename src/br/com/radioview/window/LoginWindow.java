package br.com.radioview.window;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import br.com.radio.exception.AuthenticationFailedException;
import br.com.radio.facade.Facade;
/**
 *
 * @author brunoRafael
 */

public class LoginWindow extends JFrame implements RadioWindow{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private javax.swing.JFileChooser jFileChooser1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JProgressBar progressBar;
    private JButton loginButton;
    private JLabel loginLabel;
    private JTextField loginTextArea;
    private JLabel passwordLabel;
    private JPasswordField passwordTextArea;
    private JLabel registerLink;
    private JLabel rotuleLabel;
    //private Facade facade;
 
	public LoginWindow() {
		setResizable(false);
		initComponents();

	}
	    
	// public Facade getFacade(){
	//     if(facade == null){
	//         facade = new Facade();
	//     }
	        
	//     return facade;
	// }
                         
	private void initComponents() {

	    jPanel1 = new JPanel();
	    rotuleLabel = new JLabel();
	    jPanel2 = new JPanel();
	    jPanel3 = new JPanel();
	    progressBar = new JProgressBar();
	    loginLabel = new JLabel();
	    loginTextArea = new JTextField();
	    passwordTextArea = new JPasswordField();
	    passwordLabel = new JLabel();
	    loginButton = new JButton();
	    registerLink = new JLabel();

	    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	    jPanel1.setBackground(new java.awt.Color(10, 173, 248));

	    rotuleLabel.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
	    rotuleLabel.setText("Bem Vindo!");

	    GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	    jPanel1.setLayout(jPanel1Layout);
	    jPanel1Layout.setHorizontalGroup(
	    		jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(rotuleLabel)
	                .addGap(126, 126, 126))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(rotuleLabel)
	                .addContainerGap(26, Short.MAX_VALUE))
	        );

	        jPanel2.setBackground(new java.awt.Color(10, 173, 248));

	        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addContainerGap())
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap())
	        );

	        loginLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
	        loginLabel.setText("Login");

	        loginTextArea.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	               
	            }
	        });

	        passwordLabel.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
	        passwordLabel.setText("Senha");

	        loginButton.setText("Login");
	        loginButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt){
	                try{
	                	authentica();
	                }catch(AuthenticationFailedException e){
	             
	                }
	            }

        });

	        registerLink.setText("Cadastrar");

	        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
	        jPanel3.setLayout(jPanel3Layout);
	        jPanel3Layout.setHorizontalGroup(
	            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addGap(85, 85, 85)
	                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
	                    .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
	                        .addComponent(registerLink)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel3Layout.createSequentialGroup()
	                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(loginLabel)
	                            .addComponent(passwordLabel))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(passwordTextArea)
	                            .addComponent(loginTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addContainerGap(104, Short.MAX_VALUE))
	        );
	        jPanel3Layout.setVerticalGroup(
	            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                    .addComponent(loginLabel)
	                    .addComponent(loginTextArea, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                    .addComponent(passwordTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(passwordLabel))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                    .addComponent(loginButton)
	                    .addComponent(registerLink))
	                .addContainerGap(28, Short.MAX_VALUE))
	        );

	        GroupLayout layout = new GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        );

	        pack();
	    }   
	
	private void authentica() throws AuthenticationFailedException{
		Facade.getInstance().login(loginTextArea.getText(), 
    			passwordTextArea.getSelectedText(), new AsyncHandler<Boolean>() {
					public void handleResponse(Response<Boolean> result) {
						
						
					}
				});
		
	}

	@Override
	public void execute() {
		setVisible(true);
			
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
			
	}	    

}
