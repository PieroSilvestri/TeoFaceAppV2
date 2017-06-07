package pierosilvestri.it.teofaceappv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitGUI();
    }

    void InitGUI(){
        Button btnGet = (Button) findViewById(R.id.btnGet);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnGet_Clicked();
            }
        });

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnLogin_Clicked();
            }
        });

        Button btnRegistration = (Button) findViewById(R.id.btnRegistration);
        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnRegistration_Clicked();
            }
        });
    }


    void BtnGet_Clicked() {
        Log.d("MainActivity", "BTNGED_CLICKED");
    }

    void BtnLogin_Clicked() {
        Log.d("MainActivity", "BTNLOGIN_CLICKED");
    }

    void BtnRegistration_Clicked() {
        Log.d("MainActivity", "BTNREGISTRATION_CLICKED");

        Intent intent = new Intent(this, RegistrationActivity.class);

        startActivity(intent);

    }
}
