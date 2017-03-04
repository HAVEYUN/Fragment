package zzy.fragment03;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Author: 张智远  PC:MZ
 * Time: 2017/3/4 14:02
 * Email: 826680069@qq.com
 * Instruction: please enter class instruction here
 */
public class MenuFragment extends Fragment {
    private String[] array = new String[]{"android", "ios", "windrow phone"};
    MenuItem mMenuItem;

    ListView lvmenu;
    View mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.menu, null);
        lvmenu = (ListView) mView.findViewById(R.id.lvmenu);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, array);
        lvmenu.setAdapter(adapter);

        //具体实现方法在MainActivity中实现
        lvmenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> view, View view1, int position, long l) {
                mMenuItem.onSelect(position);

            }
        });

        return mView;
    }

    //1 定义一接口
    public interface MenuItem {
        public void onSelect(int posiotion);
    }
//3、捕获接口实现并与activity通信
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            mMenuItem=(MenuItem)activity;
        }catch(ClassCastException e){

            throw new ClassCastException(activity.toString() + "没有实现OnMenuItemSelectedListener接口");
        }

    }
}
