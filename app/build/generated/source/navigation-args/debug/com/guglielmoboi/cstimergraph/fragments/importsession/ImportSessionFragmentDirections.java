package com.guglielmoboi.cstimergraph.fragments.importsession;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.guglielmoboi.cstimergraph.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ImportSessionFragmentDirections {
  private ImportSessionFragmentDirections() {
  }

  @NonNull
  public static ActionImportSessionFragmentToViewSessionsFragment actionImportSessionFragmentToViewSessionsFragment(
      ) {
    return new ActionImportSessionFragmentToViewSessionsFragment();
  }

  public static class ActionImportSessionFragmentToViewSessionsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionImportSessionFragmentToViewSessionsFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionImportSessionFragmentToViewSessionsFragment setImportSession(
        boolean importSession) {
      this.arguments.put("importSession", importSession);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("importSession")) {
        boolean importSession = (boolean) arguments.get("importSession");
        __result.putBoolean("importSession", importSession);
      } else {
        __result.putBoolean("importSession", false);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_importSessionFragment_to_viewSessionsFragment;
    }

    @SuppressWarnings("unchecked")
    public boolean getImportSession() {
      return (boolean) arguments.get("importSession");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionImportSessionFragmentToViewSessionsFragment that = (ActionImportSessionFragmentToViewSessionsFragment) object;
      if (arguments.containsKey("importSession") != that.arguments.containsKey("importSession")) {
        return false;
      }
      if (getImportSession() != that.getImportSession()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getImportSession() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionImportSessionFragmentToViewSessionsFragment(actionId=" + getActionId() + "){"
          + "importSession=" + getImportSession()
          + "}";
    }
  }
}
