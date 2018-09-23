package com.example.sairam.mivi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    EditText userIdEditText;
    Button loginButton;
    String userIdString, responseId;
    String urlData= "https://gitlab.com/mfebrianto/mivi-ios-android-test/blob/master/collection.json";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userIdEditText= findViewById(R.id.edit_text_id);
        loginButton= findViewById(R.id.login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userIdString= userIdEditText.getText().toString().trim();
                if(userIdString.equals("2593177")){
                    Intent intent= new Intent(MainActivity.this, Splash.class);
                    startActivity(intent);
                }
                /*JsonObjectRequest jsonObjectRequest= new JsonObjectRequest(urlData, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONObject dataObject= response.getJSONObject("data");
                            responseId= dataObject.getString("id");

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("error in fetching",error.toString());
                        Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
                    }
                });
                MySingleton.getInstance(MainActivity.this).addToRequestQueue(jsonObjectRequest);
            */}
        });

    }
}
