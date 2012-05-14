import java.util.logging.Logger;

public class GrieferNerf extends Plugin
{
  public static String name = "GrieferNerf";
  public static String version = "v3.3";
  public static String creator = "rymate1234";
  public static String updater = "spenk";
  public static Logger log = Logger.getLogger("Minecraft");

  public void disable() {
    log.info(name + " version " + version + " by " + creator + " updated by " + updater + " is disabled!");
    log.warning("YOU HAVE DISABLED GrieferNerf! YOU ARE NOW AT RISK OF GRIEFING");
  }

  public void enable()
  {
    log.info(name + " version " + version + " by " + creator + " updated by " + updater + " is enabled!");
  }

  public void initialize()
  {
    GrieferNerfListener listener = new GrieferNerfListener();
    listener.loadConfiguration();
    etc.getLoader().addListener(PluginLoader.Hook.IGNITE, listener, this, PluginListener.Priority.MEDIUM);

    etc.getLoader().addListener(PluginLoader.Hook.EXPLODE, listener, this, PluginListener.Priority.MEDIUM);

    etc.getLoader().addListener(PluginLoader.Hook.COMMAND, listener, this, PluginListener.Priority.MEDIUM);

    etc.getLoader().addListener(PluginLoader.Hook.OPEN_INVENTORY, listener, this, PluginListener.Priority.MEDIUM);

    etc.getLoader().addListener(PluginLoader.Hook.BLOCK_BROKEN, listener, this, PluginListener.Priority.MEDIUM);

    etc.getLoader().addListener(PluginLoader.Hook.BLOCK_PLACE, listener, this, PluginListener.Priority.MEDIUM);

    etc.getLoader().addListener(PluginLoader.Hook.SIGN_CHANGE, listener, this, PluginListener.Priority.MEDIUM);

    etc.getLoader().addListener(PluginLoader.Hook.EXPLODE, listener, this, PluginListener.Priority.MEDIUM);

    etc.getLoader().addListener(PluginLoader.Hook.LIQUID_DESTROY, listener, this, PluginListener.Priority.MEDIUM);
    
    etc.getLoader().addListener(PluginLoader.Hook.PORTAL_CREATE, listener, this, PluginListener.Priority.MEDIUM);
    
    etc.getLoader().addListener(PluginLoader.Hook.ENDERMAN_PICKUP, listener, this, PluginListener.Priority.MEDIUM);
    
    etc.getLoader().addListener(PluginLoader.Hook.FLOW, listener, this, PluginListener.Priority.MEDIUM);

    log.info(name + " version " + version + " by " + creator + " updated by " + updater + " is initialized!");
  }
}