// Generated code from Butter Knife. Do not modify!
package yackeen.com.faragallah.Brands;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import yackeen.com.faragallah.R;

public class BrandsAdapter$ViewHolder_ViewBinding implements Unbinder {
  private BrandsAdapter.ViewHolder target;

  @UiThread
  public BrandsAdapter$ViewHolder_ViewBinding(BrandsAdapter.ViewHolder target, View source) {
    this.target = target;

    target.textView = Utils.findRequiredViewAsType(source, R.id.text, "field 'textView'", TextView.class);
    target.imageView = Utils.findRequiredViewAsType(source, R.id.logo, "field 'imageView'", ImageView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progress, "field 'progressBar'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BrandsAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textView = null;
    target.imageView = null;
    target.progressBar = null;
  }
}
