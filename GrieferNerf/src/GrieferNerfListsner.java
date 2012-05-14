class GrieferNerfListener extends PluginListener
{
  private PropertiesFile properties = new PropertiesFile("GrieferNerf.properties");
  private boolean blockTNT;
  private boolean blockCreepers;
  private boolean blockFire;
  private boolean blockTNTPlacement;
  private boolean blockghasts;
  private boolean blockenderman;
  private boolean blockportals;
  private boolean blocklava;
  private boolean blockwater;
  
  
  public boolean onIgnite(Block block, Player player)
  {
    return (blockFire) && (block.getStatus() == 3);
  }
  public void loadConfiguration() {
	blockwater = properties.getBoolean("block-water-flow",false);
	  
	blocklava = properties.getBoolean("block-lava-flow",true);
	  
    blockFire = properties.getBoolean("block-fire-spread", true);

    blockCreepers = properties.getBoolean("block-creeper-explode", true);

    blockTNT = properties.getBoolean("block-tnt-explode", true);

    blockTNTPlacement = properties.getBoolean("block-tnt-placement", true);

    blockghasts = properties.getBoolean("block-ghasts", true);
    
    blockenderman = properties.getBoolean("block-enderman",true);
    
    blockportals= properties.getBoolean("block-portal-creatment",true);
  }

  public boolean onOpenInventory(Player player, Inventory inv) {
    if (inv.getContentsSize() == 54) {
      DoubleChest dchest = (DoubleChest)inv;
      Block block = dchest.getBlock();
      Block s = player.getWorld().getBlockAt(block.getX(), block.getY() + 1, block.getZ());
      Block s1 = block.getWorld().getBlockAt(block.getX() + 1, block.getY() + 1, block.getZ());
      Block s2 = block.getWorld().getBlockAt(block.getX() - 1, block.getY() + 1, block.getZ());
      Block s3 = block.getWorld().getBlockAt(block.getX(), block.getY() + 1, block.getZ() + 1);
      Block s4 = block.getWorld().getBlockAt(block.getX(), block.getY() + 1, block.getZ() - 1);
      if ((s.getType() == 63) || (s.getType() == 68)) {
        Sign sign = (Sign)player.getWorld().getComplexBlock(s.getX(), s.getY(), s.getZ());
        if (sign.getText(0).equalsIgnoreCase("[SafeChest]")) {
          if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin")))
          {
            player.sendMessage("§2Safe opened.");
            return false;
          }
          player.sendMessage("§4you cant open this chest!");
          return true;
        }
      }

      if ((s1.getType() == 63) || (s1.getType() == 68)) {
        Sign sign = (Sign)player.getWorld().getComplexBlock(s1.getX(), s1.getY(), s1.getZ());
        if (sign.getText(0).equalsIgnoreCase("[SafeChest]")) {
          if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin")))
          {
            player.sendMessage("§2Safe opened.");
            return false;
          }
          player.sendMessage("§4you cant open this chest!");
          return true;
        }
      }

      if ((s2.getType() == 63) || (s2.getType() == 68)) {
        Sign sign = (Sign)player.getWorld().getComplexBlock(s2.getX(), s2.getY(), s2.getZ());
        if (sign.getText(0).equalsIgnoreCase("[SafeChest]")) {
          if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin")))
          {
            player.sendMessage("§2Safe opened.");
            return false;
          }
          player.sendMessage("§4you cant open this chest!");
          return true;
        }
      }

      if ((s3.getType() == 63) || (s3.getType() == 68)) {
        Sign sign = (Sign)player.getWorld().getComplexBlock(s3.getX(), s3.getY(), s3.getZ());
        if (sign.getText(0).equalsIgnoreCase("[SafeChest]")) {
          if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin")))
          {
            player.sendMessage("§2Safe opened.");
            return false;
          }
          player.sendMessage("§4you cant open this chest!");
          return true;
        }
      }

      if ((s4.getType() == 63) || (s4.getType() == 68)) {
        Sign sign = (Sign)player.getWorld().getComplexBlock(s4.getX(), s4.getY(), s4.getZ());
        if (sign.getText(0).equalsIgnoreCase("[SafeChest]")) {
          if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin")))
          {
            player.sendMessage("§2Safe opened.");
            return false;
          }
          player.sendMessage("§4you cant open this chest!");
          return true;
        }
      }
    }

    if (inv.getContentsSize() == 27) {
      Chest chest = (Chest)inv;
      Block block = chest.getBlock();
      Block s = player.getWorld().getBlockAt(block.getX(), block.getY() + 1, block.getZ());

      if ((s.getType() == 63) || (s.getType() == 68)) {
        Sign sign = (Sign)player.getWorld().getComplexBlock(block.getX(), block.getY()+1, block.getZ());

        if (sign.getText(0).equalsIgnoreCase("[SafeChest]")) {
          if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin")))
          {
            player.sendMessage("§2Safe opened.");
            return false;
          }
          player.sendMessage("§4you cant open this chest!");
          return true;
        }

      }

    }

    return false;
  }

  public boolean onBlockBreak(Player player, Block block) {
    Block bs0 = block.getWorld().getBlockAt(block.getX(), block.getY() + 1, block.getZ());
    Block bs1 = block.getWorld().getBlockAt(block.getX() + 1, block.getY() + 1, block.getZ());
    Block bs2 = block.getWorld().getBlockAt(block.getX() - 1, block.getY() + 1, block.getZ());
    Block bs3 = block.getWorld().getBlockAt(block.getX(), block.getY() + 1, block.getZ() - 1);
    Block bs4 = block.getWorld().getBlockAt(block.getX(), block.getY() + 1, block.getZ() + 1);
    Block bs5 = block.getWorld().getBlockAt(block.getX() + 1, block.getY(), block.getZ());
    Block bs6 = block.getWorld().getBlockAt(block.getX() - 1, block.getY(), block.getZ());
    Block bs7 = block.getWorld().getBlockAt(block.getX(), block.getY(), block.getZ() - 1);
    Block bs8 = block.getWorld().getBlockAt(block.getX(), block.getY(), block.getZ() + 1);
    if ((block.getType() == 63) || (block.getType() == 68)) {
      Sign sign = (Sign)player.getWorld().getComplexBlock(block.getX(), block.getY(), block.getZ());
      if ((sign.getText(0).equals("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
        if ((sign.getText(1).equals(player.getName())) || (sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
          player.sendMessage("§2[SafeChest]: sign sucsessfully destroyed");
          return false;
        }
        player.sendMessage("§4[SafeChest]: you are not allowed to break this sign!");
        return true;
      }
    }

    if ((block.getType() == 54) && (
      (bs0.getType() == 63) || (bs0.getType() == 68))) {
      Sign sign = (Sign)block.getWorld().getComplexBlock(bs0.getX(), bs0.getY(), bs0.getZ());
      if ((sign.getText(0).equals("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
        if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
          player.sendMessage("§2[SafeChest]: chest sucsessfully destroyed.");
          return false;
        }
        player.sendMessage("§4[SafeChest]: you are not allowed to break this chest!");
        return true;
      }
    }

    if ((block.getType() == 54) && (
      (bs1.getType() == 63) || (bs1.getType() == 68))) {
      Sign sign = (Sign)block.getWorld().getComplexBlock(bs1.getX(), bs1.getY(), bs1.getZ());
      if ((sign.getText(0).equals("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
        if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
          player.sendMessage("§2[SafeChest]: chest sucsessfully destroyed.");
          return false;
        }
        player.sendMessage("§4[SafeChest]: you are not allowed to break this chest!");
        return true;
      }
    }

    if ((block.getType() == 54) && (
      (bs2.getType() == 63) || (bs2.getType() == 68))) {
      Sign sign = (Sign)block.getWorld().getComplexBlock(bs2.getX(), bs2.getY(), bs2.getZ());
      if ((sign.getText(0).equals("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
        if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
          player.sendMessage("§2[SafeChest]: chest sucsessfully destroyed.");
          return false;
        }
        player.sendMessage("§4[SafeChest]: you are not allowed to break this chest!");
        return true;
      }
    }

    if ((block.getType() == 54) && (
      (bs3.getType() == 63) || (bs3.getType() == 68))) {
      Sign sign = (Sign)block.getWorld().getComplexBlock(bs3.getX(), bs3.getY(), bs3.getZ());
      if ((sign.getText(0).equals("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
        if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
          player.sendMessage("§2[SafeChest]: chest sucsessfully destroyed.");
          return false;
        }
        player.sendMessage("§4[SafeChest]: you are not allowed to break this chest!");
        return true;
      }
    }

    if ((block.getType() == 54) && (
      (bs4.getType() == 63) || (bs4.getType() == 68))) {
      Sign sign = (Sign)block.getWorld().getComplexBlock(bs4.getX(), bs4.getY(), bs4.getZ());
      if ((sign.getText(0).equals("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
        if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
          player.sendMessage("§2[SafeChest]: chest sucsessfully destroyed.");
          return false;
        }
        player.sendMessage("§4[SafeChest]: you are not allowed to break this chest!");
        return true;
      }
    }

    if ((block.getType() == block.getType()) && (
      (bs5.getType() == 68) || (bs5.getType() == 63))) {
      Sign sign = (Sign)block.getWorld().getComplexBlock(bs5.getX(), bs5.getY(), bs5.getZ());
      if ((sign.getText(0).equals("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
        if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
          player.sendMessage("§2[SafeChest]: block sucsessfully destroyed.");
          return false;
        }
        player.sendMessage("§4[SafeChest]: you are not allowed to break this block!");
        return true;
      }
    }

    if ((block.getType() == block.getType()) && (
      (bs6.getType() == 68) || (bs6.getType() == 63))) {
      Sign sign = (Sign)block.getWorld().getComplexBlock(bs6.getX(), bs6.getY(), bs6.getZ());
      if ((sign.getText(0).equals("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
        if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
          player.sendMessage("§2[SafeChest]: block sucsessfully destroyed.");
          return false;
        }
        player.sendMessage("§4[SafeChest]: you are not allowed to break this block!");
        return true;
      }
    }

    if ((block.getType() == block.getType()) && (
      (bs7.getType() == 68) || (bs7.getType() == 63))) {
      Sign sign = (Sign)block.getWorld().getComplexBlock(bs7.getX(), bs7.getY(), bs7.getZ());
      if ((sign.getText(0).equals("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
        if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
          player.sendMessage("§2[SafeChest]: block sucsessfully destroyed.");
          return false;
        }
        player.sendMessage("§4[SafeChest]: you are not allowed to break this block!");
        return true;
      }
    }

    if ((block.getType() == block.getType()) && (
      (bs8.getType() == 68) || (bs8.getType() == 63))) {
      Sign sign = (Sign)block.getWorld().getComplexBlock(bs8.getX(), bs8.getY(), bs8.getZ());
      if ((sign.getText(0).equals("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
        if ((sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (sign.getText(1).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
          player.sendMessage("§2[SafeChest]: block sucsessfully destroyed.");
          return false;
        }
        player.sendMessage("§4[SafeChest]: you are not allowed to break this block!");
        return true;
      }
    }

    return false;
  }
  public boolean onSignChange(Player player, Sign sign) {
    if ((sign.getText(0).equals("[SafeChest]")) || (sign.getText(0).equals("[safechest]"))) {
      if (player.canUseCommand("/safechestcreate")) {
        player.sendMessage("§2You have created a safe chest!");
        if ((!sign.getText(1).equals("")) && (!sign.getText(2).equals("")) && (!sign.getText(3).equals("")))
        {
          player.sendMessage("§2Players who can use [SafeChest]: " + sign.getText(1) + " & " + sign.getText(2) + " & " + sign.getText(3));
        }
        else if ((!sign.getText(1).equals("")) && (!sign.getText(2).equals("")) && (sign.getText(3).equals("")))
        {
          player.sendMessage("§2Players who can use [SafeChest]: " + sign.getText(1) + " & " + sign.getText(2));
        }
        else if ((!sign.getText(1).equals("")) && (sign.getText(2).equals("")) && (sign.getText(3).equals("")))
        {
          player.sendMessage("§2Players who can use [SafeChest]: " + sign.getText(1));
        }
        if ((!sign.getText(1).equals(player.getName())) || (!sign.getText(2).equals(player.getName())) || (!sign.getText(3).equals(player.getName()))) {
          player.sendMessage("§4[SafeChest]: OWNER NOT FOUND!");
          player.sendMessage("§4[SafeChest]: PUTTING NAME ON EMPTY LINE OR LINE 1!");
          if (sign.getText(1).isEmpty()) sign.setText(1, player.getName()); else if (sign.getText(3).isEmpty()) sign.setText(3, player.getName()); else if (sign.getText(2).isEmpty()) sign.setText(2, player.getName()); else sign.setText(1, player.getName());
          if (sign.getText(0).equals("[safechest]")) {
            sign.setText(0, "[SafeChest]");
            sign.update();
            return false;
          }
        }
      } else {
        player.sendMessage("§4[SafeChest]: you are not allowed to create a [SafeChest] sign!");
        return true;
      }
    }
    
    if ((sign.getText(0).equals("[PublicChest]"))||(sign.getText(0).equals("[publicchest]"))){
    	if (player.canUseCommand("/publicchestcreate")){
    	if(sign.getText(1).equals(player.getName())){
    		player.sendMessage("§2You have created a public chest!");
    		sign.setText(1, "[PublicChest]");
    		sign.update();
    		return false;
    	}else{
    		player.sendMessage("§4[SafeChest]: OWNER NOT FOUND!");
    		player.sendMessage("§4[SafeChest]: PUTTING NAME ON LINE 1!");
    		player.sendMessage("§2 sign will be created tho :P.");
    		sign.setText(1, player.getName());
    		sign.setText(0, "[PublicChest]");
    		sign.update();
    		return false;
    	}
    	}else{
            player.sendMessage("§4[SafeChest]: you are not allowed to create a [PublicChest] sign!");
            return true;
    	}
    }
    if (sign.getText(0).equalsIgnoreCase("[SafeFurnace]")) {
        if (player.canUseCommand("/safefurnacecreate")) {
          player.sendMessage("§2You have created a safe chest!");
          if ((!sign.getText(1).equals("")) && (!sign.getText(2).equals("")) && (!sign.getText(3).equals("")))
          {
            player.sendMessage("§2Players who can use [SafeFurnace]: " + sign.getText(1) + " & " + sign.getText(2) + " & " + sign.getText(3));
          }
          else if ((!sign.getText(1).equals("")) && (!sign.getText(2).equals("")) && (sign.getText(3).equals("")))
          {
            player.sendMessage("§2Players who can use [SafeFurnace]: " + sign.getText(1) + " & " + sign.getText(2));
          }
          else if ((!sign.getText(1).equals("")) && (sign.getText(2).equals("")) && (sign.getText(3).equals("")))
          {
            player.sendMessage("§2Players who can use [SafeFurnace]: " + sign.getText(1));
          }
          if ((!sign.getText(1).equals(player.getName())) || (!sign.getText(2).equals(player.getName())) || (!sign.getText(3).equals(player.getName()))) {
            player.sendMessage("§4[SafeFurnace]: OWNER NOT FOUND!");
            player.sendMessage("§4[SafeFurnace]: PUTTING NAME ON EMPTY LINE OR LINE 1!");
            if (sign.getText(1).isEmpty()) sign.setText(1, player.getName()); else if (sign.getText(3).isEmpty()) sign.setText(3, player.getName()); else if (sign.getText(2).isEmpty()) sign.setText(2, player.getName()); else sign.setText(1, player.getName());
            if (sign.getText(0).equalsIgnoreCase("[safeFurnace]")) {
              sign.setText(0, "[SafeFurnace]");
              sign.update();
              return false;
            }
          }
        } else {
          player.sendMessage("§4[SafeChest]: you are not allowed to create a [SafeChest] sign!");
          return true;
        }
      }
    return false;
  }

  public boolean onBlockPlace(Player player, Block bp, Block bc, Item item) {
    if ((this.blockTNTPlacement) && (bp.getType() == 46)) {
      player.sendMessage("§cTNT PLACEMENT HAS BEEN DISABLED ON THIS SERVER!");
      return true;
    }
    Block bxp = player.getWorld().getBlockAt(bp.getX()+1, bp.getY(), bp.getZ());
    Block bxm = player.getWorld().getBlockAt(bp.getX()-1, bp.getY(), bp.getZ());
    Block bzp = player.getWorld().getBlockAt(bp.getX(), bp.getY(), bp.getZ()+1);
    Block bzm = player.getWorld().getBlockAt(bp.getX(), bp.getY(), bp.getZ()-1);
    
    if ((bp.getType() == 63) || (bp.getType() == 68)){
    	if ((bxp.getType() == 63) || (bxp.getType() == 68)){
    		Sign sign = (Sign)player.getWorld().getComplexBlock(bxp.getX(), bxp.getY(), bxp.getZ());
    		if ((sign.getText(0).equalsIgnoreCase("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
    			if ((sign.getText(1).equals(player.getName())) || (sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
                player.sendMessage("§2doublechest linked, created and updated.");
                return false;
              }
            player.sendMessage("§4You are not allowed to place this sign here!");
            return true;
    	}
    }
    }
    
	if ((bp.getType() == 63) || (bp.getType() == 68)){
		if ((bxm.getType() == 63) || (bxm.getType() == 68)){
			Sign sign = (Sign)player.getWorld().getComplexBlock(bxm.getX(), bxm.getY(), bxm.getZ());
    		if ((sign.getText(0).equalsIgnoreCase("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
    			if ((sign.getText(1).equals(player.getName())) || (sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
                player.sendMessage("§2doublechest linked, created and updated.");
                return false;
              }
    			player.sendMessage("§4You are not allowed to place this sign here!");
            return true;
    	}	
		}
	}
	
	if ((bp.getType() == 63) || (bp.getType() == 68)){
		if ((bzp.getType() == 63) || (bzp.getType() == 68)){
			Sign sign = (Sign)player.getWorld().getComplexBlock(bzp.getX(), bzp.getY(), bzp.getZ());
    		if ((sign.getText(0).equalsIgnoreCase("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
    			if ((sign.getText(1).equals(player.getName())) || (sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
                player.sendMessage("§2doublechest linked, created and updated.");
                return false;
              }
    			player.sendMessage("§4You are not allowed to place this sign here!");
            return true;
    	}	
		}
	}

	if ((bp.getType() == 63) || (bp.getType() == 68)){
		if ((bzm.getType() == 63) || (bzm.getType() == 68)){
			Sign sign = (Sign)player.getWorld().getComplexBlock(bzm.getX(), bzm.getY(), bzm.getZ());
    		if ((sign.getText(0).equalsIgnoreCase("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
    			if ((sign.getText(1).equals(player.getName())) || (sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
                player.sendMessage("§2doublechest linked, created and updated.");
                return false;
              }
    			player.sendMessage("§4You are not allowed to place this sign here!");
            return true;
    	}	
		}
	}
    
    Block bx = player.getWorld().getBlockAt(bp.getX() + 1, bp.getY(), bp.getZ());
    Block bxx = player.getWorld().getBlockAt(bp.getX() - 1, bp.getY(), bp.getZ());
    Block bz = player.getWorld().getBlockAt(bp.getX(), bp.getY(), bp.getZ() + 1);
    Block bzz = player.getWorld().getBlockAt(bp.getX(), bp.getY(), bp.getZ() - 1);
    if (bp.getType() == 54) {
      if (bx.getType() == 54) {
        Block bs = player.getWorld().getBlockAt(bx.getX(), bx.getY() + 1, bx.getZ());

        if ((bs.getType() == 63) || (bs.getType() == 68)) {
          Sign sign = (Sign)player.getWorld().getComplexBlock(bs.getX(), bs.getY(), bs.getZ());

          if ((sign.getText(0).equalsIgnoreCase("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
            if ((sign.getText(1).equals(player.getName())) || (sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
              player.sendMessage("§2doublechest linked, created and updated.");
              return false;
            }
            player.sendMessage("§4You are not allowed to create a doublechest over a safe!");
            return true;
          }
        }
      }

      if (bxx.getType() == 54) {
        Block bs = player.getWorld().getBlockAt(bxx.getX(), bxx.getY() + 1, bxx.getZ());

        if ((bs.getType() == 63) || (bs.getType() == 68)) {
          Sign sign = (Sign)player.getWorld().getComplexBlock(bs.getX(), bs.getY(), bs.getZ());

          if ((sign.getText(0).equalsIgnoreCase("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
            if ((sign.getText(1).equals(player.getName())) || (sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
              player.sendMessage("§2doublechest linked, created and updated.");
              return false;
            }
            player.sendMessage("§4You are not allowed to create a doublechest over a safe!");
            return true;
          }
        }
      }

      if (bz.getType() == 54) {
        Block bs = player.getWorld().getBlockAt(bz.getX(), bz.getY() + 1, bz.getZ());

        if ((bs.getType() == 63) || (bs.getType() == 68)) {
          Sign sign = (Sign)player.getWorld().getComplexBlock(bs.getX(), bs.getY(), bs.getZ());

          if ((sign.getText(0).equalsIgnoreCase("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
            if ((sign.getText(1).equals(player.getName())) || (sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
              player.sendMessage("§2doublechest linked, created and updated.");
              return false;
            }
            player.sendMessage("§4You are not allowed to create a doublechest over a safe!");
            return true;
          }
        }
      }

      if (bzz.getType() == 54) {
        Block bs = player.getWorld().getBlockAt(bzz.getX(), bzz.getY() + 1, bzz.getZ());

        if ((bs.getType() == 63) || (bs.getType() == 68)) {
          Sign sign = (Sign)player.getWorld().getComplexBlock(bs.getX(), bs.getY(), bs.getZ());

          if ((sign.getText(0).equalsIgnoreCase("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
            if ((sign.getText(1).equals(player.getName())) || (sign.getText(2).equals(player.getName())) || (sign.getText(3).equals(player.getName())) || (player.canUseCommand("/safechestadmin"))) {
              player.sendMessage("§2doublechest linked, created and updated.");
              return false;
            }
            player.sendMessage("§4You are not allowed to create a doublechest over a safe!");
            return true;
          }
        }
      }
    }

    return false;
  }

  public PluginLoader.HookResult onLiquidDestroy(PluginLoader.HookResult currentState, int liquidBlockId, Block tb, Player player)
  {
    if ((tb.getType() == 63) || (tb.getType() == 68)) {
      Sign sign = (Sign)player.getWorld().getComplexBlock(tb.getX(), tb.getY(), tb.getZ());

      if ((sign.getText(0).equalsIgnoreCase("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
        tb.setType(tb.getType());
        player.getWorld().setBlock(tb);
      }
    }
    return currentState;
  }

  public boolean onExplode(Block block) {
    for (int x = -10; x < 10; x++) {
      for (int y = -10; y < 10; y++) {
        for (int z = -10; z < 10; z++) {
          int type = block.getWorld().getBlockIdAt(block.getX() + x, block.getY() + y, block.getZ() + z);

          if ((type == 63) || (type == 68)) {
            Block b = block.getWorld().getBlockAt(block.getX() + x, block.getY() + y, block.getZ() + z);

            Sign sign = (Sign)block.getWorld().getComplexBlock(b.getX(), b.getY(), b.getZ());

            if ((sign.getText(0).equalsIgnoreCase("[SafeChest]")) || (sign.getText(0).equals("[PublicChest]"))) {
              return true;
            }
          }
        }
      }
    }
    if ((blockCreepers) && (block.getStatus() == 2)) {
      return true;
    }
    if ((blockghasts) && (block.getStatus() == 3)) {
      return true;
    }
    return (blockTNT) && (block.getStatus() == 1);
  }
  
public boolean onPortalCreate(Block[][] blocks){
return blockportals;
}

public boolean onEndermanPickup(Enderman entity,Block block){
	return blockenderman;
}

public boolean onFlow(Block block,Block block2){
	if (block.getType() == 8 && block2.getType() == 9){
		return blockwater;
	}
	if (block.getType() == 10 && block2.getType() == 11){
		return blocklava;
	}
	return false;
}
}