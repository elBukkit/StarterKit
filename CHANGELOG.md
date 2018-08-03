# Changelog for StarterKit (v1.3.8-SNAPSHOT)

2018-08-03 09:12:29 -0700    Remove mcstats, it's super dead. (Nathan Wolf)  
2017-02-12 10:40:49 -0800    Add elMakers repository so we can build (nathan)  
2013-12-15 01:57:17 -0800    prepare for release (James Richardson)  
2013-12-14 07:05:04 -0800    add ability to give kit to specific players (James Richardson)  

**v1.3.6**  
2013-12-14 06:06:01 -0800    added localisation (James Richardson)  
2013-12-14 04:59:06 -0800    update to use latest BukkitUtilities (James Richardson)  

**v1.3.5**  
2013-10-04 11:21:33 -0700    implement configurable logging (James Richardson)  
2013-10-04 11:15:33 -0700    implement plugin update checker (James Richardson)  

**v1.3.4**  
2013-10-04 10:52:57 -0700    prepare for release (James Richardson)  
2013-10-04 10:36:59 -0700    add documentation to config.yml (James Richardson)  
2013-10-04 10:34:36 -0700    update to use latest utilities (James Richardson)  

**v1.3.3**  
2013-05-31 18:26:50 -0700    prepare for release (James Richardson)  
2013-05-31 18:25:38 -0700    fix missing localisation key (James Richardson)  

**v1.3.2**  
2013-05-31 18:06:20 -0700    finished updating (James Richardson)  
2013-05-31 13:14:23 -0700    finish updating (James Richardson)  
2013-05-31 12:41:37 -0700    1st stage of the update process (James Richardson)  
2013-05-31 12:34:00 -0700    update pom to shade utilities correctly (James Richardson)  
2013-05-19 09:44:33 -0700    update changelog (James Richardson)  
2013-03-28 07:07:07 -0700    added gh-pages as a submodule (James Richardson)  
2013-03-28 07:06:06 -0700    remove old site directory (James Richardson)  

**v1.3.1**  
2013-03-28 06:53:17 -0700    changelog (James Richardson)  
2013-03-28 06:37:05 -0700    update to use latest BukkitUtilities (James Richardson)  

