package uk.co.apptouch.souvlakistreet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class FragmentMain  extends android.app.Fragment {
    public static FragmentMain newInstance() {
        FragmentMain fragment = new FragmentMain();
        return fragment;
    }

    RelativeLayout layout;
    View myView;
    String dateResult, monday, tuesday, wednesday, thursday, friday, saturday, sunday;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_main, container, false);




        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        dateResult = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
        layout = myView.findViewById(R.id.relative_layout_main);



        switch (dateResult) {

            case "Monday": layout.setBackgroundResource(R.drawable.monday);

                break;

            case "Tuesday": layout.setBackgroundResource(R.drawable.tuesday);

                break;

            case "Wednesday":  layout.setBackgroundResource(R.drawable.wednesday);
                break;

            case "Thursday": layout.setBackgroundResource(R.drawable.thursday);
                break;

            case "Friday":
                break;

            case "Saturday":
                break;

            case "Sunday":
                break;

        }









        return myView;
    }
}
