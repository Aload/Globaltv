package com.autism.globaltv.live.view;

import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.baselibs.EventBusLogicUtils;
import com.autism.baselibs.utils.ToastUtils;
import com.autism.baselibs.view.chat.ChatListView;
import com.autism.baselibs.view.chat.InputPanel;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.base.IPresenter;
import com.autism.globaltv.live.model.message.TextMsgView;
import com.autism.globaltv.live.pre.ChatListAdapter;

import io.rong.imlib.model.MessageContent;
import io.rong.message.TextMessage;

/**
 * Author：i5 on 2017/4/11 09:46
 * Used:GlobalTv
 */
public class ChatFra extends BaseFra<IPresenter> implements InputPanel.InputPanelListener, Handler.Callback, View.OnClickListener {

    private Handler mHandler = new Handler(this);
    private ChatListAdapter mListAdapter;
    private boolean login;
    private InputPanel inputPanel;

    @Override
    protected IPresenter getPresenter() {
        return null;
    }

    @Override
    protected void onInitFraView(View mView) {
        super.onInitFraView(mView);
        LiveKit.addEventHandler(mHandler);
        ChatListView mRvChat = (ChatListView) mView.findViewById(R.id.chat_msg);
        View mContainer = mView.findViewById(R.id.rl_chat_container);
        mContainer.setOnClickListener(this);
        mListAdapter = new ChatListAdapter();
        mRvChat.setAdapter(mListAdapter);

        inputPanel = (InputPanel) mView.findViewById(R.id.input_panel);
        inputPanel.setPanelListener(this);
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.chat_fra;
    }

    @Override
    public void onSendClick(String text) {
        if (!login) {
            ToastUtils.showToast(getActivity(), "请先登陆,谢谢~");
            return;
        }
        TextMessage content = TextMessage.obtain(text);
        LiveKit.sendMessage(content);
    }

    @Override
    public boolean handleMessage(Message msg) {
        MessageContent content = null;
        switch (msg.what) {
            case LiveKit.MESSAGE_ARRIVED: {
                content = (MessageContent) msg.obj;
                mListAdapter.addMessage(content);
                break;
            }
            case LiveKit.MESSAGE_SENT: {
                content = (MessageContent) msg.obj;
                mListAdapter.addMessage(content);
                break;
            }
            case LiveKit.MESSAGE_SEND_ERROR: {
                break;
            }
            default:
        }
        EventBusLogicUtils.postEvent(content);
        return false;
    }

    @Override
    public void onClick(View v) {
        inputPanel.onBackAction();
    }
}
