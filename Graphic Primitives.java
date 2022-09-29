import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);

/*createBitmap(int width, int height, Bitmap.Config config) - Returns a mutable bitmap with the specified width and height.
Bitmap.Config -  A bitmap configuration describes how pixels are stored. This affects the quality (color depth) as well as the ability to display transparent/translucent colors.
Possible bitmap configurations : ALPHA_4, ARGB_4444, ARGB_8888( each pixel is stroed on 4 bytes), RGB_F16(8 bytes)*/


		ImageView i = (ImageView) findViewById(R.id.imageView);// Displays image resources, for example Bitmap or Drawable resources. ImageView is also commonly used to apply tints to an image and handle image scaling.
		i.setBakgroundDrawable(new BitmapDrawable(bg));
/*
//A Drawable that wraps a bitmap and can be tiled, stretched, or aligned. You can create a BitmapDrawable from a file path, an input stream, through XML inflation, or from a Bitmap object.
*/
		Canvas canvas = new Canvas(bg);

/* The Canvas class holds the "draw" calls. To draw something, you need 4 basic components: A Bitmap to hold the pixels, a Canvas to host the draw calls (writing into the bitmap), a drawing primitive (e.g. Rect, Path, text, Bitmap), and a paint (to describe the colors and styles for the drawing).
Canvas(Bitmap bitmap) - Construct a canvas with the specified bitmap to draw into.

*/
		Paint paint = new Paint(); //The Paint class holds the style and color information about how to draw geometries, text and bitmaps.
		paint.setColor(Color.BLUE);
/*setColor(int color) - Set the paint's color.
The Color class provides methods for creating, converting and manipulating colors. We are using constants.
*/
		paint.setTextSize(50);// setTextSize(float textSize) - Set the paint's text size.
		canvas.drawText("Rectangle", 420, 150, paint);//drawText (String text, float x, float y, Paint paint)
		canvas.drawRect(400, 100, 650, 700, paint);
		canvas.drawText("Circle", 120, 150, paint);
		canvas.drawCircle(200, 350, 150, paint);//drawCircle(float cx, float cy, float radius, Paint paint) - Draw the specified circle using the specified paint.
		canvas.drawText("Square", 120, 800, paint);
		canvas.drawRect(50, 850, 350, 1150, paint);// drawRect (float left, float top, float right, float bottom, Paint paint)
		canvas.drawText("Line", 480, 300, paint);
		canvas.drawLine(520, 850, 520, 1150, paint);//drawLine (float startX, float startY, float stopX, float stopY, Paint paint)
	}
}
