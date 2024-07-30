package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

/*public class StudentAdmin extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_admin);

        Toolbar toolbar = findViewById(R.id.topAppBar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);


/*
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_student_dashboard:
                        // Handle navigation to StudentDashboard
                        Intent intent = new Intent(StudentAdmin.this, StudentDashboard.class);
                        startActivity(intent);
                        drawerLayout.closeDrawers();
                        return true;
                    // Handle other menu items if needed
                    case R.id.nav_admin_dashboard:
                        Intent intent = new Intent(StudentAdmin.this, AdminDashboard.class);
                        startActivity(intent);

                }
                return false;
            }
        });


        public void onStudentDashboardButtonClicked (View view){
            Intent intent = new Intent(StudentAdmin.this, StudentDashboard.class);
            startActivity(intent);
        }

        public void onAdminDashboardButtonClicked (View view){
            Intent intent = new Intent(StudentAdmin.this, AdminDashboard.class);
            startActivity(intent);
        }
    }
}*/





public class StudentAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_admin);

        Button studentPortalButton = findViewById(R.id.student_portal_button);
        Button adminPortalButton = findViewById(R.id.admin_portal_button);

        studentPortalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStudentPortal();
            }
        });

        adminPortalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdminPortal();
            }
        });
    }

    public void openStudentPortal() {
        // Implement the logic to open the Student Portal here
        Intent intent = new Intent(this, StudentDashboard.class);
        startActivity(intent);
    }

    public void openAdminPortal() {
        // Implement the logic to open the Admin Portal here
        Intent intent = new Intent(this,  AdminDashboard.class);
        startActivity(intent);
    }
}
