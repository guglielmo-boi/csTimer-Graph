package com.guglielmoboi.cstimergraph.fragments.viewsessions;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.guglielmoboi.cstimergraph.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ViewSessionsFragmentDirections {
  private ViewSessionsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionViewSessionsFragmentToRefreshSessionsFragment() {
    return new ActionOnlyNavDirections(R.id.action_viewSessionsFragment_to_refreshSessionsFragment);
  }

  @NonNull
  public static ActionViewSessionsFragmentToDetailSessionFragment actionViewSessionsFragmentToDetailSessionFragment(
      long sessionId) {
    return new ActionViewSessionsFragmentToDetailSessionFragment(sessionId);
  }

  public static class ActionViewSessionsFragmentToDetailSessionFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionViewSessionsFragmentToDetailSessionFragment(long sessionId) {
      this.arguments.put("sessionId", sessionId);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionViewSessionsFragmentToDetailSessionFragment setSessionId(long sessionId) {
      this.arguments.put("sessionId", sessionId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("sessionId")) {
        long sessionId = (long) arguments.get("sessionId");
        __result.putLong("sessionId", sessionId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_viewSessionsFragment_to_detailSessionFragment;
    }

    @SuppressWarnings("unchecked")
    public long getSessionId() {
      return (long) arguments.get("sessionId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionViewSessionsFragmentToDetailSessionFragment that = (ActionViewSessionsFragmentToDetailSessionFragment) object;
      if (arguments.containsKey("sessionId") != that.arguments.containsKey("sessionId")) {
        return false;
      }
      if (getSessionId() != that.getSessionId()) {
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
      result = 31 * result + (int)(getSessionId() ^ (getSessionId() >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionViewSessionsFragmentToDetailSessionFragment(actionId=" + getActionId() + "){"
          + "sessionId=" + getSessionId()
          + "}";
    }
  }
}
