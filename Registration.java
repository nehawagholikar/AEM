package com.aem;

import com.database.Database;
import com.model.User;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends Activity 
{
	Button registraion;
	EditText dasId,userFullName,password,confirmPassword,mobileNo,emailId;
	User user;
	Database db;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registration);
		registraion=(Button)findViewById(R.id.buttonRegistration);
		
		try
		{	
			

		
			registraion.setOnClickListener(new View.OnClickListener()
			{

				@Override
				public void onClick(View v)
				{
					// TODO Auto-generated method stub
					
					
					dasId=(EditText)findViewById(R.id.editTextDasId);
					userFullName=(EditText)findViewById(R.id.editTextUserFullName);
					password=(EditText)findViewById(R.id.editTextPassword);
					confirmPassword=(EditText)findViewById(R.id.editTextConfirmPassword);
					mobileNo=(EditText)findViewById(R.id.editTextMobileNo);
					emailId=(EditText)findViewById(R.id.editTextEmailId);

					if(password.getText().toString().equals(confirmPassword.getText().toString()))
					{
						
					
						user=new User();
						
						user.setmDasId(dasId.getText().toString());
						user.setmUserName(userFullName.getText().toString());
						user.setmPassword(password.getText().toString());
						user.setmMobileNo(mobileNo.getText().toString());
						user.setmEmailId(emailId.getText().toString());
						
						db=new Database(Registration.this);
						
						db.register(user);
						
						
						
					}
					else
					{
						Toast.makeText(Registration.this, "Password and Confirm Password must be same", Toast.LENGTH_LONG).show();
						password.setText("");
						confirmPassword.setText("");
					}
					
					Intent intent=new Intent(Registration.this,Login.class);
					startActivity(intent);
				}
			});






		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
