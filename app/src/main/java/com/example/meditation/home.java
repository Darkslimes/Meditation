package com.example.meditation;

import static com.example.meditation.NetworkUnits.generateURL;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class home extends AppCompatActivity {
private  AsyncTask<String,Void,Bitmap> img1;
private  AsyncTask<String,Void,Bitmap> img2;
private  AsyncTask<String,Void,Bitmap> img3;
private  AsyncTask<String,Void,Bitmap> img4;
private  AsyncTask<String,Void,Bitmap> img5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        img1 = new DownloadImageTask((ImageView) findViewById(R.id.image1)).execute("http://mskko2021.mad.hakta.pro/uploads/feeling/calm%20(4).png");
        img2 = new DownloadImageTask((ImageView) findViewById(R.id.image2)).execute("http://mskko2021.mad.hakta.pro/uploads/feeling/Relax.png");
        img3 = new DownloadImageTask((ImageView) findViewById(R.id.image3)).execute("http://mskko2021.mad.hakta.pro/uploads/feeling/Focus.png");
        img4 = new DownloadImageTask((ImageView) findViewById(R.id.image4)).execute("http://mskko2021.mad.hakta.pro/uploads/feeling/Focus.png");
        img5 = new DownloadImageTask((ImageView) findViewById(R.id.image5)).execute("http://mskko2021.mad.hakta.pro/uploads/feeling/calm%20(4).png");
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}



