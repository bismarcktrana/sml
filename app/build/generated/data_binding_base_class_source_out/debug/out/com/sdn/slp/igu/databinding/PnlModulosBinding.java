// Generated by view binder compiler. Do not edit!
package com.sdn.slp.igu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdn.slp.igu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PnlModulosBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout ItemMenu;

  @NonNull
  public final LinearLayout optdts;

  @NonNull
  public final LinearLayout optorden;

  @NonNull
  public final LinearLayout optreportes;

  @NonNull
  public final LinearLayout optsincronizar;

  @NonNull
  public final LinearLayout optusuario;

  private PnlModulosBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout ItemMenu,
      @NonNull LinearLayout optdts, @NonNull LinearLayout optorden,
      @NonNull LinearLayout optreportes, @NonNull LinearLayout optsincronizar,
      @NonNull LinearLayout optusuario) {
    this.rootView = rootView;
    this.ItemMenu = ItemMenu;
    this.optdts = optdts;
    this.optorden = optorden;
    this.optreportes = optreportes;
    this.optsincronizar = optsincronizar;
    this.optusuario = optusuario;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PnlModulosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PnlModulosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.pnl_modulos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PnlModulosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout ItemMenu = (LinearLayout) rootView;

      id = R.id.optdts;
      LinearLayout optdts = ViewBindings.findChildViewById(rootView, id);
      if (optdts == null) {
        break missingId;
      }

      id = R.id.optorden;
      LinearLayout optorden = ViewBindings.findChildViewById(rootView, id);
      if (optorden == null) {
        break missingId;
      }

      id = R.id.optreportes;
      LinearLayout optreportes = ViewBindings.findChildViewById(rootView, id);
      if (optreportes == null) {
        break missingId;
      }

      id = R.id.optsincronizar;
      LinearLayout optsincronizar = ViewBindings.findChildViewById(rootView, id);
      if (optsincronizar == null) {
        break missingId;
      }

      id = R.id.optusuario;
      LinearLayout optusuario = ViewBindings.findChildViewById(rootView, id);
      if (optusuario == null) {
        break missingId;
      }

      return new PnlModulosBinding((LinearLayout) rootView, ItemMenu, optdts, optorden, optreportes,
          optsincronizar, optusuario);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
