package com.example.android.clubs_connect.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.clubs_connect.R;
import com.example.android.clubs_connect.model.Message;
import com.example.android.clubs_connect.view.MessageViewHolder;

import java.util.ArrayList;

/**
 * Created by ProfessorTaha on 3/3/2018.
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageViewHolder> {
    private ArrayList<Message> mMessages;


    public MessageAdapter(Context context) {

    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.chat_message_row_self, parent
                ,false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        holder.bindMessage(mMessages.get(position));

    }

    @Override
    public int getItemCount() {
        return mMessages.size();
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.chat_message_row_self;
    }

    public void setMessages(ArrayList<Message> dummyChatHistory){
        mMessages = dummyChatHistory;
    }
}
