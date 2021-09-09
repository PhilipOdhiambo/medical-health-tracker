// Generated code from Butter Knife. Do not modify!
package com.philipowino.medicalhealthtracker;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BmiActivity_ViewBinding implements Unbinder {
  private BmiActivity target;

  @UiThread
  public BmiActivity_ViewBinding(BmiActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BmiActivity_ViewBinding(BmiActivity target, View source) {
    this.target = target;

    target.height = Utils.findRequiredViewAsType(source, R.id.heightEditText, "field 'height'", EditText.class);
    target.weight = Utils.findRequiredViewAsType(source, R.id.weightEditText, "field 'weight'", EditText.class);
    target.calculateButton = Utils.findRequiredViewAsType(source, R.id.calculateButton, "field 'calculateButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BmiActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.height = null;
    target.weight = null;
    target.calculateButton = null;
  }
}
