package zzy.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Author: 张智远  PC:MZ
 * Time: 2017/3/2 15:42
 * Email: 826680069@qq.com
 * Instruction: please enter class instruction here
 */
public class ContentFragment extends Fragment {
    View mView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.contentfragment, null);
        TextView textView = (TextView) mView.findViewById(R.id.txtView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Content内容", Toast.LENGTH_SHORT).show();
            }
        });
        return mView;
    }
}
