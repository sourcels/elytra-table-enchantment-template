package com.shimaper.elytratench.mixin;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantmentHelper.class)
public class ElytraItemMixin {
    @Inject(method = "canHaveEnchantments", at = @At("HEAD"), cancellable = true)
    private static void canHaveEnchantments(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack != null && stack.isOf(Items.ELYTRA)) {
            cir.setReturnValue(true);
        }
    }
}