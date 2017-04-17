package com.autism.globaltv.base;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.autism.baselibs.view.chat.InputPanel;
import com.autism.globaltv.R;

public class BottomPanelFragment extends BaseFra {

    private static final String TAG = "BottomPanelFragment";

    private ViewGroup buttonPanel;
    private ImageView btnInput;
    private InputPanel inputPanel;

    @Override
    protected IPresenter getPresenter() {
        return null;
    }

    @Override
    protected void onInitFraView(View mView) {
        super.onInitFraView(mView);
        buttonPanel = (ViewGroup) mView.findViewById(R.id.button_panel);
        btnInput = (ImageView) mView.findViewById(R.id.btn_input);
        inputPanel = (InputPanel) mView.findViewById(R.id.input_panel);

        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonPanel.setVisibility(View.GONE);
                inputPanel.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.fragment_bottombar;
    }

    /**
     * back键或者空白区域点击事件处理
     *
     * @return 已处理true, 否则false
     */
    public boolean onBackAction() {
        if (inputPanel.onBackAction()) {
            return true;
        }
        if (buttonPanel.getVisibility() != View.VISIBLE) {
            inputPanel.setVisibility(View.GONE);
            buttonPanel.setVisibility(View.VISIBLE);
            return true;
        }
        return false;
    }

    public void setInputPanelListener(InputPanel.InputPanelListener l) {
        inputPanel.setPanelListener(l);
    }
}
