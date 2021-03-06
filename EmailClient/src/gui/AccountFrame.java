/*
 * AccountFrame.java
 *
 * Created on August 18, 2009, 7:22 PM
 */

package gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import network.MailHandler;
import account.AccountInformation;
import account.MailAccount;
import constants.Consts;
import filesystem.DAO;

/**
 *
 * @author  Pratik
 */
public class AccountFrame extends javax.swing.JFrame implements Consts {

	private static final long serialVersionUID = 4135256878735068065L;
	public static final String DEFAULT_PASSWORD="jPasswordField1";
	MailHandler mailHandler;
	MailAccount mailAccount;
    
    /** Creates new form AccountFrame */
    public AccountFrame(MailHandler mailHandler) {
    	this.mailHandler=mailHandler;
        initComponents();
    }
    
    public AccountFrame(MailAccount mailAccount) { 
    	this.mailAccount=mailAccount;
    	updateFlag=true;
        initComponents();
        showAccountDetails(mailAccount.getAccountInformation());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        lblExPassword = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        cmbIncomingServerType = new javax.swing.JComboBox();
        lblIncomingServerType = new javax.swing.JLabel();
        txtIncomingServerAddress = new javax.swing.JTextField();
        lblIncomingServerAddress = new javax.swing.JLabel();
        lblExEmailAddress = new javax.swing.JLabel();
        lblExServerAddress = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        lblExAccountName = new javax.swing.JLabel();
        txtAccountName = new javax.swing.JComboBox();
        lblAccountName = new javax.swing.JLabel();
        lblExIncomingServerType = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblExUserName = new javax.swing.JLabel();
        lblOutgoingServerAddress = new javax.swing.JLabel();
        txtOutgoingServerAddress = new javax.swing.JTextField();
        cmbOutgoingServerType = new javax.swing.JComboBox();
        lblOutgoingServerType = new javax.swing.JLabel();
        lblExOutgoingServerType = new javax.swing.JLabel();
        lblExOutgoingServer = new javax.swing.JLabel();
        cmdOK = new javax.swing.JButton();
        cmdCancel = new javax.swing.JButton();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Account Information");

        mainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblExPassword.setText("ex: tigeR007");

        lblPassword.setText("Password: ");

        cmbIncomingServerType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {POP3, IMAP}));

        lblIncomingServerType.setText("Type: ");

        lblIncomingServerAddress.setText("Incoming Server Address: ");

        lblExEmailAddress.setText("ex: example@gmail.com");

        lblExServerAddress.setText("ex: pop.gmail.com");

        lblEmailAddress.setText("Email Address: ");

        lblExAccountName.setText("ex: Gmail");

        lblAccountName.setText("Account Name: ");

        lblExIncomingServerType.setText("ex: POP");

        txtAccountName.setModel(new DefaultComboBoxModel());
        txtAccountName.addItem("Gmail");
        txtAccountName.addItem("Yahoo");        
        txtAccountName.addItem("Hotmail");
        txtAccountName.addItem("Other");
        txtAccountName.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent evt) {
        		String selItem=txtAccountName.getSelectedItem().toString();
        		if(selItem.equalsIgnoreCase(OTHER)) {        			
        			txtAccountName.setEditable(true);
        			txtAccountName.setSelectedItem("");
        			txtIncomingServerAddress.setText("");
        			cmbIncomingServerType.setSelectedIndex(0);
        			txtOutgoingServerAddress.setText("");
        		}
        		else if(selItem.equalsIgnoreCase(GMAIL)) {        			
        			txtIncomingServerAddress.setText(GMAIL_INCOMING_SERVER);
        			cmbIncomingServerType.setSelectedItem(IMAP);
        			txtOutgoingServerAddress.setText(GMAIL_OUTGOING_SERVER);
        		}
        		else if(selItem.equalsIgnoreCase(YAHOO)) {        			
        			txtIncomingServerAddress.setText(YAHOO_INCOMING_SERVER);
        			cmbIncomingServerType.setSelectedItem(POP3);
        			txtOutgoingServerAddress.setText(YAHOO_OUTGOING_SERVER);
        		}
        		else if(selItem.equalsIgnoreCase(HOTMAIL)) {        			
        			txtIncomingServerAddress.setText(HOTMAIL_INCOMING_SERVER);
        			cmbIncomingServerType.setSelectedItem(POP3);
        			txtOutgoingServerAddress.setText(HOTMAIL_OUTGOING_SERVER);
        		}
        	}
        });
        txtIncomingServerAddress.setText(GMAIL_INCOMING_SERVER);
        cmbIncomingServerType.setSelectedItem(IMAP);
        txtOutgoingServerAddress.setText(GMAIL_OUTGOING_SERVER);
        
        txtPassword.setText("jPasswordField1");
        
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        lblUserName.setText("User Name: ");

        lblExUserName.setText("ex: John Doe");

        lblOutgoingServerAddress.setText("Outgoing Server Address: ");

        cmbOutgoingServerType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SMTP" }));

        lblOutgoingServerType.setText("Type: ");

        lblExOutgoingServerType.setText("ex: SMTP");

        lblExOutgoingServer.setText("ex: smtp.gmail.com");
        
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIncomingServerAddress)
                            .addComponent(lblPassword)
                            .addComponent(lblAccountName)
                            .addComponent(lblUserName)
                            .addComponent(lblEmailAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExEmailAddress)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblExAccountName)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAccountName, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))))
                            .addComponent(lblExPassword)
                            .addComponent(lblExUserName)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(lblExServerAddress)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtOutgoingServerAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIncomingServerAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblExOutgoingServer))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                        .addComponent(lblIncomingServerType)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbIncomingServerType, 0, 71, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                        .addComponent(lblOutgoingServerType)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblExOutgoingServerType)
                                            .addComponent(cmbOutgoingServerType, 0, 69, Short.MAX_VALUE)
                                            .addComponent(lblExIncomingServerType)))))))
                    .addComponent(lblOutgoingServerAddress))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(txtAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lblExAccountName))
                    .addComponent(lblAccountName))
                .addGap(6, 6, 6)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIncomingServerAddress)
                            .addComponent(txtIncomingServerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIncomingServerType)
                            .addComponent(cmbIncomingServerType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblExIncomingServerType))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblExServerAddress)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOutgoingServerAddress)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOutgoingServerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOutgoingServerType)
                        .addComponent(cmbOutgoingServerType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExOutgoingServerType)
                    .addComponent(lblExOutgoingServer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        cmdOK.setText("OK");
        cmdOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOKActionPerformed(evt);
            }
        });

        cmdCancel.setText("Cancel");
        cmdCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmdCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdOK, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdOK)
                    .addComponent(cmdCancel))
                .addGap(11, 11, 11))
        );
        setVisible(true);
        pack();
    }// </editor-fold>

    private void formWindowClosing(WindowEvent evt) {
    	if(mailHandler != null) {
    		if(null == mailHandler.getMainFrame()) {
    			System.exit(0);
    		}
    		else {
    			dispose();
    		}
    	}
    }
    
    private void cmdOKActionPerformed(java.awt.event.ActionEvent evt) {
    	AccountInformation newAccountInformation=null;
    	if(validateForm()) {
    		DAO dao=new DAO();
    		newAccountInformation=new AccountInformation();
    		newAccountInformation.setAccountName(txtAccountName.getSelectedItem().toString());
    		newAccountInformation.setUserName(txtUserName.getText());
    		newAccountInformation.setEmail(txtEmailAddress.getText());
    		newAccountInformation.setIncomingServerAddress(txtIncomingServerAddress.getText());
    		newAccountInformation.setIncomingMailServerType(cmbIncomingServerType.getSelectedItem().toString());
    		newAccountInformation.setOutgoingServerAddress(txtOutgoingServerAddress.getText());
    		newAccountInformation.setOutgoingMailServerType(cmbOutgoingServerType.getSelectedItem().toString());
    		newAccountInformation.setPassword(txtPassword.getPassword());
    		if(updateFlag) {    			    			
    			dao.updateAccountInf(mailAccount.getAccountInformation(),newAccountInformation);    			
    			mailAccount.setAccountInformation(newAccountInformation);    			
    			updateFlag=false;
    			dispose();
    		}
    		else {
    			dao.saveAccountInf(newAccountInformation);    
    			synchronized (mailHandler) {
        			mailHandler.notify();
        		}
    			mailHandler.addAccount(newAccountInformation);        		
    		}
    		dispose();
    	}
    	
    }

    private void cmdCancelActionPerformed(java.awt.event.ActionEvent evt) {
    	setVisible(false);
    	dispose();        
    }

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {    
       if(null == txtPassword.getPassword() || DEFAULT_PASSWORD.equals(new String(txtPassword.getPassword()))) {
            txtPassword.setText("");
       }                                       
    }  
    
    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {    
        if(null == txtPassword.getPassword() || "".equals(new String(txtPassword.getPassword()))) {
             txtPassword.setText(DEFAULT_PASSWORD);
        }                                       
     }
    
    private boolean validateForm() {
    	if(null == txtAccountName.getSelectedItem() || "".equals(txtAccountName.getSelectedItem().toString())) {
    		JOptionPane.showMessageDialog(this,MANDATORY_FIELD_MESSAGE);
    		txtAccountName.requestFocus();
    		return false;
    	}
    	else if(null == txtUserName.getText() || "".equals(txtUserName.getText())) {
    		JOptionPane.showMessageDialog(this,MANDATORY_FIELD_MESSAGE);
    		txtUserName.requestFocus();
    		return false;
		}
    	else if(null == txtIncomingServerAddress.getText() || "".equals(txtIncomingServerAddress.getText())) {
			JOptionPane.showMessageDialog(this,MANDATORY_FIELD_MESSAGE);
			txtIncomingServerAddress.requestFocus();
			return false;
		}
    	else if(null == txtOutgoingServerAddress.getText() || "".equals(txtOutgoingServerAddress.getText())) {
			JOptionPane.showMessageDialog(this,MANDATORY_FIELD_MESSAGE);
			txtOutgoingServerAddress.requestFocus();
			return false;
		}
		else if(null == txtEmailAddress.getText() || "".equals(txtEmailAddress.getText())) {
			JOptionPane.showMessageDialog(this,MANDATORY_FIELD_MESSAGE);
			txtEmailAddress.requestFocus();
			return false;
		}
		else if(null == txtPassword.getPassword() || "".equals(txtPassword.getPassword()) || DEFAULT_PASSWORD.equals(new String(txtPassword.getPassword()))) {
			JOptionPane.showMessageDialog(this,MANDATORY_FIELD_MESSAGE);
			txtPassword.requestFocus();
			return false;
		}
		
    	return true;
    }
    
    private void showAccountDetails(AccountInformation accountInformation) {
    	txtAccountName.setSelectedItem(accountInformation.getAccountName());
    	txtUserName.setText(accountInformation.getUserName());
    	txtIncomingServerAddress.setText(accountInformation.getIncomingServerAddress());
    	cmbIncomingServerType.setSelectedItem(accountInformation.getIncomingMailServerType());
    	txtOutgoingServerAddress.setText(accountInformation.getOutgoingServerAddress());
    	cmbOutgoingServerType.setSelectedItem(accountInformation.getOutgoingMailServerType());
    	txtEmailAddress.setText(accountInformation.getEmail());
    	cmdOK.setText("Update");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountFrame(new MailAccount(null,null));
            }
        });
    }
    
    // Variables declaration - do not modify
    private javax.swing.JComboBox cmbIncomingServerType;
    private javax.swing.JComboBox cmbOutgoingServerType;
    private javax.swing.JButton cmdCancel;
    private javax.swing.JButton cmdOK;
    private javax.swing.JLabel lblAccountName;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblExAccountName;
    private javax.swing.JLabel lblExEmailAddress;
    private javax.swing.JLabel lblExIncomingServerType;
    private javax.swing.JLabel lblExOutgoingServer;
    private javax.swing.JLabel lblExOutgoingServerType;
    private javax.swing.JLabel lblExPassword;
    private javax.swing.JLabel lblExServerAddress;
    private javax.swing.JLabel lblExUserName;
    private javax.swing.JLabel lblIncomingServerAddress;
    private javax.swing.JLabel lblIncomingServerType;
    private javax.swing.JLabel lblOutgoingServerAddress;
    private javax.swing.JLabel lblOutgoingServerType;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox txtAccountName;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtIncomingServerAddress;
    private javax.swing.JTextField txtOutgoingServerAddress;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private boolean updateFlag=false;
    // End of variables declaration
    
}
