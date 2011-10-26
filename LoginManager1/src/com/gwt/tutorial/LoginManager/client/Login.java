package com.gwt.tutorial.LoginManager.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalSplitPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;

public class Login extends Composite {
	private TextBox textBoxPassword;
	private TextBox textBoxUsername;

	public Login() {
		
		VerticalPanel verticalPanel = new VerticalPanel();
		initWidget(verticalPanel);
		verticalPanel.setWidth("348px");
		
		Label lblSignIn = new Label("Sign in to your account");
		lblSignIn.setStyleName("gwt-Label-Login");
		verticalPanel.add(lblSignIn);
		
		FlexTable flexTable = new FlexTable();
		verticalPanel.add(flexTable);
		flexTable.setSize("314px", "56px");
		
		Label lblNewLabel = new Label("Username");
		lblNewLabel.setStyleName("gwt-Label-Login");
		flexTable.setWidget(0, 0, lblNewLabel);
		lblNewLabel.setWidth("138px");
		
		textBoxUsername = new TextBox();
		flexTable.setWidget(0, 1, textBoxUsername);
		
		Label lblNewLabel_1 = new Label("Password");
		lblNewLabel_1.setStyleName("gwt-Label-Login");
		flexTable.setWidget(1, 0, lblNewLabel_1);
		
		textBoxPassword = new TextBox();
		flexTable.setWidget(1, 1, textBoxPassword);
		flexTable.getCellFormatter().setVerticalAlignment(1, 0, HasVerticalAlignment.ALIGN_MIDDLE);
		flexTable.getCellFormatter().setVerticalAlignment(0, 0, HasVerticalAlignment.ALIGN_MIDDLE);
		flexTable.getCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_LEFT);
		
		CheckBox chckbxNewCheckBox = new CheckBox("Remember me on this computer");
		chckbxNewCheckBox.setStyleName("gwt-Checkbox-Login");
		flexTable.setWidget(2, 1, chckbxNewCheckBox);
		
		Button btnSignIn = new Button("Sign In");
		btnSignIn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {if (textBoxUsername.getText().length() == 0
					|| textBoxPassword.getText().length() == 0) {
				Window.alert("Username or password is empty."); 
			}
			}
		});
		flexTable.setWidget(3, 1, btnSignIn);
		flexTable.getCellFormatter().setVerticalAlignment(3, 1, HasVerticalAlignment.ALIGN_MIDDLE);
		flexTable.getCellFormatter().setHorizontalAlignment(3, 1, HasHorizontalAlignment.ALIGN_CENTER);
		
		Label label = new Label("");
		verticalPanel.add(label);
	}

}
