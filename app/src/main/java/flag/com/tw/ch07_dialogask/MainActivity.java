package flag.com.tw.ch07_dialogask;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv = (TextView) findViewById(R.id.txv);

        new AlertDialog.Builder(this)
                .setTitle("Android問卷調查")
                .setIcon(android.R.drawable.ic_menu_edit)
                .setMessage("你喜歡Android手機嗎？")
                .setNeutralButton("沒意見", this)
                .setNegativeButton("不喜歡", this)
                .setPositiveButton("喜歡", this)
                .setCancelable(false)
                .show();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        if(i == DialogInterface.BUTTON_POSITIVE) txv.setText("你喜歡Android手機");
        else if(i == DialogInterface.BUTTON_NEGATIVE) txv.setText("你不喜歡Android手機");
        else if(i == DialogInterface.BUTTON_NEUTRAL) txv.setText("要不要試試Android手機？");
    }
}
