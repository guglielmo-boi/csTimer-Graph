package com.guglielmoboi.cstimergraph.database.session;

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
import java.lang.Integer;
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
public final class SessionsDao_Impl implements SessionsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SessionEntity> __insertionAdapterOfSessionEntity;

  private final EntityDeletionOrUpdateAdapter<SessionEntity> __updateAdapterOfSessionEntity;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  private final SharedSQLiteStatement __preparedStmtOfClearSession;

  public SessionsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSessionEntity = new EntityInsertionAdapter<SessionEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `sessions_table` (`sessionId`,`name`,`start_date_time`,`end_date_time`,`first_solve_index`,`last_solve_index`,`size`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SessionEntity value) {
        stmt.bindLong(1, value.getSessionId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getStartDateTime() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getStartDateTime());
        }
        if (value.getEndDateTime() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEndDateTime());
        }
        stmt.bindLong(5, value.getFirstSolveIndex());
        stmt.bindLong(6, value.getLastSolveIndex());
        stmt.bindLong(7, value.getSize());
      }
    };
    this.__updateAdapterOfSessionEntity = new EntityDeletionOrUpdateAdapter<SessionEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `sessions_table` SET `sessionId` = ?,`name` = ?,`start_date_time` = ?,`end_date_time` = ?,`first_solve_index` = ?,`last_solve_index` = ?,`size` = ? WHERE `sessionId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SessionEntity value) {
        stmt.bindLong(1, value.getSessionId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getStartDateTime() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getStartDateTime());
        }
        if (value.getEndDateTime() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEndDateTime());
        }
        stmt.bindLong(5, value.getFirstSolveIndex());
        stmt.bindLong(6, value.getLastSolveIndex());
        stmt.bindLong(7, value.getSize());
        stmt.bindLong(8, value.getSessionId());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sessions_table";
        return _query;
      }
    };
    this.__preparedStmtOfClearSession = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sessions_table WHERE sessionId == ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final SessionEntity sessionEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSessionEntity.insert(sessionEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final SessionEntity sessionEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfSessionEntity.handle(sessionEntity);
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
  public Object clearSession(final long id, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearSession.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearSession.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getSessionWithId(final long id,
      final Continuation<? super SessionEntity> continuation) {
    final String _sql = "SELECT * FROM sessions_table WHERE sessionId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<SessionEntity>() {
      @Override
      public SessionEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSessionId = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfStartDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_date_time");
          final int _cursorIndexOfEndDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_date_time");
          final int _cursorIndexOfFirstSolveIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "first_solve_index");
          final int _cursorIndexOfLastSolveIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "last_solve_index");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final SessionEntity _result;
          if(_cursor.moveToFirst()) {
            final long _tmpSessionId;
            _tmpSessionId = _cursor.getLong(_cursorIndexOfSessionId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpStartDateTime;
            if (_cursor.isNull(_cursorIndexOfStartDateTime)) {
              _tmpStartDateTime = null;
            } else {
              _tmpStartDateTime = _cursor.getString(_cursorIndexOfStartDateTime);
            }
            final String _tmpEndDateTime;
            if (_cursor.isNull(_cursorIndexOfEndDateTime)) {
              _tmpEndDateTime = null;
            } else {
              _tmpEndDateTime = _cursor.getString(_cursorIndexOfEndDateTime);
            }
            final int _tmpFirstSolveIndex;
            _tmpFirstSolveIndex = _cursor.getInt(_cursorIndexOfFirstSolveIndex);
            final int _tmpLastSolveIndex;
            _tmpLastSolveIndex = _cursor.getInt(_cursorIndexOfLastSolveIndex);
            final int _tmpSize;
            _tmpSize = _cursor.getInt(_cursorIndexOfSize);
            _result = new SessionEntity(_tmpSessionId,_tmpName,_tmpStartDateTime,_tmpEndDateTime,_tmpFirstSolveIndex,_tmpLastSolveIndex,_tmpSize);
          } else {
            _result = null;
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
  public Object getAllSessions(final Continuation<? super List<SessionEntity>> continuation) {
    final String _sql = "SELECT * FROM sessions_table ORDER BY end_date_time ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<SessionEntity>>() {
      @Override
      public List<SessionEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSessionId = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfStartDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_date_time");
          final int _cursorIndexOfEndDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_date_time");
          final int _cursorIndexOfFirstSolveIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "first_solve_index");
          final int _cursorIndexOfLastSolveIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "last_solve_index");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final List<SessionEntity> _result = new ArrayList<SessionEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SessionEntity _item;
            final long _tmpSessionId;
            _tmpSessionId = _cursor.getLong(_cursorIndexOfSessionId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpStartDateTime;
            if (_cursor.isNull(_cursorIndexOfStartDateTime)) {
              _tmpStartDateTime = null;
            } else {
              _tmpStartDateTime = _cursor.getString(_cursorIndexOfStartDateTime);
            }
            final String _tmpEndDateTime;
            if (_cursor.isNull(_cursorIndexOfEndDateTime)) {
              _tmpEndDateTime = null;
            } else {
              _tmpEndDateTime = _cursor.getString(_cursorIndexOfEndDateTime);
            }
            final int _tmpFirstSolveIndex;
            _tmpFirstSolveIndex = _cursor.getInt(_cursorIndexOfFirstSolveIndex);
            final int _tmpLastSolveIndex;
            _tmpLastSolveIndex = _cursor.getInt(_cursorIndexOfLastSolveIndex);
            final int _tmpSize;
            _tmpSize = _cursor.getInt(_cursorIndexOfSize);
            _item = new SessionEntity(_tmpSessionId,_tmpName,_tmpStartDateTime,_tmpEndDateTime,_tmpFirstSolveIndex,_tmpLastSolveIndex,_tmpSize);
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
  public Object getMaxSolveIndex(final Continuation<? super Integer> continuation) {
    final String _sql = "SELECT MAX(last_solve_index) FROM sessions_table ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
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
