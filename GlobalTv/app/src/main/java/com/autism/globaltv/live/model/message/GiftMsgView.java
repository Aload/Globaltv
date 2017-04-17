package com.autism.globaltv.live.model.message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.autism.baselibs.view.chat.EmojiManager;
import com.autism.globaltv.R;

import io.rong.imlib.model.MessageContent;

public class GiftMsgView extends BaseMsgView {

    private TextView username;
    private TextView content;

    public GiftMsgView(Context context) {
        super(context);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.msg_gift_view, this);
        username = (TextView) view.findViewById(R.id.username);
        content = (TextView) view.findViewById(R.id.content);
    }

    @Override
    public void setContent(MessageContent msgContent) {
        GiftMessage msg = (GiftMessage) msgContent;
        username.setText(msg.getUserInfo().getName() + " ");
        content.setText(EmojiManager.parse(msg.getContent(), content.getTextSize()));
    }
}
