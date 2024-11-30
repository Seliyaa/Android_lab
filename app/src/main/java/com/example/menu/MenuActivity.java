package com.example.menu;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import com.example.linearlayout.R;

public class MenuActivity extends AppCompatActivity {

    private TextView testTextView;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //加载建好的菜单xml文件
        getMenuInflater().inflate(R.menu.menu1,menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //拿到菜单每项id,然后 switch判断具体是哪个菜单项，然后写点击后的具体操作
        int itemId = item.getItemId();
        if(itemId==R.id.small){
        testTextView.setTextSize(10);
        } else if (itemId==R.id.middle) {
            testTextView.setTextSize(16);
        } else if (itemId==R.id.large) {
            testTextView.setTextSize(20);
        } else if (itemId==R.id.menu_line2) {
            Toast.makeText(MenuActivity.this,"你点击了菜单选项",Toast.LENGTH_LONG).show();
        } else if (itemId==R.id.red) {
            testTextView.setTextColor(getResources().getColor(R.color.red));
        }else if (itemId==R.id.black) {
            testTextView.setTextColor(getResources().getColor(R.color.black));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        EdgeToEdge.enable(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        testTextView = findViewById(R.id.textView22);
//        toolbar.setTitle(getString(R.string.title1));

        setSupportActionBar(toolbar);
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        setSupportActionBar(binding.toolbar);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }


}