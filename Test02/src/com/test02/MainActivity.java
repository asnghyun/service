package com.test02;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {
	Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   
    public void btnstart(View view){
    	Toast.makeText(context,"btnstart",Toast.LENGTH_SHORT ).show();
    }
    public void btnclose(View view){
    	Toast.makeText(context,"btnclose",Toast.LENGTH_SHORT ).show();
    }
    public void onClick(View view){
    	switch(view.getId()){
    	case  R.id.button1:
    		Toast.makeText(context,"button1",Toast.LENGTH_SHORT ).show();
    		startService(new Intent("com.test02"));
    		break;
    	case  R.id.button2:
    		Toast.makeText(context,"button2",Toast.LENGTH_SHORT ).show();
    		stopService(new Intent("com.test02"));
    		break;
    	}
    	
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
