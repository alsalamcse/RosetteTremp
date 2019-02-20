package draz.rosette.rosettetremp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class SignUpActivity extends AppCompatActivity {

    private EditText etName,etLastName,etPhone,etEmail;
    private ImageButton btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etName=(EditText)findViewById(R.id .etName) ;
        etLastName=(EditText)findViewById(R.id .etLastName) ;
        etPhone=(EditText) findViewById(R.id .etPhone) ;
        etEmail=(EditText) findViewById(R.id .etEmail) ;
        btnNext=(ImageButton)findViewById(R.id .btnNext) ;
      // auth=FirebaseAuth.getInstance();
      //  user=auth.getCurrentUser();//

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataHandler();
            }

            private void dataHandler() {
                boolean isok = true;//if all the fields filled well
                String email = etEmail.getText().toString();
                String FirstName = etName.getText().toString();
                String lastNAme = etLastName.getText().toString();
                String phone = etPhone.getText().toString();

                if (FirstName.length() < 3) {
                    etName.setError("Enter Your Name Please");
                    isok = false;
                }
                if (lastNAme.length() < 3) {
                    etLastName.setError("Enter Your Last Name Please");
                    isok = false;
                }
                if (isok) {
                    //     creatAcount(email,passw1);
                }
            }


        });


    }
}
