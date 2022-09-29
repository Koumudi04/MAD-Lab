import androidx.appcompat.app.AppCompatActvity;
import andorid.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
	private Button button;
	private EditText editText;
	private TextView textView;

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView = (TextView) findViewById(R.layout.textView);
		editText = (EditText) findViewById(R.layout.editText);
		button = (Button) findViewById(R.layout.button);

		button.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				Toast.makeText(MainActivity, this.text = "hi onclicklistener worked", Toast.LENGTH_SHORT).show();
				String s = editText.getText().toString();
				int kg = Integer.parseInt(s);
				double pound = 2.205 * kg;
				textView.setText("The corresponding value in pounds is " + pound);
			}
		});
	}
}
