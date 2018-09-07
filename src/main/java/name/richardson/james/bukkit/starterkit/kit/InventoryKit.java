/*******************************************************************************
 * Copyright (c) 2012 James Richardson.
 * 
 * InventoryKit.java is part of StarterKit.
 * 
 * StarterKit is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * StarterKit is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * StarterKit. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package name.richardson.james.bukkit.starterkit.kit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

@SerializableAs("InventoryKit")
public class InventoryKit implements ConfigurationSerializable, Kit {

  public static InventoryKit deserialize(final Map<String, Object> map) {
    final List<ItemStack> items = new ArrayList<ItemStack>(36);
    for (final String key : map.keySet()) {
      try {
        // to get around the fact that the class description appears first in
        // the map.
        if (key.startsWith("==")) {
          continue;
        }
        // Ensure we have capacity in the list
        int slot = Integer.parseInt(key);
        while (items.size() <= slot) {
          items.add(null);
        }
        items.set(slot, (ItemStack) map.get(key));
      } catch (final ClassCastException e) {
        e.printStackTrace();
      }
    }
    return new InventoryKit(items);
  }

  private final ItemStack[] items;

  public InventoryKit() {
    this.items = new ItemStack[0];
  }

  public InventoryKit(final List<ItemStack> items) {
    this.items = items.toArray(new ItemStack[items.size()]);
  }

  public InventoryKit(final PlayerInventory inventory) {
    ItemStack[] items = inventory.getContents();;
    this.items = new ItemStack[items.length];
    for (int i = 0; i < items.length; i++) {
      ItemStack item = items[i];
      if (item != null) {
        this.items[i] = item.clone();
      }
    }
  }

  public ItemStack[] getContents() {
    return this.items.clone();
  }

  public int getItemCount() {
    int n = 0;
    for (final ItemStack item : this.items) {
      if (item == null) {
        continue;
      }
      n++;
    }
    return n;
  }

  public Map<String, Object> serialize() {
    final Map<String, Object> map = new HashMap<String, Object>();
    int slot = -1;
    for (final ItemStack item : this.items) {
      slot++;
      if (item == null) {
        continue;
      }
      map.put(Integer.toString(slot), item);
    }
    return map;
  }

}
