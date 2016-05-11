package com.pawel_rutkowski.databind.model;

import android.view.View;
import android.widget.Toast;

/**
 * Created by rutko_000 on 2016-05-11.
 */
public class Handlers {
    public void onClickDeleted(View view) {
        Toast.makeText(view.getContext(), "Bla bla", Toast.LENGTH_LONG).show();
    }
    public void onClickCurrent(View view) {
        Toast.makeText(view.getContext(), "asd asd", Toast.LENGTH_LONG).show();
    }
}