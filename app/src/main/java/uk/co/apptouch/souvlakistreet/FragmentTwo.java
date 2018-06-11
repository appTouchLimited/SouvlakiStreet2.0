package uk.co.apptouch.souvlakistreet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentTwo extends android.app.Fragment {
    public static FragmentTwo newInstance() {
        FragmentTwo fragment = new FragmentTwo();
        return fragment;
    }

    View myView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_two, container, false);

        return myView;

    }
}
