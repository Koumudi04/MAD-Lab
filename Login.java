import androidx.appcompat.app.AppCompatActvity;
import andorid.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
	private Button loginButton;
	private EditText username;
	private EditText password;

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		username = (EditText) findViewById(R.layout.username);
		password = (EditText) findViewById(R.layout.password);
		loginButton = (Button) findViewById(R.layout.login);

		loginButton.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				if(username.getText().toString().equals("admin") && password.getText().toString().equals("1234admin")) {
					String ToastMessage = "Login Successfull";
					Toast.makeText(getApplicationContent(), ToastMessage, Toast.LENGTH_SHORT).show();
/*
Toast - A toast is a view containing a quick little message for the user. The toast class helps you create and show those.
LENGTH_SHORT- Show the view or text notification for a short period of time.
makeText(Context context, CharSequence text, int duration) - Make a standard toast that just contains text.
show() - Show the view for the specified duration.
*/
				}
				else {
					String ToastMessage = "Username & Password is Incorrect";
					Toast.makeText(getApplicationContent(), ToastMessage, Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}
