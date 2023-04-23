package com.guglielmoboi.cstimergraph;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.guglielmoboi.cstimergraph.databinding.ActivityMainBindingImpl;
import com.guglielmoboi.cstimergraph.databinding.DialogContributorsBindingImpl;
import com.guglielmoboi.cstimergraph.databinding.DialogLicenseBindingImpl;
import com.guglielmoboi.cstimergraph.databinding.FragmentAboutBindingImpl;
import com.guglielmoboi.cstimergraph.databinding.FragmentDetailSessionBindingImpl;
import com.guglielmoboi.cstimergraph.databinding.FragmentDonateBindingImpl;
import com.guglielmoboi.cstimergraph.databinding.FragmentImportSessionBindingImpl;
import com.guglielmoboi.cstimergraph.databinding.FragmentLaunchBindingImpl;
import com.guglielmoboi.cstimergraph.databinding.FragmentRefreshSessionsBindingImpl;
import com.guglielmoboi.cstimergraph.databinding.FragmentSettingsBindingImpl;
import com.guglielmoboi.cstimergraph.databinding.FragmentViewSessionsBindingImpl;
import com.guglielmoboi.cstimergraph.databinding.ListItemSessionBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_DIALOGCONTRIBUTORS = 2;

  private static final int LAYOUT_DIALOGLICENSE = 3;

  private static final int LAYOUT_FRAGMENTABOUT = 4;

  private static final int LAYOUT_FRAGMENTDETAILSESSION = 5;

  private static final int LAYOUT_FRAGMENTDONATE = 6;

  private static final int LAYOUT_FRAGMENTIMPORTSESSION = 7;

  private static final int LAYOUT_FRAGMENTLAUNCH = 8;

  private static final int LAYOUT_FRAGMENTREFRESHSESSIONS = 9;

  private static final int LAYOUT_FRAGMENTSETTINGS = 10;

  private static final int LAYOUT_FRAGMENTVIEWSESSIONS = 11;

  private static final int LAYOUT_LISTITEMSESSION = 12;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(12);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guglielmoboi.cstimergraph.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guglielmoboi.cstimergraph.R.layout.dialog_contributors, LAYOUT_DIALOGCONTRIBUTORS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guglielmoboi.cstimergraph.R.layout.dialog_license, LAYOUT_DIALOGLICENSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guglielmoboi.cstimergraph.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guglielmoboi.cstimergraph.R.layout.fragment_detail_session, LAYOUT_FRAGMENTDETAILSESSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guglielmoboi.cstimergraph.R.layout.fragment_donate, LAYOUT_FRAGMENTDONATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guglielmoboi.cstimergraph.R.layout.fragment_import_session, LAYOUT_FRAGMENTIMPORTSESSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guglielmoboi.cstimergraph.R.layout.fragment_launch, LAYOUT_FRAGMENTLAUNCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guglielmoboi.cstimergraph.R.layout.fragment_refresh_sessions, LAYOUT_FRAGMENTREFRESHSESSIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guglielmoboi.cstimergraph.R.layout.fragment_settings, LAYOUT_FRAGMENTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guglielmoboi.cstimergraph.R.layout.fragment_view_sessions, LAYOUT_FRAGMENTVIEWSESSIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guglielmoboi.cstimergraph.R.layout.list_item_session, LAYOUT_LISTITEMSESSION);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGCONTRIBUTORS: {
          if ("layout/dialog_contributors_0".equals(tag)) {
            return new DialogContributorsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_contributors is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGLICENSE: {
          if ("layout/dialog_license_0".equals(tag)) {
            return new DialogLicenseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_license is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTABOUT: {
          if ("layout/fragment_about_0".equals(tag)) {
            return new FragmentAboutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAILSESSION: {
          if ("layout/fragment_detail_session_0".equals(tag)) {
            return new FragmentDetailSessionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail_session is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDONATE: {
          if ("layout/fragment_donate_0".equals(tag)) {
            return new FragmentDonateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_donate is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTIMPORTSESSION: {
          if ("layout/fragment_import_session_0".equals(tag)) {
            return new FragmentImportSessionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_import_session is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLAUNCH: {
          if ("layout/fragment_launch_0".equals(tag)) {
            return new FragmentLaunchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_launch is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREFRESHSESSIONS: {
          if ("layout/fragment_refresh_sessions_0".equals(tag)) {
            return new FragmentRefreshSessionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_refresh_sessions is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTINGS: {
          if ("layout/fragment_settings_0".equals(tag)) {
            return new FragmentSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIEWSESSIONS: {
          if ("layout/fragment_view_sessions_0".equals(tag)) {
            return new FragmentViewSessionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_view_sessions is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMSESSION: {
          if ("layout/list_item_session_0".equals(tag)) {
            return new ListItemSessionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_session is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "session");
      sKeys.put(2, "sessionListener");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(12);

    static {
      sKeys.put("layout/activity_main_0", com.guglielmoboi.cstimergraph.R.layout.activity_main);
      sKeys.put("layout/dialog_contributors_0", com.guglielmoboi.cstimergraph.R.layout.dialog_contributors);
      sKeys.put("layout/dialog_license_0", com.guglielmoboi.cstimergraph.R.layout.dialog_license);
      sKeys.put("layout/fragment_about_0", com.guglielmoboi.cstimergraph.R.layout.fragment_about);
      sKeys.put("layout/fragment_detail_session_0", com.guglielmoboi.cstimergraph.R.layout.fragment_detail_session);
      sKeys.put("layout/fragment_donate_0", com.guglielmoboi.cstimergraph.R.layout.fragment_donate);
      sKeys.put("layout/fragment_import_session_0", com.guglielmoboi.cstimergraph.R.layout.fragment_import_session);
      sKeys.put("layout/fragment_launch_0", com.guglielmoboi.cstimergraph.R.layout.fragment_launch);
      sKeys.put("layout/fragment_refresh_sessions_0", com.guglielmoboi.cstimergraph.R.layout.fragment_refresh_sessions);
      sKeys.put("layout/fragment_settings_0", com.guglielmoboi.cstimergraph.R.layout.fragment_settings);
      sKeys.put("layout/fragment_view_sessions_0", com.guglielmoboi.cstimergraph.R.layout.fragment_view_sessions);
      sKeys.put("layout/list_item_session_0", com.guglielmoboi.cstimergraph.R.layout.list_item_session);
    }
  }
}
