package md596313fe914f6b1e48e56336dd99132aa;


public class AudioPlayer_VisualizerDataCaptureListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.audiofx.Visualizer.OnDataCaptureListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onFftDataCapture:(Landroid/media/audiofx/Visualizer;[BI)V:GetOnFftDataCapture_Landroid_media_audiofx_Visualizer_arrayBIHandler:Android.Media.Audiofx.Visualizer/IOnDataCaptureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onWaveFormDataCapture:(Landroid/media/audiofx/Visualizer;[BI)V:GetOnWaveFormDataCapture_Landroid_media_audiofx_Visualizer_arrayBIHandler:Android.Media.Audiofx.Visualizer/IOnDataCaptureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Avs.AudioPlayer+VisualizerDataCaptureListener, Xamarin.AlexaVoiceService, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AudioPlayer_VisualizerDataCaptureListener.class, __md_methods);
	}


	public AudioPlayer_VisualizerDataCaptureListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AudioPlayer_VisualizerDataCaptureListener.class)
			mono.android.TypeManager.Activate ("Xamarin.Avs.AudioPlayer+VisualizerDataCaptureListener, Xamarin.AlexaVoiceService, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onFftDataCapture (android.media.audiofx.Visualizer p0, byte[] p1, int p2)
	{
		n_onFftDataCapture (p0, p1, p2);
	}

	private native void n_onFftDataCapture (android.media.audiofx.Visualizer p0, byte[] p1, int p2);


	public void onWaveFormDataCapture (android.media.audiofx.Visualizer p0, byte[] p1, int p2)
	{
		n_onWaveFormDataCapture (p0, p1, p2);
	}

	private native void n_onWaveFormDataCapture (android.media.audiofx.Visualizer p0, byte[] p1, int p2);

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
