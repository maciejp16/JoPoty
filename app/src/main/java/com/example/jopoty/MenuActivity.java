package com.example.jopoty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

public class MenuActivity extends AppCompatActivity {
    private static final String TAG = "MenuActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.getMenu();
    }

    protected void getMenu() {
        final TextView textView = (TextView) findViewById(R.id.response);
        Log.v(TAG, "getMenu");
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://192.168.1.204:5544";
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.v(TAG, "onResponse");
                        Log.v(TAG,"Blad Apki");
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.v(TAG, "onErrorResponse" + error.getMessage());
                        textView.setText("That didn't work!");
                    }
                }
        );
        Log.v(TAG, "queue.add");
        queue.add(jsonArrayRequest);
    }
}

