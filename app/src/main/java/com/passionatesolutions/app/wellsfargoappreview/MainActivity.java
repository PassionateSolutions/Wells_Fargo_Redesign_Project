package com.passionatesolutions.app.wellsfargoappreview;

import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

//TODO Plan UI: linear > relative (login) > slide > listview (products) > gridview (how can we help?) > linear(legal info)

public class MainActivity extends AppCompatActivity {

    // Toolbar Variables
    private Toolbar toolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mMenuToggle;

    // Card Variables
    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;

    // GridView Variables
    GridView gridView;
    String[] helpName = {"Locations", "Appointments", "Rates", "Contact", "New Checking Account", "Home Loan", "Find a Credit Card"};
    int[] helpIcons = {R.drawable.location, R.drawable.appointment, R.drawable.rates, R.drawable.contact, R.drawable.checking, R.drawable.home_loan, R.drawable.credit_card};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sets toolbar
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        // Main Activity DrawerLayout with Toggle
        mDrawerLayout = findViewById(R.id.main_activity_drawer_layout);

        // Menu Toggle Button
        mMenuToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(mMenuToggle);
        mMenuToggle.syncState();

        // Cards

        models = new ArrayList<>();
        models.add(new Model(R.drawable.online_offer, "$400 Online Offer", "New checking account customers.  Learn more."));
        models.add(new Model(R.drawable.propel_card, "Earn 3x points", "With $0 annual fee."));
        models.add(new Model(R.drawable.save_for_goals, "Save for your goals.", "Wells Fargo Savings Tools has your back."));
        models.add(new Model(R.drawable.credit_card_tips, "Credit card tips.", "Be in the loop and learn more."));

        adapter = new Adapter(models, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 0, 130, 0);

        // GridView

        gridView = findViewById(R.id.grid_view);

        customAdapter customAdapter = new customAdapter();
        gridView.setAdapter(customAdapter);

    }

    // Custom Adapter to display GridView data

    private class customAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return helpIcons.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.grid_data, null);

            TextView info = view1.findViewById(R.id.helper_text);
            ImageView iconImage = view1.findViewById(R.id.icons);

            info.setText(helpName[i]);
            iconImage.setImageResource(helpIcons[i]);

            return view1;
        }
    }

    @Override
    public void onBackPressed() {
        // Allows users to click the back button to close the drawer instead of just exiting the app while the
        // drawer is open
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START))
            mDrawerLayout.closeDrawer(GravityCompat.START);
        else {
            super.onBackPressed();
        }
    }

}
