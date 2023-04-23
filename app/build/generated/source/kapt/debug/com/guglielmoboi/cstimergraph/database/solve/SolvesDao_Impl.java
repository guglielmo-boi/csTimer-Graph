package com.guglielmoboi.cstimergraph.database.solve;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SolvesDao_Impl implements SolvesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SolveEntity> __insertionAdapterOfSolveEntity;

  private final EntityDeletionOrUpdateAdapter<SolveEntity> __updateAdapterOfSolveEntity;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  private final SharedSQLiteStatement __preparedStmtOfClearSolvesWithinIndexes;

  public SolvesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSolveEntity = new EntityInsertionAdapter<SolveEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `solves_table` (`solveId`,`solve_index`,`number`,`time_string`,`comment`,`scramble`,`date_time`,`time`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SolveEntity value) {
        stmt.bindLong(1, value.getSolveId());
        stmt.bindLong(2, value.getSolveIndex());
        stmt.bindLong(3, value.getNumber());
        if (value.getTimeStr() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTimeStr());
        }
        if (value.getComment() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getComment());
        }
        if (value.getScramble() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getScramble());
        }
        if (value.getDateTime() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDateTime());
        }
        if (value.getTime() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTime());
        }
      }
    };
    this.__updateAdapterOfSolveEntity = new EntityDeletionOrUpdateAdapter<SolveEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `solves_table` SET `solveId` = ?,`solve_index` = ?,`number` = ?,`time_string` = ?,`comment` = ?,`scramble` = ?,`date_time` = ?,`time` = ? WHERE `solveId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SolveEntity value) {
        stmt.bindLong(1, value.getSolveId());
        stmt.bindLong(2, value.getSolveIndex());
        stmt.bindLong(3, value.getNumber());
        if (value.getTimeStr() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTimeStr());
        }
        if (value.getComment() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getComment());
        }
        if (value.getScramble() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getScramble());
        }
        if (value.getDateTime() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDateTime());
        }
        if (value.getTime() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTime());
        }
        stmt.bindLong(9, value.getSolveId());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM solves_table";
        return _query;
      }
    };
    this.__preparedStmtOfClearSolvesWithinIndexes = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM solves_table WHERE solve_index >= ? AND solve_index <= ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final SolveEntity solveEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSolveEntity.insert(solveEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final SolveEntity solveEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfSolveEntity.handle(solveEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object clear(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClear.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object clearSolvesWithinIndexes(final int firstSolveIndex, final int lastSolveIndex,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearSolvesWithinIndexes.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, firstSolveIndex);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, lastSolveIndex);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearSolvesWithinIndexes.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getSolvesWithinIndexes(final int firstSolveIndex, final int lastSolveIndex,
      final Continuation<? super List<SolveEntity>> continuation) {
    final String _sql = "SELECT * FROM solves_table WHERE solve_index >= ? AND solve_index <= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, firstSolveIndex);
    _argIndex = 2;
    _statement.bindLong(_argIndex, lastSolveIndex);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<SolveEntity>>() {
      @Override
      public List<SolveEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSolveId = CursorUtil.getColumnIndexOrThrow(_cursor, "solveId");
          final int _cursorIndexOfSolveIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "solve_index");
          final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
          final int _cursorIndexOfTimeStr = CursorUtil.getColumnIndexOrThrow(_cursor, "time_string");
          final int _cursorIndexOfComment = CursorUtil.getColumnIndexOrThrow(_cursor, "comment");
          final int _cursorIndexOfScramble = CursorUtil.getColumnIndexOrThrow(_cursor, "scramble");
          final int _cursorIndexOfDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "date_time");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final List<SolveEntity> _result = new ArrayList<SolveEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SolveEntity _item;
            final long _tmpSolveId;
            _tmpSolveId = _cursor.getLong(_cursorIndexOfSolveId);
            final int _tmpSolveIndex;
            _tmpSolveIndex = _cursor.getInt(_cursorIndexOfSolveIndex);
            final int _tmpNumber;
            _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
            final String _tmpTimeStr;
            if (_cursor.isNull(_cursorIndexOfTimeStr)) {
              _tmpTimeStr = null;
            } else {
              _tmpTimeStr = _cursor.getString(_cursorIndexOfTimeStr);
            }
            final String _tmpComment;
            if (_cursor.isNull(_cursorIndexOfComment)) {
              _tmpComment = null;
            } else {
              _tmpComment = _cursor.getString(_cursorIndexOfComment);
            }
            final String _tmpScramble;
            if (_cursor.isNull(_cursorIndexOfScramble)) {
              _tmpScramble = null;
            } else {
              _tmpScramble = _cursor.getString(_cursorIndexOfScramble);
            }
            final String _tmpDateTime;
            if (_cursor.isNull(_cursorIndexOfDateTime)) {
              _tmpDateTime = null;
            } else {
              _tmpDateTime = _cursor.getString(_cursorIndexOfDateTime);
            }
            final String _tmpTime;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmpTime = null;
            } else {
              _tmpTime = _cursor.getString(_cursorIndexOfTime);
            }
            _item = new SolveEntity(_tmpSolveId,_tmpSolveIndex,_tmpNumber,_tmpTimeStr,_tmpComment,_tmpScramble,_tmpDateTime,_tmpTime);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllSolves(final Continuation<? super List<SolveEntity>> continuation) {
    final String _sql = "SELECT * FROM solves_table ORDER BY date_time ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<SolveEntity>>() {
      @Override
      public List<SolveEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSolveId = CursorUtil.getColumnIndexOrThrow(_cursor, "solveId");
          final int _cursorIndexOfSolveIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "solve_index");
          final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
          final int _cursorIndexOfTimeStr = CursorUtil.getColumnIndexOrThrow(_cursor, "time_string");
          final int _cursorIndexOfComment = CursorUtil.getColumnIndexOrThrow(_cursor, "comment");
          final int _cursorIndexOfScramble = CursorUtil.getColumnIndexOrThrow(_cursor, "scramble");
          final int _cursorIndexOfDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "date_time");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final List<SolveEntity> _result = new ArrayList<SolveEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SolveEntity _item;
            final long _tmpSolveId;
            _tmpSolveId = _cursor.getLong(_cursorIndexOfSolveId);
            final int _tmpSolveIndex;
            _tmpSolveIndex = _cursor.getInt(_cursorIndexOfSolveIndex);
            final int _tmpNumber;
            _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
            final String _tmpTimeStr;
            if (_cursor.isNull(_cursorIndexOfTimeStr)) {
              _tmpTimeStr = null;
            } else {
              _tmpTimeStr = _cursor.getString(_cursorIndexOfTimeStr);
            }
            final String _tmpComment;
            if (_cursor.isNull(_cursorIndexOfComment)) {
              _tmpComment = null;
            } else {
              _tmpComment = _cursor.getString(_cursorIndexOfComment);
            }
            final String _tmpScramble;
            if (_cursor.isNull(_cursorIndexOfScramble)) {
              _tmpScramble = null;
            } else {
              _tmpScramble = _cursor.getString(_cursorIndexOfScramble);
            }
            final String _tmpDateTime;
            if (_cursor.isNull(_cursorIndexOfDateTime)) {
              _tmpDateTime = null;
            } else {
              _tmpDateTime = _cursor.getString(_cursorIndexOfDateTime);
            }
            final String _tmpTime;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmpTime = null;
            } else {
              _tmpTime = _cursor.getString(_cursorIndexOfTime);
            }
            _item = new SolveEntity(_tmpSolveId,_tmpSolveIndex,_tmpNumber,_tmpTimeStr,_tmpComment,_tmpScramble,_tmpDateTime,_tmpTime);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
