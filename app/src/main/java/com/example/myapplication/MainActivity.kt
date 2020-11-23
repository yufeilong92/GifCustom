package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.gif.GifDrawable
import com.example.myapplication.gif.GifDecoder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val url =
        "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1606106125843&di=eff828fd6a15fef3cfa23c34b438e324&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201611%2F04%2F20161104110413_XzVAk.gif"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*  Glide.with(this)
              .asGif()
              .load(url)
              .into(gif_view)
  */
        GifDecoder.with(this)
            .load(url)
            .into(gif_view)
    }
}