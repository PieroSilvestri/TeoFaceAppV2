package pierosilvestri.it.teofaceappv2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationActivity extends AppCompatActivity {

    private static final String TAG = "REGISTRATIONACTIVITY";
    static final int REQUEST_IMAGE_CAPTURE = 1;
    static final int REQUEST_TAKE_PHOTO = 1;
    private Button btnDone;

    private int value;
    private ImageView img1, img2;
    String mCurrentPhotoPath;

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
        EditText editSurname = (EditText) findViewById(R.id.editTextSurname);
        EditText editEmail = (EditText) findViewById(R.id.editTextEmail);

        if(editName.getText().toString() == "" || editSurname.getText().toString() == "" || editEmail.getText().toString() == ""){
            Toast.makeText(this, "You have to complete all fields.", Toast.LENGTH_SHORT).show();
        }else{
            //Toast.makeText(this, "All done.", Toast.LENGTH_SHORT).show();
        }

        Bitmap img1Value = ((BitmapDrawable)img1.getDrawable()).getBitmap();
        Bitmap img2Value = ((BitmapDrawable)img2.getDrawable()).getBitmap();

        Person newPerson = new Person(editName.getText().toString(),
                editSurname.getText().toString(),
                editEmail.getText().toString(),
                img1Value,
                img2Value);


        img1.setImageBitmap(img2Value);
        img2.setImageBitmap(img1Value);
    }

    void Img1_Clicked(){
        Log.d(TAG, "Img1_Clicked");
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            value = 1;
            // TODO cercare un metodo migliore
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
        // TODO CROP IMAGE
    }

    void Img2_Clicked(){
        Log.d(TAG, "Img2_Clicked");
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            value = 2;
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            if(value == 1){
                img1.setImageBitmap(imageBitmap);
            }else if(value == 2){
                img2.setImageBitmap(imageBitmap);
            }else{
                Log.d(TAG, "ERROR. VALUE NOT FOUND.");
            }
        }
    }



}
