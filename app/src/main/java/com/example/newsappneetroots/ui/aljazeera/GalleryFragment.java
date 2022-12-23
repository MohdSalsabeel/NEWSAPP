package com.example.newsappneetroots.ui.aljazeera;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.newsappneetroots.R;
import com.example.newsappneetroots.WebViewController;
import com.example.newsappneetroots.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    //private GalleryViewModel galleryViewModel;
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //galleryViewModel =
             //   new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView webView=root.findViewById(R.id.webViewAljazeera);
        // We are using webView to load bbc website
        webView.loadUrl("https://www.aljazeera.com/");
        // We are using WebViewController to see news in our app
        webView.setWebViewClient(new WebViewController());


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}