package com.skeletor.plugin.javascript.communication.outgoing.audio;

import com.skeletor.plugin.javascript.JSPlugin;
import com.skeletor.plugin.javascript.audio.RoomPlaylist;
import com.skeletor.plugin.javascript.communication.outgoing.OutgoingWebMessage;

public class JukeboxEndComposer extends OutgoingWebMessage {
    public JukeboxEndComposer(int roomId) {
        super("jukebox_end");
        RoomPlaylist roomPlaylist = JSPlugin.getInstance().getRoomAudioManager().getPlaylistForRoom(roomId);
        roomPlaylist.setPlaying(false);
    }
}
