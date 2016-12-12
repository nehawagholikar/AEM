package com.aem;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Login extends Activity 
{

	Button login,newUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        try
        {
        	login=(Button)findViewById(R.id.buttonLogin);
        	newUser=(Button)findViewById(R.id.buttonNewUser);
        	
        	login.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
				}
			});


			newUser.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent=new Intent(Login.this,Registration.class);
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
