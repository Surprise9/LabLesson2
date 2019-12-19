package ru.mirea.polyakov.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState){

        ProgressDialog pd = new ProgressDialog(getActivity());
        pd.setTitle("Вечная загрузка");
        pd.setMessage("Все норм?");
        pd.setProgressStyle(0);
        pd.setButton("Да", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                ((MainActivity)getActivity()).onYesClicked();
                dialog.cancel();
            }
        });
        pd.setButton2("Нет", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                ((MainActivity)getActivity()).onNoClicked();
                dialog.cancel();
            }
        });

        return pd;
    }
}
