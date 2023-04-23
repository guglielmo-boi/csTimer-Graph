package com.guglielmoboi.cstimergraph.fragments.detailsession;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailSessionFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailSessionFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DetailSessionFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailSessionFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailSessionFragmentArgs __result = new DetailSessionFragmentArgs();
    bundle.setClassLoader(DetailSessionFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("sessionId")) {
      long sessionId;
      sessionId = bundle.getLong("sessionId");
      __result.arguments.put("sessionId", sessionId);
    } else {
      throw new IllegalArgumentException("Required argument \"sessionId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailSessionFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    DetailSessionFragmentArgs __result = new DetailSessionFragmentArgs();
    if (savedStateHandle.contains("sessionId")) {
      long sessionId;
      sessionId = savedStateHandle.get("sessionId");
      __result.arguments.put("sessionId", sessionId);
    } else {
      throw new IllegalArgumentException("Required argument \"sessionId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public long getSessionId() {
    return (long) arguments.get("sessionId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("sessionId")) {
      long sessionId = (long) arguments.get("sessionId");
      __result.putLong("sessionId", sessionId);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("sessionId")) {
      long sessionId = (long) arguments.get("sessionId");
      __result.set("sessionId", sessionId);
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
    DetailSessionFragmentArgs that = (DetailSessionFragmentArgs) object;
    if (arguments.containsKey("sessionId") != that.arguments.containsKey("sessionId")) {
      return false;
    }
    if (getSessionId() != that.getSessionId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (int)(getSessionId() ^ (getSessionId() >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "DetailSessionFragmentArgs{"
        + "sessionId=" + getSessionId()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull DetailSessionFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(long sessionId) {
      this.arguments.put("sessionId", sessionId);
    }

    @NonNull
    public DetailSessionFragmentArgs build() {
      DetailSessionFragmentArgs result = new DetailSessionFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setSessionId(long sessionId) {
      this.arguments.put("sessionId", sessionId);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public long getSessionId() {
      return (long) arguments.get("sessionId");
    }
  }
}
