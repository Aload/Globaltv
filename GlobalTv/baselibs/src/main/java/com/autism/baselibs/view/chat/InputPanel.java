package com.autism.baselibs.view.chat;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.autism.baselibs.R;

public class InputPanel extends LinearLayout implements EmojiBoard.OnEmojiItemClickListener {

    private final Context mContext;

    private ViewGroup inputBar;
    private EditText textEditor;
    private ImageView emojiBtn;
    private TextView sendBtn;
    private EmojiBoard emojiBoard;

    private InputPanelListener listener;

    @Override
    public void onClick(String code) {

        if (code.equals("/DEL")) {
            textEditor.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
        } else {
            textEditor.getText().insert(textEditor.getSelectionStart(), code);
        }
    }

    public interface InputPanelListener {
        void onSendClick(String text);
    }

    public InputPanel(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        initView();
    }

    private void initView() {
        LayoutInflater.from(getContext()).inflate(R.layout.widget_input_panel, this);
        inputBar = (ViewGroup) findViewById(R.id.input_bar);
        textEditor = (EditText) findViewById(R.id.input_editor);
        emojiBtn = (ImageView) findViewById(R.id.input_emoji_btn);
        sendBtn = (TextView) findViewById(R.id.input_send);
        emojiBoard = (EmojiBoard) findViewById(R.id.input_emoji_board);

        textEditor.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                inputBar.setSelected(hasFocus);
                emojiBtn.setSelected(emojiBoard.getVisibility() == VISIBLE);
            }
        });
        textEditor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                sendBtn.setEnabled(!s.toString().isEmpty());
                int start = textEditor.getSelectionStart();
                int end = textEditor.getSelectionEnd();
                textEditor.removeTextChangedListener(this);
                CharSequence cs = EmojiManager.parse(s.toString(), textEditor.getTextSize());
                textEditor.setText(cs, TextView.BufferType.SPANNABLE);
                textEditor.setSelection(start, end);
                textEditor.addTextChangedListener(this);
            }
        });

        emojiBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                emojiBoard.setVisibility(emojiBoard.getVisibility() == VISIBLE ? GONE : VISIBLE);
                emojiBtn.setSelected(emojiBoard.getVisibility() == VISIBLE);
            }
        });

        sendBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onSendClick(textEditor.getText().toString());
                }
                textEditor.getText().clear();
            }
        });

        emojiBoard.setItemClickListener(this);
    }

    public void setPanelListener(InputPanelListener l) {
        listener = l;
    }

    /**
     * back键或者空白区域点击事件处理
     *
     * @return 已处理true, 否则false
     */
    public boolean onBackAction() {
        if (emojiBoard.getVisibility() == VISIBLE) {
            emojiBoard.setVisibility(GONE);
            emojiBtn.setSelected(false);
            return true;
        }
        return false;
    }
}
