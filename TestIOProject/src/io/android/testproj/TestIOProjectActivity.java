package io.android.testproj;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TestIOProjectActivity extends Activity implements OnClickListener{
	
	//Das variables
	TextView message;
	Button prompt;
    /** Called when the activity is first created. */
    @Override
    /**
     * This is the function that is first called when you start the activity. 
     * In our version it calls the onInit function.
     * @author Khalid Richards
     * @param savedInstanceState	Don't worry about that for now
     * 
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        onInit();
    }
    
    private void onInit(){
    	message = (TextView) findViewById(R.id.tvMessage);
    	prompt = (Button) findViewById(R.id.bPrompt);
    	prompt.setOnClickListener(this);
    }

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		message.setText("Infinity Orange is the best!");
	}
}