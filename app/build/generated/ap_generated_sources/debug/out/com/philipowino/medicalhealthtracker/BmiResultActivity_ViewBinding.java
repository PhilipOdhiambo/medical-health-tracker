// Generated code from Butter Knife. Do not modify!
package com.philipowino.medicalhealthtracker;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BmiResultActivity_ViewBinding implements Unbinder {
  private BmiResultActivity target;

  @UiThread
  public BmiResultActivity_ViewBinding(BmiResultActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BmiResultActivity_ViewBinding(BmiResultActivity target, View source) {
    this.target = target;

    target.bmiTextView = Utils.findRequiredViewAsType(source, R.id.bmiTextView, "field 'bmiTextView'", TextView.class);
    target.okButton = Utils.findRequiredViewAsType(source, R.id.okButton, "field 'okButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BmiResultActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.bmiTextView = null;
    target.okButton = null;
  }
}
