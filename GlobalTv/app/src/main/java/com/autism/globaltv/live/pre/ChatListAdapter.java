package com.autism.globaltv.live.pre;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.autism.globaltv.live.model.message.BaseMsgView;
import com.autism.globaltv.live.model.message.UnknownMsgView;
import com.autism.globaltv.live.view.LiveKit;

import java.util.ArrayList;

import io.rong.imlib.model.MessageContent;

public class ChatListAdapter extends BaseAdapter {

    private ArrayList<MessageContent> msgList;

    public ChatListAdapter() {
        msgList = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return msgList.size();
    }

    @Override
    public Object getItem(int position) {
        return msgList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BaseMsgView baseMsgView = (BaseMsgView) convertView;
        MessageContent msgContent = msgList.get(position);
        Class<? extends BaseMsgView> msgViewClass = LiveKit.getRegisterMessageView(msgContent.getClass());
        if (msgViewClass == null) {
            baseMsgView = new UnknownMsgView(parent.getContext());
        } else if (baseMsgView == null || baseMsgView.getClass() != msgViewClass) {
            try {
                baseMsgView = msgViewClass.getConstructor(Context.class).newInstance(parent.getContext());
            } catch (Exception e) {
                throw new RuntimeException("baseMsgView newInstance failed.");
            }
        }
        baseMsgView.setContent(msgContent);
        return baseMsgView;
    }

    public void addMessage(MessageContent msg) {
        msgList.add(msg);
    }
}
