package com.guglielmoboi.cstimergraph.database.solve;

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
public final class SolvesDatabase_Impl extends SolvesDatabase {
  private volatile SolvesDao _solvesDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `solves_table` (`solveId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `solve_index` INTEGER NOT NULL, `number` INTEGER NOT NULL, `time_string` TEXT NOT NULL, `comment` TEXT NOT NULL, `scramble` TEXT NOT NULL, `date_time` TEXT NOT NULL, `time` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cfc4b256e3185783ba25164745752413')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `solves_table`");
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
        final HashMap<String, TableInfo.Column> _columnsSolvesTable = new HashMap<String, TableInfo.Column>(8);
        _columnsSolvesTable.put("solveId", new TableInfo.Column("solveId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSolvesTable.put("solve_index", new TableInfo.Column("solve_index", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSolvesTable.put("number", new TableInfo.Column("number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSolvesTable.put("time_string", new TableInfo.Column("time_string", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSolvesTable.put("comment", new TableInfo.Column("comment", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSolvesTable.put("scramble", new TableInfo.Column("scramble", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSolvesTable.put("date_time", new TableInfo.Column("date_time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSolvesTable.put("time", new TableInfo.Column("time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSolvesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSolvesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSolvesTable = new TableInfo("solves_table", _columnsSolvesTable, _foreignKeysSolvesTable, _indicesSolvesTable);
        final TableInfo _existingSolvesTable = TableInfo.read(_db, "solves_table");
        if (! _infoSolvesTable.equals(_existingSolvesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "solves_table(com.guglielmoboi.cstimergraph.database.solve.SolveEntity).\n"
                  + " Expected:\n" + _infoSolvesTable + "\n"
                  + " Found:\n" + _existingSolvesTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "cfc4b256e3185783ba25164745752413", "f86e60a62c77cbd43e0e5cd4be04f16b");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "solves_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `solves_table`");
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
    _typeConvertersMap.put(SolvesDao.class, SolvesDao_Impl.getRequiredConverters());
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
  public SolvesDao getSolvesDao() {
    if (_solvesDao != null) {
      return _solvesDao;
    } else {
      synchronized(this) {
        if(_solvesDao == null) {
          _solvesDao = new SolvesDao_Impl(this);
        }
        return _solvesDao;
      }
    }
  }
}
