package zzy.fragment02;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

//activity访问fragment
public class MainActivity extends FragmentActivity {
    private Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.btnMain);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Titlefragment titlefragment = (Titlefragment) getSupportFragmentManager().findFragmentById(R.id.ft_title);
                String msg2 = titlefragment.MsgTitle();
                Toast.makeText(MainActivity.this, msg2, Toast.LENGTH_SHORT).show();

            }
        });

    }

    public  String MsgMain(){
        return "activity中消息";
    }
}
