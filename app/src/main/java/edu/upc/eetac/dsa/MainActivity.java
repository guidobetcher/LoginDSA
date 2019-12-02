package edu.upc.eetac.dsa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText password;
    private Button logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.editTextUserName);
        password = (EditText)findViewById(R.id.editTextPassword);
        logIn = (Button)findViewById(R.id.buttonLogIn);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(name.getText().toString(), password.getText().toString());
            }
        });
    }

    private void  validate(String useName, String password){
        //Aqui mandamos el usuario y la contraseña a la API
    }
}
