package com.xteam.war3.utils;

import android.content.Context;
import android.graphics.Typeface;

public class TextUtils {
	
	private Context mContext;
	
	public TextUtils(Context context) {
		mContext = context;
	}
	
	public Typeface getBoldTypeface() {
		Typeface typeface = Typeface.createFromAsset(mContext.getAssets(), "Roboto-Bold.ttf");
		return typeface;
	}

	public Typeface getNormalTypeface() {
		Typeface typeface = Typeface.createFromAsset(mContext.getAssets(), "FT-Regular.ttf");
		return typeface;
	}
	public static String ToDBC(String input) {
		   char[] c = input.toCharArray();
		   for (int i = 0; i< c.length; i++) {
		       if (c[i] == 12288) {
		         c[i] = (char) 32;
		         continue;
		       }if (c[i]> 65280&& c[i]< 65375)
		          c[i] = (char) (c[i] - 65248);
		       }
		   return new String(c);
	}
	
    public static String halfWidthToFullWidth(String s) {
        char[] source = s.toCharArray();
        for (int i = 0; i < source.length; i++) {
            if (source[i] == ' ') {
                source[i] = (char)12288;
            } else if (source[i] >= 33 && source[i] <= 126) {
                source[i] = (char)(source[i] + 65248);
            } else {
                source[i] = source[i];
            }
        }
        return new String(source);
    }
}
