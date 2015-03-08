package com.mauriciotogneri.shoppingcart.widgets;

import java.util.HashMap;
import java.util.Map;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;

public class Fonts
{
	private static final Map<String, Typeface> fonts = new HashMap<String, Typeface>();
	private static final String FONTS_PATH = "fonts/";
	
	public static final String OPEN_SANS = "0";
	public static final String GLYPHICONS = "1";
	public static final String FONT_AWESOME = "2";
	public static final String ICO_MOON = "3";
	
	public static void init(Context context)
	{
		Fonts.loadFont(context.getAssets(), "opensans", Fonts.OPEN_SANS);
		Fonts.loadFont(context.getAssets(), "glyphicons", Fonts.GLYPHICONS);
		Fonts.loadFont(context.getAssets(), "fontawesome", Fonts.FONT_AWESOME);
		Fonts.loadFont(context.getAssets(), "icomoon", Fonts.ICO_MOON);
	}
	
	private static void loadFont(AssetManager assets, String name, String key)
	{
		Fonts.fonts.put(key, Typeface.createFromAsset(assets, Fonts.FONTS_PATH + name + ".ttf"));
	}
	
	public static Typeface getFont(String name, int style)
	{
		Typeface fontFamily = Fonts.fonts.get(name);
		
		return Typeface.create(fontFamily, style);
	}
	
	public static Typeface getFont(String name)
	{
		return Fonts.getFont(name, Typeface.NORMAL);
	}
}