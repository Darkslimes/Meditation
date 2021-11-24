package com.example.meditation;

import android.media.Image;
import android.net.Uri;
import android.widget.ImageButton;

import java.net.MalformedURLException;
import java.net.URL;

public class NetworkUnits {
    private static final String MEDITATION_API_BASE_URL = "mskko2021.mad.hakta.pro/api";
    private static final String MEDITATION_GET = "GET /feelings";
    private static final String PARAM_IMAGE = "images";
    public static URL generateURL(String images) {
        Uri buildUri = Uri.parse(MEDITATION_API_BASE_URL + MEDITATION_GET)
                .buildUpon()
                .appendQueryParameter(PARAM_IMAGE, images)
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
