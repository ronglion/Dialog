package com.example.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Dialog extends AlertDialog.Builder{
	
	private View mDialogView;
	
	private TextView mTitle;

	public Dialog(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		mDialogView = View.inflate(context, R.layout.dialog, null);
        setView(mDialogView);

        mTitle = (TextView) mDialogView.findViewById(R.id.alertTitle);
		
	}
	
	@Override
    public Dialog setTitle(CharSequence text) {
        mTitle.setText(text);
        return this;
    }
	
	 public Dialog setCustomView(int resId, Context context) {
	    	View customView = View.inflate(context, resId, null);
	    	((FrameLayout)mDialogView.findViewById(R.id.customPanel)).addView(customView);
	    	return this;
	    }


}
