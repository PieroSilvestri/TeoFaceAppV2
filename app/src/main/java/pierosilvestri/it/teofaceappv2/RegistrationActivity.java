package pierosilvestri.it.teofaceappv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    private static final String TAG = "REGISTRATIONACTIVITY";
    private Button btnDone;
    private ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        InitGui();


    }

    void InitGui(){

        btnDone = (Button) findViewById(R.id.btnDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnDone_Clicked();
            }
        });

        img1 = (ImageView)findViewById(R.id.imgView1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img1_Clicked();
            }
        });

        img2 = (ImageView)findViewById(R.id.imgView2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img2_Clicked();
            }
        });

    }

    void BtnDone_Clicked(){
        EditText editName = (EditText) findViewById(R.id.editTextName);
        EditText editsurname = (EditText) findViewById(R.id.editTextSurname);
        EditText editEmail = (EditText) findViewById(R.id.editTextEmail);

        if(editName.getText().toString() == "" || editsurname.getText().toString() == "" || editEmail.getText().toString() == ""){
            Toast.makeText(this, "You have to complete all fields.", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "All done.", Toast.LENGTH_SHORT).show();
        }
    }

    void Img1_Clicked(){
        Log.d(TAG, "Img1_Clicked");
    }

    void Img2_Clicked(){
        Log.d(TAG, "Img2_Clicked");
    }

}
