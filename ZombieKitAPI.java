package me.perfectly.megawalls;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class ZombieKitAPI {
	
	public static ItemStack zombie;
	public static ItemMeta zombiemeta;
	public static ItemStack zombiePot;
	public static ItemMeta zombiePotmeta;
	
	@SuppressWarnings("deprecation")
	public static void Zombie9(Player p) {
		p.getInventory().clear();
		KitAPI.setKit(p, "Zombie");
		p.setMaxHealth(40);
		p.setHealth(40);
		p.getInventory().setHelmet(new ItemStack(Material.AIR));
		p.getInventory().setChestplate(new ItemStack(Material.AIR));
		p.getInventory().setLeggings(new ItemStack(Material.AIR));
		p.getInventory().setBoots(new ItemStack(Material.AIR));
		p.getActivePotionEffects().clear();
		ItemStack ZombieChest = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ZombieChest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		ItemMeta ZombieChestMeta = ZombieChest.getItemMeta();
		ZombieChestMeta.setDisplayName("§bZombie Chestplate");
		ZombieChest.setItemMeta(ZombieChestMeta);
		p.getInventory().setChestplate(ZombieChest);
		p.getActivePotionEffects().clear();
		ItemStack ZombieSword = new ItemStack(Material.IRON_SWORD);
		ZombieSword.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		ItemMeta ZombieSwordMeta = ZombieSword.getItemMeta();
		ZombieSwordMeta.setDisplayName("§bZombie Sword");
		ZombieSword.setItemMeta(ZombieSwordMeta);
		p.getInventory().setItem(0, ZombieSword);
		Potion heal = new Potion(PotionType.INSTANT_HEAL);
		zombiePot = new ItemStack(Material.POTION);
        heal.apply(zombiePot);
        zombiePotmeta = (PotionMeta) zombiePot.getItemMeta();
        zombiePotmeta.setDisplayName("§bZombie Potion of Heal §7(10 §c❤§7)");
        zombiePot.setItemMeta(zombiePotmeta);
        p.getInventory().setItem(1, zombiePot);
		Potion speed = new Potion(PotionType.SPEED);
        ItemStack potion1 = new ItemStack(Material.POTION, 2);
        speed.apply(potion1);
        PotionMeta meta1 = (PotionMeta) potion1.getItemMeta();
        meta1.setDisplayName("§bZombie Potion of Speed II");
        meta1.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 15 * 20, 1), false);
        potion1.setItemMeta(meta1);
        p.getInventory().setItem(2, potion1);
		p.updateInventory();
	}
	
	@SuppressWarnings("deprecation")
	public static void Zombie8(Player p) {
		p.getInventory().clear();
		KitAPI.setKit(p, "Zombie");
		p.setMaxHealth(40);
		p.setHealth(40);
		p.getInventory().setHelmet(new ItemStack(Material.AIR));
		p.getInventory().setChestplate(new ItemStack(Material.AIR));
		p.getInventory().setLeggings(new ItemStack(Material.AIR));
		p.getInventory().setBoots(new ItemStack(Material.AIR));
		p.getActivePotionEffects().clear();
		ItemStack ZombieChest = new ItemStack(Material.IRON_CHESTPLATE);
		ZombieChest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		ItemMeta ZombieChestMeta = ZombieChest.getItemMeta();
		ZombieChestMeta.setDisplayName("§bZombie Chestplate");
		ZombieChest.setItemMeta(ZombieChestMeta);
		p.getInventory().setChestplate(ZombieChest);
		p.getActivePotionEffects().clear();
		ItemStack ZombieSword = new ItemStack(Material.IRON_SWORD);
		ZombieSword.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		ItemMeta ZombieSwordMeta = ZombieSword.getItemMeta();
		ZombieSwordMeta.setDisplayName("§bZombie Sword");
		ZombieSword.setItemMeta(ZombieSwordMeta);
		p.getInventory().setItem(0, ZombieSword);
		Potion heal = new Potion(PotionType.INSTANT_HEAL);
		zombiePot = new ItemStack(Material.POTION);
        heal.apply(zombiePot);
        zombiePotmeta = (PotionMeta) zombiePot.getItemMeta();
        zombiePotmeta.setDisplayName("§bZombie Potion of Heal §7(10 §c❤§7)");
        zombiePot.setItemMeta(zombiePotmeta);
        p.getInventory().setItem(1, zombiePot);
		Potion speed = new Potion(PotionType.SPEED);
        ItemStack potion1 = new ItemStack(Material.POTION, 2);
        speed.apply(potion1);
        PotionMeta meta1 = (PotionMeta) potion1.getItemMeta();
        meta1.setDisplayName("§bZombie Potion of Speed II");
        meta1.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 15 * 20, 1), false);
        potion1.setItemMeta(meta1);
        p.getInventory().setItem(2, potion1);
		p.updateInventory();
	}
	
	@SuppressWarnings("deprecation")
	public static void Zombie7(Player p) {
		p.getInventory().clear();
		KitAPI.setKit(p, "Zombie");
		p.setMaxHealth(40);
		p.setHealth(40);
		p.getInventory().setHelmet(new ItemStack(Material.AIR));
		p.getInventory().setChestplate(new ItemStack(Material.AIR));
		p.getInventory().setLeggings(new ItemStack(Material.AIR));
		p.getInventory().setBoots(new ItemStack(Material.AIR));
		p.getActivePotionEffects().clear();
		ItemStack ZombieChest = new ItemStack(Material.IRON_CHESTPLATE);
		ZombieChest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		ItemMeta ZombieChestMeta = ZombieChest.getItemMeta();
		ZombieChestMeta.setDisplayName("§bZombie Chestplate");
		ZombieChest.setItemMeta(ZombieChestMeta);
		p.getInventory().setChestplate(ZombieChest);
		p.getActivePotionEffects().clear();
		ItemStack ZombieSword = new ItemStack(Material.STONE_SWORD);
		ZombieSword.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		ItemMeta ZombieSwordMeta = ZombieSword.getItemMeta();
		ZombieSwordMeta.setDisplayName("§bZombie Sword");
		ZombieSword.setItemMeta(ZombieSwordMeta);
		p.getInventory().setItem(0, ZombieSword);
		Potion heal = new Potion(PotionType.INSTANT_HEAL);
		zombiePot = new ItemStack(Material.POTION);
        heal.apply(zombiePot);
        zombiePotmeta = (PotionMeta) zombiePot.getItemMeta();
        zombiePotmeta.setDisplayName("§bZombie Potion of Heal §7(8 §c❤§7)");
        zombiePot.setItemMeta(zombiePotmeta);
        p.getInventory().setItem(1, zombiePot);
		Potion speed = new Potion(PotionType.SPEED);
        ItemStack potion1 = new ItemStack(Material.POTION, 2);
        speed.apply(potion1);
        PotionMeta meta1 = (PotionMeta) potion1.getItemMeta();
        meta1.setDisplayName("§bZombie Potion of Speed II");
        meta1.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 15 * 20, 1), false);
        potion1.setItemMeta(meta1);
        p.getInventory().setItem(2, potion1);
		p.updateInventory();
	}
	
	@SuppressWarnings("deprecation")
	public static void Zombie6(Player p) {
		p.getInventory().clear();
		KitAPI.setKit(p, "Zombie");
		p.setMaxHealth(40);
		p.setHealth(40);
		p.getInventory().setHelmet(new ItemStack(Material.AIR));
		p.getInventory().setChestplate(new ItemStack(Material.AIR));
		p.getInventory().setLeggings(new ItemStack(Material.AIR));
		p.getInventory().setBoots(new ItemStack(Material.AIR));
		p.getActivePotionEffects().clear();
		ItemStack ZombieChest = new ItemStack(Material.IRON_CHESTPLATE);
		ZombieChest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		ItemMeta ZombieChestMeta = ZombieChest.getItemMeta();
		ZombieChestMeta.setDisplayName("§bZombie Chestplate");
		ZombieChest.setItemMeta(ZombieChestMeta);
		p.getInventory().setChestplate(ZombieChest);
		p.getActivePotionEffects().clear();
		ItemStack ZombieSword = new ItemStack(Material.STONE_SWORD);
		ZombieSword.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		ItemMeta ZombieSwordMeta = ZombieSword.getItemMeta();
		ZombieSwordMeta.setDisplayName("§bZombie Sword");
		ZombieSword.setItemMeta(ZombieSwordMeta);
		p.getInventory().setItem(0, ZombieSword);
		Potion heal = new Potion(PotionType.INSTANT_HEAL);
		zombiePot = new ItemStack(Material.POTION);
        heal.apply(zombiePot);
        zombiePotmeta = (PotionMeta) zombiePot.getItemMeta();
        zombiePotmeta.setDisplayName("§bZombie Potion of Heal §7(8 §c❤§7)");
        zombiePot.setItemMeta(zombiePotmeta);
        p.getInventory().setItem(1, zombiePot);
		Potion speed = new Potion(PotionType.SPEED);
        ItemStack potion1 = new ItemStack(Material.POTION);
        speed.apply(potion1);
        PotionMeta meta1 = (PotionMeta) potion1.getItemMeta();
        meta1.setDisplayName("§bZombie Potion of Speed II");
        meta1.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 15 * 20, 1), false);
        potion1.setItemMeta(meta1);
        p.getInventory().setItem(2, potion1);
		p.updateInventory();
	}
	
	@SuppressWarnings("deprecation")
	public static void Zombie5(Player p) {
		p.getInventory().clear();
		KitAPI.setKit(p, "Zombie");
		p.setMaxHealth(40);
		p.setHealth(40);
		p.getInventory().setHelmet(new ItemStack(Material.AIR));
		p.getInventory().setChestplate(new ItemStack(Material.AIR));
		p.getInventory().setLeggings(new ItemStack(Material.AIR));
		p.getInventory().setBoots(new ItemStack(Material.AIR));
		p.getActivePotionEffects().clear();
		ItemStack ZombieChest = new ItemStack(Material.IRON_CHESTPLATE);
		ZombieChest.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 1);
		ItemMeta ZombieChestMeta = ZombieChest.getItemMeta();
		ZombieChestMeta.setDisplayName("§bZombie Chestplate");
		ZombieChest.setItemMeta(ZombieChestMeta);
		p.getInventory().setChestplate(ZombieChest);
		p.getActivePotionEffects().clear();
		ItemStack ZombieSword = new ItemStack(Material.WOOD_SWORD);
		ZombieSword.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		ItemMeta ZombieSwordMeta = ZombieSword.getItemMeta();
		ZombieSwordMeta.setDisplayName("§bZombie Sword");
		ZombieSword.setItemMeta(ZombieSwordMeta);
		p.getInventory().setItem(0, ZombieSword);
		Potion heal = new Potion(PotionType.INSTANT_HEAL);
		zombiePot = new ItemStack(Material.POTION);
        heal.apply(zombiePot);
        zombiePotmeta = (PotionMeta) zombiePot.getItemMeta();
        zombiePotmeta.setDisplayName("§bZombie Potion of Heal §7(8 §c❤§7)");
        zombiePot.setItemMeta(zombiePotmeta);
        p.getInventory().setItem(1, zombiePot);
		Potion speed = new Potion(PotionType.SPEED);
        ItemStack potion1 = new ItemStack(Material.POTION);
        speed.apply(potion1);
        PotionMeta meta1 = (PotionMeta) potion1.getItemMeta();
        meta1.setDisplayName("§bZombie Potion of Speed II");
        meta1.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 15 * 20, 1), false);
        potion1.setItemMeta(meta1);
        p.getInventory().setItem(2, potion1);
		p.updateInventory();
	}
	
	@SuppressWarnings("deprecation")
	public static void Zombie4(Player p) {
		p.getInventory().clear();
		KitAPI.setKit(p, "Zombie");
		p.setMaxHealth(40);
		p.setHealth(40);
		p.getInventory().setHelmet(new ItemStack(Material.AIR));
		p.getInventory().setChestplate(new ItemStack(Material.AIR));
		p.getInventory().setLeggings(new ItemStack(Material.AIR));
		p.getInventory().setBoots(new ItemStack(Material.AIR));
		p.getActivePotionEffects().clear();
		ItemStack ZombieChest = new ItemStack(Material.IRON_CHESTPLATE);
		ZombieChest.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 1);
		ItemMeta ZombieChestMeta = ZombieChest.getItemMeta();
		ZombieChestMeta.setDisplayName("§bZombie Chestplate");
		ZombieChest.setItemMeta(ZombieChestMeta);
		p.getInventory().setChestplate(ZombieChest);
		p.getActivePotionEffects().clear();
		ItemStack ZombieSword = new ItemStack(Material.WOOD_SWORD);
		ZombieSword.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		ItemMeta ZombieSwordMeta = ZombieSword.getItemMeta();
		ZombieSwordMeta.setDisplayName("§bZombie Sword");
		ZombieSword.setItemMeta(ZombieSwordMeta);
		p.getInventory().setItem(0, ZombieSword);
		Potion heal = new Potion(PotionType.INSTANT_HEAL);
		zombiePot = new ItemStack(Material.POTION);
        heal.apply(zombiePot);
        zombiePotmeta = (PotionMeta) zombiePot.getItemMeta();
        zombiePotmeta.setDisplayName("§bZombie Potion of Heal §7(8 §c❤§7)");
        zombiePot.setItemMeta(zombiePotmeta);
        p.getInventory().setItem(1, zombiePot);
		p.updateInventory();
	}
	
	@SuppressWarnings("deprecation")
	public static void Zombie3(Player p) {
		p.getInventory().clear();
		KitAPI.setKit(p, "Zombie");
		p.setMaxHealth(40);
		p.setHealth(40);
		p.getInventory().setHelmet(new ItemStack(Material.AIR));
		p.getInventory().setChestplate(new ItemStack(Material.AIR));
		p.getInventory().setLeggings(new ItemStack(Material.AIR));
		p.getInventory().setBoots(new ItemStack(Material.AIR));
		p.getActivePotionEffects().clear();
		ItemStack ZombieChest = new ItemStack(Material.IRON_CHESTPLATE);
		ZombieChest.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 1);
		ItemMeta ZombieChestMeta = ZombieChest.getItemMeta();
		ZombieChestMeta.setDisplayName("§bZombie Chestplate");
		ZombieChest.setItemMeta(ZombieChestMeta);
		p.getInventory().setChestplate(ZombieChest);
		p.getActivePotionEffects().clear();
		ItemStack ZombieSword = new ItemStack(Material.WOOD_SWORD);
		ZombieSword.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		ItemMeta ZombieSwordMeta = ZombieSword.getItemMeta();
		ZombieSwordMeta.setDisplayName("§bZombie Sword");
		ZombieSword.setItemMeta(ZombieSwordMeta);
		p.getInventory().setItem(0, ZombieSword);
		p.updateInventory();
	}
	
	@SuppressWarnings("deprecation")
	public static void Zombie2(Player p) {
		p.getInventory().clear();
		KitAPI.setKit(p, "Zombie");
		p.setMaxHealth(40);
		p.setHealth(40);
		p.getInventory().setHelmet(new ItemStack(Material.AIR));
		p.getInventory().setChestplate(new ItemStack(Material.AIR));
		p.getInventory().setLeggings(new ItemStack(Material.AIR));
		p.getInventory().setBoots(new ItemStack(Material.AIR));
		p.getActivePotionEffects().clear();
		ItemStack ZombieChest = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ZombieChest.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 1);
		ItemMeta ZombieChestMeta = ZombieChest.getItemMeta();
		ZombieChestMeta.setDisplayName("§bZombie Chestplate");
		ZombieChest.setItemMeta(ZombieChestMeta);
		p.getInventory().setChestplate(ZombieChest);
		p.getActivePotionEffects().clear();
		ItemStack ZombieSword = new ItemStack(Material.WOOD_SWORD);
		ZombieSword.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		ItemMeta ZombieSwordMeta = ZombieSword.getItemMeta();
		ZombieSwordMeta.setDisplayName("§bZombie Sword");
		ZombieSword.setItemMeta(ZombieSwordMeta);
		p.getInventory().setItem(0, ZombieSword);
		p.updateInventory();
	}
	
	@SuppressWarnings("deprecation")
	public static void Zombie1(Player p) {
		p.getInventory().clear();
		KitAPI.setKit(p, "Zombie");
		p.setMaxHealth(40);
		p.setHealth(40);
		p.getInventory().setHelmet(new ItemStack(Material.AIR));
		p.getInventory().setChestplate(new ItemStack(Material.AIR));
		p.getInventory().setLeggings(new ItemStack(Material.AIR));
		p.getInventory().setBoots(new ItemStack(Material.AIR));
		p.getActivePotionEffects().clear();
		ItemStack ZombieChest = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta ZombieChestMeta = ZombieChest.getItemMeta();
		ZombieChestMeta.setDisplayName("§bZombie Chestplate");
		ZombieChest.setItemMeta(ZombieChestMeta);
		p.getInventory().setChestplate(ZombieChest);
		ItemStack ZombieSword = new ItemStack(Material.WOOD_SWORD);
		ZombieSword.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		ItemMeta ZombieSwordMeta = ZombieSword.getItemMeta();
		ZombieSwordMeta.setDisplayName("§bZombie Sword");
		ZombieSword.setItemMeta(ZombieSwordMeta);
		p.getInventory().setItem(0, ZombieSword);
		p.updateInventory();
	}
}
