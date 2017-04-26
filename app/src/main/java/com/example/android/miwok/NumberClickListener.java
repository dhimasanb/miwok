package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Griya Salbini on 4/26/2017.
 */

public class NumberClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),
                "Open the list of numbers", Toast.LENGTH_SHORT).show();
    }
}
