package vn.edu.tdc.project_ltdd2_nhom5;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class AddTransactionActivity extends AppCompatActivity {
    TextView txtChonNgay;
    DatePickerDialog datePickerDialog;
    Calendar c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_transaction);
        txtChonNgay = (TextView) findViewById(R.id.txtChonNgay);
        txtChonNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get(Calendar.YEAR);
                datePickerDialog = new DatePickerDialog(AddTransactionActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        txtChonNgay.setText(dayOfMonth + "/" + month + "/" + year);
                    }
                }, day, month, year);
                datePickerDialog.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_them_giao_dich,menu);

        return super.onCreateOptionsMenu(menu);
    }


}
