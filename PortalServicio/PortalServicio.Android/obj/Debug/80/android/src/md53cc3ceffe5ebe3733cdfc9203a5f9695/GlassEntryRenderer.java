package md53cc3ceffe5ebe3733cdfc9203a5f9695;


public class GlassEntryRenderer
	extends md51558244f76c53b6aeda52c8a337f2c37.EntryRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PortalServicio.Droid.Controls.GlassEntryRenderer, PortalServicio.Android", GlassEntryRenderer.class, __md_methods);
	}


	public GlassEntryRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == GlassEntryRenderer.class)
			mono.android.TypeManager.Activate ("PortalServicio.Droid.Controls.GlassEntryRenderer, PortalServicio.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public GlassEntryRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == GlassEntryRenderer.class)
			mono.android.TypeManager.Activate ("PortalServicio.Droid.Controls.GlassEntryRenderer, PortalServicio.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public GlassEntryRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == GlassEntryRenderer.class)
			mono.android.TypeManager.Activate ("PortalServicio.Droid.Controls.GlassEntryRenderer, PortalServicio.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}

	private java.util.ArrayList refList;
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
