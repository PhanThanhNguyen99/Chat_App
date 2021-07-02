package com.example.streamchatdemo

import android.app.Application
import io.getstream.chat.android.client.ChatClient
import io.getstream.chat.android.client.logger.ChatLogLevel
import io.getstream.chat.android.livedata.ChatDomain

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val client =
            ChatClient.Builder("27gzjvee5hzq", this).logLevel(ChatLogLevel.ALL).build()
        ChatDomain.Builder(client, this).build()
    }
}