package id.ac.id.telkomuniversity.tass.irvanpratikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {
    public TextView username, password;
    public String nama2, pas2;
    public String NAME = "IRVAN";
    public String PASS = "123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        username = findViewById(R.id.textView3);
        password = findViewById(R.id.textView4);
        Bundle n = getIntent().getExtras();
        nama2 = n.getString(NAME);
        pas2 = n.getString(PASS);
        username.setText(nama2);
        password.setText(pas2);
    }
}