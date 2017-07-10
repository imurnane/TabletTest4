package au.com.boxdev.tablettest4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t = (TextView) findViewById(R.id.masterTextView);
        t.setText("MainActivity just wrote some text programmatically");
    }

    public void onClickButton(View v) {
        // check if in dual view mode (fragment exists)
        if (findViewById(R.id.fragmentLayout) == null) {
            // standard phone display
            Intent i = new Intent(this, DetailActivity.class);
            this.startActivity(i);
        } else {
            // landscape tablet mode
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentLayout, new DetailFragment()) // .replace or .add
                    .commit();
        }
    }

}