**v1.3.0**  
2012-12-29 19:48:39 -0800    prepare to release (James Richardson)  
2012-12-29 19:46:23 -0800    forgot to change this (James Richardson)  
2012-12-29 19:46:03 -0800    clean up (James Richardson)  
2012-12-29 19:43:17 -0800    missing localisation message (James Richardson)  
2012-12-29 19:40:52 -0800    fix bug with listener not registering correctly (James Richardson)  
2012-12-29 19:28:03 -0800    fix bug registering listeners (James Richardson)  
2012-12-29 18:03:14 -0800    build against latest Bukkit (James Richardson)  
2012-12-29 18:02:08 -0800    fix comment mistake (James Richardson)  
2012-12-29 17:58:29 -0800    option to grant kits on death, fixes [#21](https://github.com/grandwazir/StarterKit/starter-kit/issues/21) (James Richardson)  
2012-12-29 17:54:27 -0800    PlayerJoinListener -> PlayerListener (James Richardson)  
2012-12-29 17:53:48 -0800    add configuration option to give kit on death (James Richardson)  
2012-12-29 17:47:38 -0800    update readme (James Richardson)  
2012-12-14 15:01:35 -0800    builds cleanly (James Richardson)  

**v1.2.5**  
2012-08-07 22:29:19 -0700    fix configuration not being loaded (James Richardson)  
2012-08-06 16:35:00 -0700    update to 4.1.0 (James Richardson)  
2012-08-06 16:13:27 -0700    update pom (James Richardson)  

**v1.2.4**  
2012-08-02 03:01:53 -0700    update to parent pom (James Richardson)  

**v1.2.3**  
2012-07-29 10:59:49 -0700    updated changelog (James Richardson)  
2012-07-29 10:18:48 -0700    preparing for snapshot testing (James Richardson)  
2012-07-29 09:24:16 -0700    allow disabing stats collection (James Richardson)  
2012-07-26 15:10:59 -0700    fix never calling the event for metrics (James Richardson)  
2012-07-26 12:57:01 -0700    another key reference (James Richardson)  
2012-07-26 12:45:27 -0700    update description fix bug OutOfBounds exception (James Richardson)  
2012-07-26 12:30:39 -0700    NPE starting metrics (James Richardson)  
2012-07-26 12:16:10 -0700    more replacement tokens (James Richardson)  
2012-07-26 12:12:26 -0700    updating localisation (James Richardson)  
2012-07-26 12:07:50 -0700    actually changed my mind (James Richardson)  
2012-07-26 12:07:21 -0700    move event to kit subpackage (James Richardson)  
2012-07-26 12:06:43 -0700    remove trailing line (James Richardson)  
2012-07-26 12:06:28 -0700    add option to opt out of stats collection (James Richardson)  
2012-07-26 12:05:27 -0700    change author and website (James Richardson)  
2012-07-26 12:04:01 -0700    add event handler (James Richardson)  
2012-07-26 12:03:08 -0700    listener now registers itself (James Richardson)  
2012-07-26 12:02:30 -0700    establish metrics (James Richardson)  
2012-07-26 11:51:33 -0700    move Kit related functions into seperate package - add and fire StarterKitGrantedEvent (James Richardson)  
2012-07-26 11:44:47 -0700    added metrics listener (James Richardson)  

**v1.2.2**  
2012-06-18 13:39:33 -0700    updating changelog (James Richardson)  
2012-06-18 13:35:39 -0700    Fix not all references matching the new name (James Richardson)  
2012-06-18 13:27:58 -0700    fix [#15](https://github.com/grandwazir/StarterKit/starter-kit/issues/15): rename the method loadListeners() -> to registerEvents() (James Richardson)  

**v1.2.1**  
2012-06-17 06:38:21 -0700    fix [#14](https://github.com/grandwazir/StarterKit/starter-kit/issues/14); IndexOutOfBoundsException when granting ArmourKits (James Richardson)  

**v1.2.0**  
2012-06-15 13:59:28 -0700    set debugging to false (James Richardson)  
2012-06-15 13:57:39 -0700    Added updater ability (James Richardson)  
2012-06-15 13:54:44 -0700    convert to use new library (James Richardson)  

**v1.1.2**  
2012-04-27 15:09:14 -0700    preparing to release (James Richardson)  
2012-04-27 15:04:05 -0700    Ensure capacity in list, fixes [#6](https://github.com/grandwazir/StarterKit/starter-kit/issues/6) (James Richardson)  

**v1.1.1**  
2012-04-24 11:47:02 -0700    preparing to release (James Richardson)  
2012-04-24 11:39:08 -0700    Fix for occasional NPE when loading StarterKit (James Richardson)  
2012-04-20 19:50:50 -0700    code clean up (James Richardson)  
2012-04-20 19:46:57 -0700    merged READMES (James Richardson)  

**v1.1.0**  
2012-04-20 19:31:18 -0700    updated README (James Richardson)  
2012-04-20 19:29:33 -0700    added automated version bumping (James Richardson)  
2012-04-20 19:28:32 -0700    Preparing for release (James Richardson)  
2012-04-20 19:12:14 -0700    fixed several bugs (James Richardson)  
2012-04-20 18:19:10 -0700    updated ListCommand (James Richardson)  
2012-04-20 18:13:14 -0700    Removed ReloadCommand, configuration file is not intended to be edited manually (James Richardson)  
2012-04-20 18:11:45 -0700    Allow users to assign any item to any item slot. Fixes [#2](https://github.com/grandwazir/StarterKit/starter-kit/issues/2) (James Richardson)  
2012-04-20 17:58:32 -0700    fixed a bug in serializing the wrong object (James Richardson)  
2012-04-20 17:35:57 -0700    Fixed bug in SaveCommand (James Richardson)  
2012-04-20 17:25:06 -0700    fixed issue when setting defaults (James Richardson)  
2012-04-20 17:11:26 -0700    fixed issue when generating defaults (James Richardson)  
2012-04-20 17:08:18 -0700    implements new inventory template feature (James Richardson)  
2012-04-20 16:47:39 -0700    split kit into two for serialization (James Richardson)  
2012-04-20 16:07:05 -0700    created new save and load commands (James Richardson)  
2012-04-20 16:00:14 -0700    delete old commands (James Richardson)  

**v1.0.3**  
2012-03-24 17:07:19 -0700    Build aganist the latest version of BukkitUtilities to fix a possible MethodNotFound exception (James Richardson)  
2012-03-03 06:23:07 -0800    renamed readme (James Richardson)  
2012-03-03 06:22:46 -0800    updated to new style README (James Richardson)  
2012-03-03 06:10:13 -0800    added custom site (James Richardson)  

**v1.0.2**  
2012-03-03 06:05:04 -0800    odd description in POM, re-releasing (James Richardson)  
2012-03-03 05:59:07 -0800    forgot to update description (James Richardson)  
2012-03-03 05:57:18 -0800    Preparing to release (James Richardson)  
2012-03-03 05:41:56 -0800    fix NPE in PlayerJoinListener (James Richardson)  
2012-03-03 05:37:30 -0800    minor grammer fix (James Richardson)  
2012-03-03 05:35:39 -0800    AddCommand now properly honours amounts (James Richardson)  
2012-03-03 05:34:27 -0800    add ChatColor to reply for ReloadCommand (James Richardson)  
2012-03-03 05:32:42 -0800    Allow lower case material types (James Richardson)  
2012-03-03 05:29:27 -0800    Allow console to use all commands (James Richardson)  
2012-03-03 05:27:55 -0800    added kit summary to log when enabling (James Richardson)  
2012-03-03 05:25:20 -0800    fix missing key exception (James Richardson)  
2012-03-03 05:23:37 -0800    load ResourceBundle before Configuration (James Richardson)  
2012-03-03 05:22:03 -0800    fix missing message key (James Richardson)  
2012-03-03 05:17:41 -0800    code cleanup (James Richardson)  
2012-03-03 05:16:45 -0800    remove unused imports (James Richardson)  
2012-03-03 05:16:04 -0800    updated RemoveCommand (James Richardson)  
2012-03-03 05:08:25 -0800    updated ReloadCommand (James Richardson)  
2012-03-03 05:02:48 -0800    Updated AddCommand and ListCommand (James Richardson)  
2012-03-03 04:25:06 -0800    added localisaton, updated main plugin class (James Richardson)  
2012-03-03 04:08:34 -0800    Updated to new Listening API (James Richardson)  
2012-03-03 03:40:19 -0800    updated POM (James Richardson)  

**v1.0.1**  
2012-02-01 22:12:02 -0800    built against new version of bukkit-utilities (James Richardson)  
2012-02-01 21:55:00 -0800    bumped version number (James Richardson)  
2012-02-01 21:54:21 -0800    converted to use maven (James Richardson)  
2011-12-23 20:03:28 -0800    typo (James Richardson)  
2011-12-23 19:54:12 -0800    add licence file (James Richardson)  
2011-12-23 19:53:55 -0800    copyright notices (James Richardson)  
2011-12-23 19:52:53 -0800    added readme (James Richardson)  
2011-12-23 19:45:19 -0800    first commit (James Richardson)  
