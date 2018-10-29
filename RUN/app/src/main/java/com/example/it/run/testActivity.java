package com.example.it.run;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.flipboard.bottomsheet.BottomSheetLayout;

public class testActivity extends AppCompatActivity {

    private Context context;
    BottomSheetLayout bottomSheet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        bottomSheet = (BottomSheetLayout) findViewById(R.id.bottomsheet);
        context=this;

        Button button=(Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                new MyFragment().show(getSuppo)
            }
        });

    }

}
