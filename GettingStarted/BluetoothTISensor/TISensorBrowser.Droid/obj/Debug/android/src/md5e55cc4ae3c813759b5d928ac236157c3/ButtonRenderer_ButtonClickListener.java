package md5e55cc4ae3c813759b5d928ac236157c3;


public class ButtonRenderer_ButtonClickListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Forms.Platform.Android.ButtonRenderer+ButtonClickListener, Xamarin.Forms.Platform.Android, Version=1.2.3.0, Culture=neutral, PublicKeyToken=null", ButtonRenderer_ButtonClickListener.class, __md_methods);
	}


	public ButtonRenderer_ButtonClickListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ButtonRenderer_ButtonClickListener.class)
			mono.android.TypeManager.Activate ("Xamarin.Forms.Platform.Android.ButtonRenderer+ButtonClickListener, Xamarin.Forms.Platform.Android, Version=1.2.3.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}