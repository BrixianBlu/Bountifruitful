package net.brixian.bountfruitful.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class BountifruitfulFoodComponents {

    public static final FoodComponent EYERANA = new FoodComponent.Builder().nutrition(5).saturationModifier(1)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 120, 4), 0.5F).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100), 1.0F).build();

    public static final FoodComponent MANGOSTEEN = new FoodComponent.Builder().nutrition(7).saturationModifier(4).build();

}

