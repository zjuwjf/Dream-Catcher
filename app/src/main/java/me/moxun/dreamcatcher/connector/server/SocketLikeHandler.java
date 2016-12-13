package me.moxun.dreamcatcher.connector.server;

import android.net.LocalSocket;

import java.io.IOException;

/**
 * Similar to {@link SocketHandler} but designed to operate on {@link SocketLike} instances
 * which allow for buffered "peeks" of data to decide which protocol handler to use.
 *
 * @see SocketHandler
 * @see SocketLike
 */
public interface SocketLikeHandler {
  /** @see SocketHandler#onAccepted(LocalSocket) */
  void onAccepted(SocketLike socket) throws IOException;
}
