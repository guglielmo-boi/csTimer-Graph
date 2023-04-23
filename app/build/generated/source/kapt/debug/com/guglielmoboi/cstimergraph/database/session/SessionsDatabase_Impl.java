package com.guglielmoboi.cstimergraph.database.session;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SessionsDatabase_Impl extends SessionsDatabase {
  private volatile SessionsDao _sessionsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `sessions_table` (`sessionId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `start_date_time` TEXT NOT NULL, `end_date_time` TEXT NOT NULL, `first_solve_index` INTEGER NOT NULL, `last_solve_index` INTEGER NOT NULL, `size` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ade98bae860f7e96995390959f386a79')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `sessions_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsSessionsTable = new HashMap<String, TableInfo.Column>(7);
        _columnsSessionsTable.put("sessionId", new TableInfo.Column("sessionId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSessionsTable.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSessionsTable.put("start_date_time", new TableInfo.Column("start_date_time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSessionsTable.put("end_date_time", new TableInfo.Column("end_date_time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSessionsTable.put("first_solve_index", new TableInfo.Column("first_solve_index", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSessionsTable.put("last_solve_index", new TableInfo.Column("last_solve_index", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSessionsTable.put("size", new TableInfo.Column("size", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSessionsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSessionsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSessionsTable = new TableInfo("sessions_table", _columnsSessionsTable, _foreignKeysSessionsTable, _indicesSessionsTable);
        final TableInfo _existingSessionsTable = TableInfo.read(_db, "sessions_table");
        if (! _infoSessionsTable.equals(_existingSessionsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "sessions_table(com.guglielmoboi.cstimergraph.database.session.SessionEntity).\n"
                  + " Expected:\n" + _infoSessionsTable + "\n"
                  + " Found:\n" + _existingSessionsTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ade98bae860f7e96995390959f386a79", "e45ffc0a9bfb80e45e4f10a60d512448");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "sessions_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `sessions_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(SessionsDao.class, SessionsDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public SessionsDao getSessionsDao() {
    if (_sessionsDao != null) {
      return _sessionsDao;
    } else {
      synchronized(this) {
        if(_sessionsDao == null) {
          _sessionsDao = new SessionsDao_Impl(this);
        }
        return _sessionsDao;
      }
    }
  }
}
