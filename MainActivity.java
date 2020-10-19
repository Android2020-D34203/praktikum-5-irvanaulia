package id.ac.id.telkomuniversity.tass.irvanpratikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public Button login,lupa;
    public EditText nama,pas;
    public String NAME = "IRVAN";
    public String PASS = "123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama = findViewById(R.id.editTextTextPersonName);
        pas = findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.button);
        lupa = findViewById(R.id.button2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String user = nama.getText().toString();
                    String password = pas.getText().toString();
                    Intent r = new Intent(MainActivity.this, ActivityTwo.class);
                    r.putExtra(NAME, user);
                    r.putExtra(PASS, password);
                    startActivity(r);
            }
        });
        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(MainActivity.this, ActivityThree.class);
                startActivity(r);
            }
        });
    }
}