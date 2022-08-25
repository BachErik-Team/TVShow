package de.bacherik.tvshow.entities;

import de.bacherik.tvshow.Main;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

    public static void registerEntities() {
        registerEntity("centaur", EntityCentaur.class, Main.ENTITY_CENTAUR, 50, 11437146, 000000);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(new ResourceLocation(Main.appendModID(name)), entity, name, id, Main.INSTANCE, range, 1, true, color1, color2);
    }
}
