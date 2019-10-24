package com.example.service_5170411002

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        facebook.setOnClickListener({

            val i = Intent(Intent.ACTION_VIEW , Uri.parse("https://id-id.facebook.com/login/"))
            startActivity(i)
        })

        instagram.setOnClickListener({

            val i = Intent(Intent.ACTION_VIEW , Uri.parse("https://www.instagram.com/accounts/login/?hl=id"))
            startActivity(i)
        })
        var MediaPlayer: MediaPlayer? =  MediaPlayer.create(this,R.raw.`Xxxtencation changes (64  kbps)`)
        
        play.setOnClickListener{
            MediaPlayer?.start()
        }
        pause.setOnClickListener{
            MediaPlayer?.pause()
        }

        stop.setOnClickListener{
            MediaPlayer?.start()
            MediaPlayer?.seekTo(0)
        }

    }
}
