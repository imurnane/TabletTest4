package au.com.boxdev.tablettest4;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            getFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, new DetailFragment())
                    .commit();
        }

        /*
        NOTE: android.R.id.content just points to the root view.
        In this case it's empty, so the view returned from DetailFragment
        becomes the root layout
         */
    }

}
