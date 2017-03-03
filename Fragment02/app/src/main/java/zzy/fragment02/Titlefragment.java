package zzy.fragment02;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Author: 张智远  PC:MZ
 * Time: 2017/3/3 10:30
 * Email: 826680069@qq.com
 * Instruction: fragment中访问activity
 */
public class Titlefragment extends Fragment {
    View mView;
    private static final String TAG = "Titlefragment";//logt+回车 快速生标签

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.title, null);

        Button button = (Button) mView.findViewById(R.id.btnAdd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity) getActivity();
                String msg = mainActivity.MsgMain();
                Log.i(TAG, msg);
                Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();

            }
        });

        return mView;

    }

    public  String MsgTitle(){
        return "fragment中消息";
    }
}
