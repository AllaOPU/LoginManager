package com.gwt.tutorial.LoginManager.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ToggleButton;

public class Login extends Composite {
	private TextBox textBoxUsername;
	private TextBox textBoxPassword;

	public Login() {
		
		VerticalPanel verticalPanel = new VerticalPanel();
		initWidget(verticalPanel);
		
		Label lblSignInTo = new Label("Sign in to your account");
		lblSignInTo.setStyleName("gwt-Label-Login");
		verticalPanel.add(lblSignInTo);
		
		FlexTable flexTable = new FlexTable();
		verticalPanel.add(flexTable);
		flexTable.setSize("197px", "64px");
		
		Label lblUsername = new Label("UserName");
		lblUsername.setStyleName("gwt-Label-Login");
		flexTable.setWidget(0, 0, lblUsername);
		lblUsername.setWidth("87px");
		
		textBoxUsername = new TextBox();
		flexTable.setWidget(0, 1, textBoxUsername);
		
		Label lblNewLabel = new Label("Password");
		lblNewLabel.setStyleName("gwt-Label-Login");
		flexTable.setWidget(1, 0, lblNewLabel);
		
		textBoxPassword = new TextBox();
		flexTable.setWidget(1, 1, textBoxPassword);
		
		CheckBox chckbxRememberMeOn = new CheckBox("Remember me on this computer");
		chckbxRememberMeOn.setStyleName("gwt-CheckBox-Login");
		flexTable.setWidget(2, 1, chckbxRememberMeOn);
		
		Button btnSignIn = new Button("Sign in");
		btnSignIn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {if (textBoxUsername.getText().length() == 0
					|| textBoxPassword.getText().length() == 0) {
				Window.alert("Username or password is empty."); 
			}
			}
		});
		flexTable.setWidget(3, 1, btnSignIn);
		
		ToggleButton tglbtnUpText = new ToggleButton("Up text");
		tglbtnUpText.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (textBoxUsername.getText().length() != 0) {
					Window.alert("Hi," + textBoxUsername.getText() + " !"); 
				}
			}
		});
		flexTable.setWidget(4, 2, tglbtnUpText);
	}

}
