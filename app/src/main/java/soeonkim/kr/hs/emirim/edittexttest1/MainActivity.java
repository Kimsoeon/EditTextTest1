package soeonkim.kr.hs.emirim.edittexttest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    TextView textResult; //이렇게 메소드 밖에선언해야 익명 클래스?? 에서 사용 가능
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.edit1);
        Button but_ok = (Button)findViewById(R.id.but_ok);
        textResult = (TextView)findViewById(R.id.text_result);
        but_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edit1.getText().toString();
                textResult.setText("입력한 성명은 : " + name);
            }
        });
    }
}
