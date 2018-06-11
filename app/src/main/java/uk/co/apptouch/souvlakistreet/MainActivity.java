package uk.co.apptouch.souvlakistreet;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            android.app.FragmentManager fragmentManager = getFragmentManager();
            switch (item.getItemId()) {

                case R.id.navigation_home:
                   fragmentManager.beginTransaction().replace(R.id.content_frame, new FragmentMain()).commit();
                    return true;
                case R.id.navigation_menu:
                    fragmentManager.beginTransaction().replace(R.id.content_frame, new FragmentTwo()).commit();
                    return true;
                case R.id.navigation_location:
                    fragmentManager.beginTransaction().replace(R.id.content_frame, new FragmentThree()).commit();
                    return true;
                case R.id.navigation_payment:
                    fragmentManager.beginTransaction().replace(R.id.content_frame, new FragmentFour()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        android.app.FragmentManager fragmentManager = getFragmentManager();

        setContentView(R.layout.activity_main);
        fragmentManager.beginTransaction().replace(R.id.content_frame, new FragmentMain()).commit();

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



    }

}
