package ru.mirea.polyakov.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyDateDialogFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){

        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpd = new DatePickerDialog(getActivity(), this, year, month, dayOfMonth);

        TextView tvTitle = new TextView(getActivity());
        tvTitle.setText("MyData");
        tvTitle.setBackgroundColor(Color.parseColor("#EEE8AA"));
        tvTitle.setPadding(5, 3, 5, 3);
        tvTitle.setGravity(Gravity.CENTER_HORIZONTAL);
        dpd.setCustomTitle(tvTitle);
        /*.........End custom title section........*/

        return dpd;
    }

    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth){

        TextView tv = (TextView) getActivity().findViewById(R.id.tv);

        tv.setText("Your chosen date is...\n\n");

        tv.setText(tv.getText()+ String.valueOf(dayOfMonth)+ "." +
                String.valueOf(month+1) + "." +
                String.valueOf(year) + "\n");
    }

}
