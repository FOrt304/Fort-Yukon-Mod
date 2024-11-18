package github.al0046.fortyukon.entity.custom;

import github.al0046.fortyukon.worldgen.dimension.ModDimensions;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;

public class RocketEntity extends Entity {
    private Level level;

    public RocketEntity(EntityType<? extends RocketEntity> type, Level world) {
        super(type, world);
    }

    protected void defineSynchedData() {}

    protected void readAdditionalSaveData(CompoundTag compound) {}

    protected void addAdditionalSaveData(CompoundTag compound) {}

    public Packet<ClientGamePacketListener> getAddEntityPacket() {
        return new ClientboundAddEntityPacket(this);
    }

    public void tick() {
        super.tick();
        // Handle rocket flight logic
        if (!this.level.isClientSide && this.isAlive()) {
            for (Entity entity : this.level.getEntities(this, new AABB(this.blockPosition()))) {
                if (entity instanceof Player) {
                    Player player = (Player) entity;
                    ServerPlayer serverPlayer = (ServerPlayer) player;
                    ServerLevel targetDimension = serverPlayer.server.getLevel(ModDimensions.KAUPENDIM_LEVEL_KEY);
                    // Logic to teleport the player to the Fort Yukon Planet
                    serverPlayer.teleportTo(targetDimension, serverPlayer.getX(), serverPlayer.getY(), serverPlayer.getZ(), serverPlayer.getYRot(), serverPlayer.getXRot());
                    // Move the rocket entity with the player to the new dimension
                    this.changeDimension(targetDimension);
//                    player.changeDimension(ModDimensions.KAUPENDIM_KEY);
                    this.remove(RemovalReason.DISCARDED);
                }
            }
        }
    }

    //
    // Handle player interaction to start flight
    public InteractionResult interact(Player player, InteractionHand hand) {
        if (!this.level.isClientSide) {
            ServerPlayer serverPlayer = (ServerPlayer) player;
            ServerLevel targetDimension = serverPlayer.server.getLevel(ModDimensions.KAUPENDIM_LEVEL_KEY);
            // Teleport player to Fort Yukon dimension
            serverPlayer.teleportTo(targetDimension, serverPlayer.getX(), serverPlayer.getY(), serverPlayer.getZ(), serverPlayer.getYRot(), serverPlayer.getXRot());
//            player.changeDimension(ModDimensions.KAUPENDIM_KEY);
            // Move the rocket entity with the player to the new dimension
//            this.changeDimension(ModDimensions.KAUPENDIM_KEY);
            this.changeDimension(targetDimension);
        }
        return InteractionResult.SUCCESS;
    }
}