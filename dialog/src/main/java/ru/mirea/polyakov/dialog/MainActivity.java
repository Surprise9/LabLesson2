package ru.mirea.polyakov.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Alert
    public void onClickShowDialog(View view) {
        MyAlertDialogFragment dialogFragment = new MyAlertDialogFragment ();
        dialogFragment.show(getSupportFragmentManager(), "dialog");
    }
    //Time
    public void onClickShowMyTimeDialog(View view) {
        MyTimeDialogFragment dialogFragment = new MyTimeDialogFragment ();
        dialogFragment.show(getSupportFragmentManager(), "dialog");
    }
    //Date
    public void onClickShowMyDateDialog(View view) {
        MyDateDialogFragment dialogFragment = new MyDateDialogFragment ();
        dialogFragment.show(getSupportFragmentManager(), "dialog");
    }
    //Progress
    public void onClickShowMyProgressDialog(View view) {
        MyProgressDialogFragment dialogFragment = new MyProgressDialogFragment ();
        dialogFragment.show(getSupportFragmentManager(), "dialog");
    }



    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onYesClicked() {
        Toast.makeText(getApplicationContext(), "Норм",
                Toast.LENGTH_LONG).show();
    }

    public void onNoClicked() {
        Toast.makeText(getApplicationContext(), "Не норм",
                Toast.LENGTH_LONG).show();
    }

}
