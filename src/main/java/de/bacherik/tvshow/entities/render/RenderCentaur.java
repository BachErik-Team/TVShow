package de.bacherik.tvshow.entities.render;

import de.bacherik.tvshow.Main;
import de.bacherik.tvshow.entities.EntityCentaur;
import de.bacherik.tvshow.entities.model.ModelCentaur;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderCentaur extends RenderLiving<EntityCentaur> {


    private static final ResourceLocation TEXTURES = new ResourceLocation(Main.appendModID("textures/entity/centaur.png"));

    public RenderCentaur(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCentaur(), 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityCentaur entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityCentaur entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
}
