package zzy.fragment03;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Author: 张智远  PC:MZ
 * Time: 2017/3/4 13:58
 * Email: 826680069@qq.com
 * Instruction: please enter class instruction here
 */
public class ContentFragment extends Fragment {
    View mView;
    TextView txtCont;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.content, null);

         txtCont = (TextView) mView.findViewById(R.id.txtCont);
        return mView;
    }

    public void ShowMsgContent(String msg){
        txtCont.setText(msg);

    }

}
