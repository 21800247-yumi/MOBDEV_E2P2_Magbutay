package com.example.mobdev_e2p2_magbutay;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}

private ActivityMainBinding binding ;
@Override
protected void onCreate ( Bundle savedInstanceState ) {
    super . onCreate ( savedInstanceState ) ;
    // Inflate the layout using ViewBinding
    binding = ActivityMainBinding . inflate ( getLayoutInflater () ) ;
    setContentView ( binding . getRoot () ) ;

    // Now you can access views directly !
    binding . btnSubmit . setOnClickListener ( v -> validateLogin () ) ;
}