package lance.wico.com.wicolancelab3;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView Palawan = (TextView) findViewById(R.id.textView);
        TextView Location = (TextView) findViewById(R.id.textView2);
        TextView Distance = (TextView) findViewById(R.id.textView3);

        Typeface Custom1 = Typeface.createFromAsset(getAssets(), "fonts/yorkwhiteletter.ttf");
        Typeface Custom2 = Typeface.createFromAsset(getAssets(), "fonts/KGDefyingGravity.ttf");

        Palawan.setTypeface(Custom1);
        Location.setTypeface(Custom2);
        Distance.setTypeface(Custom2);


    }
}
