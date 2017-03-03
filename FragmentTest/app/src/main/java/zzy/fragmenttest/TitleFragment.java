package zzy.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Author: 张智远  PC:MZ
 * Time: 2017/3/2 15:14
 * Email: 826680069@qq.com
 * Instruction: please enter class instruction here
 */
public class TitleFragment extends Fragment{
    View mView;
    Button mButton;

    //创建改fragment布局

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.titlefragment, null);
        mButton = (Button) mView.findViewById(R.id.butTon);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "addCountent", Toast.LENGTH_SHORT).show();
            }
        });
        return mView;

    }
}
