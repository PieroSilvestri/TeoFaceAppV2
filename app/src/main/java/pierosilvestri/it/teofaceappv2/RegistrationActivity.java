package pierosilvestri.it.teofaceappv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        InitGui();


    }

    void InitGui(){

        Button btnDone = (Button) findViewById(R.id.btnDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnDone_Clicked();
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
}
