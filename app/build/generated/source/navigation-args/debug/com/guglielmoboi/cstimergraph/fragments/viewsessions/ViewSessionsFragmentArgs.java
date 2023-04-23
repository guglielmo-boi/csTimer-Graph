package com.guglielmoboi.cstimergraph.fragments.viewsessions;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ViewSessionsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ViewSessionsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private ViewSessionsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ViewSessionsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ViewSessionsFragmentArgs __result = new ViewSessionsFragmentArgs();
    bundle.setClassLoader(ViewSessionsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("importSession")) {
      boolean importSession;
      importSession = bundle.getBoolean("importSession");
      __result.arguments.put("importSession", importSession);
    } else {
      __result.arguments.put("importSession", false);
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ViewSessionsFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    ViewSessionsFragmentArgs __result = new ViewSessionsFragmentArgs();
    if (savedStateHandle.contains("importSession")) {
      boolean importSession;
      importSession = savedStateHandle.get("importSession");
      __result.arguments.put("importSession", importSession);
    } else {
      __result.arguments.put("importSession", false);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public boolean getImportSession() {
    return (boolean) arguments.get("importSession");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("importSession")) {
      boolean importSession = (boolean) arguments.get("importSession");
      __result.putBoolean("importSession", importSession);
    } else {
      __result.putBoolean("importSession", false);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("importSession")) {
      boolean importSession = (boolean) arguments.get("importSession");
      __result.set("importSession", importSession);
    } else {
      __result.set("importSession", false);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ViewSessionsFragmentArgs that = (ViewSessionsFragmentArgs) object;
    if (arguments.containsKey("importSession") != that.arguments.containsKey("importSession")) {
      return false;
    }
    if (getImportSession() != that.getImportSession()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getImportSession() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ViewSessionsFragmentArgs{"
        + "importSession=" + getImportSession()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull ViewSessionsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public ViewSessionsFragmentArgs build() {
      ViewSessionsFragmentArgs result = new ViewSessionsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setImportSession(boolean importSession) {
      this.arguments.put("importSession", importSession);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public boolean getImportSession() {
      return (boolean) arguments.get("importSession");
    }
  }
}
