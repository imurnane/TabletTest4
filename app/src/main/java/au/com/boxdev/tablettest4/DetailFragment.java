package au.com.boxdev.tablettest4;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.content_detail, parentViewGroup, false);

        TextView t = (TextView) rootView.findViewById(R.id.detailTextView);
        t.setText("DetailFragment just wrote some text programmatically");

        return rootView;
    }

}
