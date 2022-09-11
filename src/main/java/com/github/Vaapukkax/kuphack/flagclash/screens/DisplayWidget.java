package com.github.Vaapukkax.kuphack.flagclash.screens;

import java.util.Arrays;
import java.util.List;

import com.github.Vaapukkax.kuphack.flagclash.widgets.Widget;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;

public class DisplayWidget implements Widget {

	private final String name;
	private final Item icon;
	
	public DisplayWidget(String name, Item icon) {
		this.name = name;
		this.icon = icon;
	}
	
	@Override
	public int getX() {
		return 0;
	}

	@Override
	public int getY() {
		return 0;
	}

	@Override
	public ItemStack getIcon() {
		ItemStack stack = new ItemStack(icon);
		MutableText text = Text.literal(name);
		text = text.setStyle(text.getStyle().withItalic(false));
		stack.setCustomName(text);
		return stack;
	}

	@Override
	public List<Text> getDescription() {
		return Arrays.asList();
	}

}
