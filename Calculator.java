import androidx.appcompat.app.AppCompatActvity;
import andorid.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	double val1, val2;
	bool add, sub, mul, div, per;
	Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, bper, bdot, beq, bdel;
	TextView editText1;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b0 = (Button) findViewById(R.layout.B0);//Button - A user interface element the user can tap or click to perform an action.
		b1 = (Button) findViewById(R.layout.B1);
		b2 = (Button) findViewById(R.layout.B2);
		b3 = (Button) findViewById(R.layout.B3);
		b4 = (Button) findViewById(R.layout.B4);
		b5 = (Button) findViewById(R.layout.B5);
		b6 = (Button) findViewById(R.layout.B6);
		b7 = (Button) findViewById(R.layout.B7);
		b8 = (Button) findViewById(R.layout.B8);
		b9 = (Button) findViewById(R.layout.B8);
		bdot = (Button) findViewById(R.layout.Bdot);
		bdel = (Button) findViewById(R.layout.Bdel);
		beq = (Button) findViewById(R.layout.Beq);
		badd = (Button) findViewById(R.layout.Badd);
		bsub = (Button) findViewById(R.layout.Bsub);
		bmul = (Button) findViewById(R.layout.Bmul);
		bdiv = (Button) findViewById(R.layout.Bdiv);
		bper = (Button) findViewById(R.layout.Bper);

		editText1 = (TextView) findViewById(R.layout.editText1);//TextView - A user interface element that displays text to the user.

		b0.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				editText1.setText(editText1.getText()+"0");//getText() - Return the text(CharSequence) that TextView is displaying.
			}
		});
		b1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				editText1.setText(editText1.getText() + "1");//setText(CharSequence text) - Sets the text to be displayed.
			}
		});
		b2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				editText1.setText(editText1.getText() + "2");
			}
		});
		b3.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				editText1.setText(editText1.getText() + "3");
			}
		});
		b4.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				editText1.setText(editText1.getText() + "4");
			}
		});
		b5.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				editText1.setText(editText1.getText() + "5");
			}
		});
		b6.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				editText1.setText(editText1.getText() + "6");
			}
		});
		b7.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				editText1.setText(editText1.getText() + "7");
			}
		});
		b8.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				editText1.setText(editText1.getText() + "8");
			}
		});
		b9.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				editText1.setText(editText1.getText() + "9");
			}
		});
		bdot.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				editText1.setText(editText1.getText() + ".");
			}
		});
		badd.setOnClickListener(new View.OnClickListenet(){
			@Override
			public void onClick(View v){
				if(editText1.getText().length() != 0){
					val1 = Float.parseFloat(editText1.getText() + "");
					add = true;
					editText1.setText(null);
				}
				else{
					editText1.setText("");
				}
			}
		});
		bsub.setOnClickListener(new View.OnClickListenet(){
			@Override
			public void onClick(View v){
				if(editText1.getText().length() != 0){
					val1 = Float.parseFloat(editText1.getText() + "");
					sub = true;
					editText1.setText(null);
				}
				else{
					editText1.setText("");
				}
			}
		});
		bmul.setOnClickListener(new View.OnClickListenet(){
			@Override
			public void onClick(View v){
				if(editText1.getText().length() != 0){
					val1 = Float.parseFloat(editText1.getText() + "");
					mul = true;
					editText1.setText(null);
				}
				else{
					editText1.setText("");
				}
			}
		});
		bdiv.setOnClickListener(new View.OnClickListenet(){
			@Override
			public void onClick(View v){
				if(editText1.getText().length() != 0){
					val1 = Float.parseFloat(editText1.getText() + "");
					div = true;
					editText1.setText(null);
				}
				else{
					editText1.setText("");
				}
			}
		});
		
		bper.setOnClickListener(new View.OnClickListenet(){
			@Override
			public void onClick(View v){
				if(editText1.getText().length() != 0){
					val1 = Float.parseFloat(editText1.getText() + "");
					per = true;
					editText1.setText(null);
				}
				else{
					editText1.setText("");
				}
			}
		});
		beq.setOnClickListener(new View.OnClickListenet(){
			@Override
			public void onClick(View v){
				val2 = Float.parseFloat(editText1.getText() + "");
				if(div == true){
					editText1.setText(val1 / val2 + "");
					div = false;
				}
				if(mul == true){
					editText1.setText(val1 * val2 + "");
					mul = false;
				}
				if(add == true){
					editText1.setText(val1 + val2 + "");
					add = false;
				}
				if(sub == true){
					editText1.setText(val1 - val2 + "");
					sub = false;
				}
				if(per == true){
					editText1.setText(val1 * 100 + "");
					per = false;
				}
			}
		});
		bdel.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				editText1.setText("");
			}
		});
	}
}
