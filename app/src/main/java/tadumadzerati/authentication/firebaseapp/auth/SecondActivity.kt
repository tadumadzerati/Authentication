package tadumadzerati.authentication.firebaseapp.auth

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Toast.makeText(this, "You have logged in succesfully",
                Toast.LENGTH_SHORT).show()

        Picasso.get().load("https://i.imgur.com/kuWF73R.jpg").into(imageView1);
        Picasso.get().load("https://i.imgur.com/vcrUlR6.jpg").into(imageView2);
        Picasso.get().load("https://i.imgur.com/NyezTQT.jpg").into(imageView3);
        Picasso.get().load("https://i.imgur.com/sDAZL5P.jpg").into(imageView4);
        Picasso.get().load("https://i.imgur.com/Y8NEE5q.jpg").into(imageView5);
        Picasso.get().load("https://i.imgur.com/MyLnU9o.jpg").into(imageView6);
        Picasso.get().load("https://i.imgur.com/MlSN2xD.jpg").into(imageView7);


        btnSignOut.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "You have been signed out",
                    Toast.LENGTH_SHORT).show()
        }
    }
}
