package com.example.android.clubs_connect;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.clubs_connect.controller.MessageAdapter;
import com.example.android.clubs_connect.model.Author;
import com.example.android.clubs_connect.model.Message;

import java.util.ArrayList;

/**
 * Created by ProfessorTaha on 3/3/2018.
 */

public class ChatActivity extends AppCompatActivity {
    //public static final String MESSAGES = "messages";

    //ArrayList<Message> mMessages;
    private RecyclerView mChatMessageRecyclerView;
    private Button mSendButton;
    private EditText mMessageEditText;


    private MessageAdapter mMessageAdapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.chat);
        mChatMessageRecyclerView = findViewById(R.id.recyclerView);
        mSendButton = findViewById(R.id.sendButton);
        mMessageEditText = findViewById(R.id.chatEditText);
        mMessageAdapter = new MessageAdapter(ChatActivity.this);
        //Just a quick demo with hard-coded strings
        ArrayList<Message> chatHistoryDemo = new ArrayList<Message>();
        chatHistoryDemo.add(new Message("wadup?", new Author("Dixie")));
        chatHistoryDemo.add(new Message("never better", new Author("FlagrantFouler")));
        mMessageAdapter.setMessages(chatHistoryDemo);
//        if(savedInstanceState != null && savedInstanceState.containsKey(MESSAGES)){
//            mMessages = (ArrayList<Message>) savedInstanceState.getSerializable(MESSAGES);
//        } else {
//            mMessages = new ArrayList<>();
//        }

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mChatMessageRecyclerView.setLayoutManager(lm);
        mChatMessageRecyclerView.setAdapter(mMessageAdapter);

    }

//    @Override
//    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
//        outState.putSerializable(MESSAGES, mMessages);
//    }
}
