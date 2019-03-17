package tisaj.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FirstNum = (EditText) findViewById(R.id.FirstNum);
                EditText secoundNumEdit = (EditText) findViewById(R.id.secondNumEditText);
                TextView resuTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(FirstNum.getText().toString());
                int num2 = Integer.parseInt((secoundNumEdit.getText().toString()));
                int result = num1 + num2;
                resuTextView.setText(result + "");

            }
        });
    }
}
