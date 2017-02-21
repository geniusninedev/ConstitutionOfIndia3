package nineinfosys.constitutionofindia.Article;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import nineinfosys.constitutionofindia.R;


public class ArticleDetails extends AppCompatActivity {
    WebView tutorialsWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tutorialsWebView = (WebView) findViewById(R.id.CallTutorialWebViwIdd);
        tutorialsWebView.setBackgroundColor(0x00000000);
        WebSettings webSetting = tutorialsWebView.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        tutorialsWebView.setWebViewClient(new ArticleDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            tutorialsWebView.loadUrl("file:///android_asset/one.html");
        } else if (position == 1) {
            tutorialsWebView.loadUrl("file:///android_asset/two.html");
        } else if (position == 2) {
            tutorialsWebView.loadUrl("file:///android_asset/thr.html");
        } else if (position == 3) {
            tutorialsWebView.loadUrl("file:///android_asset/four.html");
        } else if (position == 4) {
            tutorialsWebView.loadUrl("file:///android_asset/five.html");

        } else if (position == 5) {
            tutorialsWebView.loadUrl("file:///android_asset/six.html");
        } else if (position == 6) {
            tutorialsWebView.loadUrl("file:///android_asset/seven.html");
        }

        else if (position == 7) {
            tutorialsWebView.loadUrl("file:///android_asset/eight.html");
        }
        else if (position == 8) {
            tutorialsWebView.loadUrl("file:///android_asset/nine.html");
        }
        else if (position == 9) {
            tutorialsWebView.loadUrl("file:///android_asset/ten.html");
        } else if (position == 10) {
            tutorialsWebView.loadUrl("file:///android_asset/ele.html");
        } else if (position == 11) {
            tutorialsWebView.loadUrl("file:///android_asset/twelve.html");
        } else if (position == 12) {
            tutorialsWebView.loadUrl("file:///android_asset/thrteen.html");
        } else if (position == 13) {
            tutorialsWebView.loadUrl("file:///android_asset/fourteen.html");
        } else if (position == 14) {
            tutorialsWebView.loadUrl("file:///android_asset/fifteen.html");
        } else if (position == 15) {
            tutorialsWebView.loadUrl("file:///android_asset/sixt.html");
        } else if (position == 16) {
            tutorialsWebView.loadUrl("file:///android_asset/sevt.html");
        } else if (position == 17) {
            tutorialsWebView.loadUrl("file:///android_asset/eigh.html");
        } else if (position == 18) {
            tutorialsWebView.loadUrl("file:///android_asset/nint.html");
        } else if (position == 19) {
            tutorialsWebView.loadUrl("file:///android_asset/nint.html");
        } else if (position == 20) {
            tutorialsWebView.loadUrl("file:///android_asset/twent.html");
        } else if (position == 21) {
            tutorialsWebView.loadUrl("file:///android_asset/twento.html");
        } else if (position == 22) {
            tutorialsWebView.loadUrl("file:///android_asset/twentwo.html");
        } else if (position == 23) {
            tutorialsWebView.loadUrl("file:///android_asset/twenthr.html");
        } else if (position == 24) {
            tutorialsWebView.loadUrl("file:///android_asset/twenfour.html");
        } else if (position == 25) {
            tutorialsWebView.loadUrl("file:///android_asset/twenfive.html");
        } else if (position == 26) {
            tutorialsWebView.loadUrl("file:///android_asset/twensix.html");
        } else if (position == 27) {
            tutorialsWebView.loadUrl("file:///android_asset/twensev.html");
        } else if (position == 28) {
            tutorialsWebView.loadUrl("file:///android_asset/tweneigh.html");
        } else if (position == 29) {
            tutorialsWebView.loadUrl("file:///android_asset/twennine.html");
        } else if (position == 30) {
            tutorialsWebView.loadUrl("file:///android_asset/thrty.html");
        } else if (position == 31) {
            tutorialsWebView.loadUrl("file:///android_asset/thyone.html");
        } else if (position == 32) {
            tutorialsWebView.loadUrl("file:///android_asset/thytwo.html");
        } else if (position == 33) {
            tutorialsWebView.loadUrl("file:///android_asset/thythr.html");
        } else if (position == 34) {
            tutorialsWebView.loadUrl("file:///android_asset/thyfr.html");
        } else if (position == 35) {
            tutorialsWebView.loadUrl("file:///android_asset/thyfive.html");
        } else if (position == 36) {
            tutorialsWebView.loadUrl("file:///android_asset/thysix.html");
        } else if (position == 37) {
            tutorialsWebView.loadUrl("file:///android_asset/thysev.html");
        } else if (position == 38) {
            tutorialsWebView.loadUrl("file:///android_asset/thyeigh.html");
        } else if (position == 39) {
            tutorialsWebView.loadUrl("file:///android_asset/frty.html");
        } else if (position == 40) {
            tutorialsWebView.loadUrl("file:///android_asset/ftyone.html");
        } else if (position == 41) {
            tutorialsWebView.loadUrl("file:///android_asset/ftytwo.html");
        }

    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //  Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            //Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case android.R.id.home:

                this.finish();
                return true;
            default:
                if (id == R.id.action_send) {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_TEXT, "message to share");
                    startActivity(Intent.createChooser(i, "Share via"));
                    return true;
                }
                return super.onOptionsItemSelected(item);

        }
    }

}


