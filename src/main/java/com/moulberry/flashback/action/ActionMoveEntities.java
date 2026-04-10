package com.moulberry.flashback.action;

import com.moulberry.flashback.Flashback;
import com.moulberry.flashback.playback.ReplayServer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.Identifier;

public class ActionMoveEntities implements Action {

    private static final Identifier NAME = Flashback.createIdentifier("action/move_entities");
    public static final ActionMoveEntities INSTANCE = new ActionMoveEntities();
    private ActionMoveEntities() {
    }

    @Override
    public Identifier name() {
        return NAME;
    }

    @Override
    public void handle(ReplayServer replayServer, FriendlyByteBuf friendlyByteBuf) {
        replayServer.handleMoveEntities(friendlyByteBuf);
    }

}
