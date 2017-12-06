package com.example.ryan.flavoursdemo;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ryan.flavoursdemo.dummy.DummyContent;
import com.squareup.picasso.Picasso;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_NAME = "item_name";
    public static final String ARG_ITEM_TEXT = "item_text";
    public static final String ARG_ITEM_IMAGE = "item_image";

    /**
     * The dummy content this fragment is presenting.
     */
    private String mName, mText, mImage;


    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_NAME)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.

            Bundle bundle = getArguments();
            mName = bundle.getString(ARG_ITEM_NAME);
            mText = bundle.getString(ARG_ITEM_TEXT);
            mImage = bundle.getString(ARG_ITEM_IMAGE);

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mName);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);

            ((TextView) rootView.findViewById(R.id.item_detail)).setText(mText);
            rootView.findViewById(R.id.ivImage);

            if(mImage!=""){
                Picasso.with(getContext()).load(mImage).into((ImageView) rootView.findViewById(R.id.ivImage));
            }

            else{
                Toast.makeText(getContext(), "No image found for this character.", Toast.LENGTH_SHORT).show();
            }
        
        return rootView;
    }
}
